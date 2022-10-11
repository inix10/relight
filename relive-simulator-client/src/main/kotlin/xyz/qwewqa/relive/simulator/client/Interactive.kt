@file:OptIn(DelicateCoroutinesApi::class)

package xyz.qwewqa.relive.simulator.client

import kotlinx.browser.document
import kotlinx.coroutines.DelicateCoroutinesApi
import kotlinx.coroutines.GlobalScope
import kotlinx.coroutines.launch
import kotlinx.dom.clear
import kotlinx.html.*
import kotlinx.html.dom.append
import kotlinx.html.js.div
import kotlinx.html.js.onClickFunction
import org.w3c.dom.HTMLElement
import org.w3c.dom.HTMLSpanElement
import xyz.qwewqa.relive.simulator.common.*

fun updateInteractiveUi(simulation: InteractiveSimulation, status: InteractiveQueueStatus?) {
    updateTopBar(status)
    updateTimeline(simulation, status)
    updateActs(simulation, status)
    updateMemoirs(simulation, status)
}

private fun updateTopBar(status: InteractiveQueueStatus?) {
    val turnText = document.getElementById("interactive-turn-text") as HTMLSpanElement
    turnText.textContent = "${status?.turn ?: 0}/${status?.maxTurns ?: 0}"
}

private fun updateTimeline(simulation: InteractiveSimulation, status: InteractiveQueueStatus?) {
    val timelineContainer = document.getElementById("interactive-timeline-container") as HTMLElement

    timelineContainer.clear()

    if (status == null) {
        return
    }

    fun TagConsumer<HTMLElement>.cardImage(index: Int, card: ActCardStatus) {
        div("interactive-timeline-image-container") {
            div("interactive-queue-image-container") {
                img(classes = "queue-actor-img") { src = "img/large_icon/1_${card.dressId}.png" }
                img(classes = "queue-act-img") { src = "img/skill_icon/skill_icon_${card.iconId}.png" }
                if (card.isSupport) {
                    img(classes = "queue-support-indicator") { src = "img/common/icon_support_dress.png" }
                }
                onClickFunction = {
                    GlobalScope.launch {
                        simulation.sendCommand("unqueue #${index + 1}")
                    }
                }
            }
        }
    }

    timelineContainer.append {
        div("interactive-timeline-connector-bg") { }
        status.queue.forEachIndexed { i, card ->
            val type = when {
                card.isClimax -> "interactive-timeline-climax"
                else -> "interactive-timeline-normal"
            }
            when (card.cost) {
                1 -> {
                    div("interactive-timeline-item $type") {
                        cardImage(i, card)
                    }
                }

                2 -> {
                    div("interactive-timeline-item $type") {
                        div("interactive-timeline-connector-start")
                        div("interactive-timeline-marker") { }
                        onClickFunction = {
                            GlobalScope.launch {
                                simulation.sendCommand("unqueue #${i + 1}")
                            }
                        }
                    }
                    div("interactive-timeline-item $type") {
                        div("interactive-timeline-connector-end")
                        cardImage(i, card)
                    }
                }

                else -> {
                    div("interactive-timeline-item $type") {
                        div("interactive-timeline-connector-start")
                        div("interactive-timeline-marker") { }
                        onClickFunction = {
                            GlobalScope.launch {
                                simulation.sendCommand("unqueue #${i + 1}")
                            }
                        }
                    }
                    repeat(card.cost - 2) {
                        div("interactive-timeline-item $type") {
                            div("interactive-timeline-connector-middle")
                            div("interactive-timeline-marker") { }
                            onClickFunction = {
                                GlobalScope.launch {
                                    simulation.sendCommand("unqueue #${i + 1}")
                                }
                            }
                        }
                    }
                    div("interactive-timeline-item $type") {
                        div("interactive-timeline-connector-end")
                        cardImage(i, card)
                    }
                }
            }
        }
        repeat(6 - status.queue.sumOf { it.cost }) {
            div("interactive-timeline-item interactive-timeline-empty") {
                div("interactive-timeline-marker") { }
            }
        }
    }
}

private fun updateActs(simulation: InteractiveSimulation, status: InteractiveQueueStatus?) {
    val interactiveActsRow = document.getElementById("interactive-acts-row") as HTMLElement

    interactiveActsRow.clear()

    if (status == null) {
        return
    }

    fun TagConsumer<HTMLElement>.act(card: ActCardStatus?) {
        div(
            "interactive-act ${
                when (card?.status) {
                    ActionStatus.QUEUED -> "interactive-act-queued"
                    ActionStatus.TOO_EXPENSIVE -> "interactive-act-too-expensive"
                    else -> ""
                }
            }"
        ) {
            div("interactive-queue-image-container") {
                if (card == null) {
                    img(classes = "queue-actor-img") { src = "img/common/icon_empty_large.png" }
                } else {
                    img(classes = "queue-actor-img") { src = "img/large_icon/1_${card.dressId}.png" }
                    img(classes = "queue-act-img") { src = "img/skill_icon/skill_icon_${card.iconId}.png" }
                    if (card.isSupport) {
                        img(classes = "queue-support-indicator") { src = "img/common/icon_support_dress.png" }
                    }
                    span(
                        "queue-act-cost ${
                            when {
                                card.cost > card.baseCost -> "queue-act-cost-up"
                                card.cost < card.baseCost -> "queue-act-cost-down"
                                else -> ""
                            }
                        }"
                    ) {
                        +card.cost.toString()
                    }
                    when (card.status) {
                        ActionStatus.READY -> onClickFunction = {
                            GlobalScope.launch {
                                simulation.sendCommand("queue ${card.handIndex}")
                            }
                        }

                        ActionStatus.QUEUED -> onClickFunction = {
                            GlobalScope.launch {
                                simulation.sendCommand("unqueue ${card.handIndex}")
                            }
                        }

                        else -> {}
                    }
                    if (card.status == ActionStatus.TOO_EXPENSIVE) {
                        span("queue-act-too-expensive-text") { +"C" }
                    }
                }
            }
            button(
                classes = "btn btn-sm ${
                    when {
                        card == null || card.status == ActionStatus.HELD -> "btn-secondary"
                        card.isClimax -> "btn-secondary interactive-act-button-climax"
                        status.hold != null -> "btn-warning"
                        else -> "btn-primary"
                    }
                } interactive-act-button"
            ) {
                role = "button"
                i(
                    "bi ${
                        when {
                            card == null || card.status == ActionStatus.HELD -> "bi-archive"
                            card.isClimax -> "bi-stars"
                            status.hold != null -> "bi-arrow-bar-down"
                            else -> "bi-arrow-bar-up"
                        }
                    }"
                )
                if (card == null || card.status == ActionStatus.HELD || card.status == ActionStatus.QUEUED || card.isClimax || !status.holdAction) {
                    disabled = true
                } else {
                    onClickFunction = if (status.hold != null) {
                        {
                            GlobalScope.launch {
                                simulation.sendCommand("discard ${card.handIndex}")
                            }
                        }
                    } else {
                        {
                            GlobalScope.launch {
                                simulation.sendCommand("hold ${card.handIndex}")
                            }
                        }
                    }
                }
            }
        }
    }

    interactiveActsRow.append {
        button(
            classes = "btn btn-secondary ${
                when {
                    status.canClimax -> "interactive-climax-button-available"
                    status.climaxTurns > 0 -> "interactive-climax-button-activated"
                    else -> ""
                }
            }"
        ) {
            role = "button"
            id = "interactive-climax-button"
            when {
                status.canClimax -> {
                    div {
                        +"CA"
                    }
                }
                status.climaxTurns > 0 -> {
                    div {
                        +"${status.climaxTurns}"
                    }
                }
            }
            onClickFunction = {
                GlobalScope.launch {
                    simulation.sendCommand("climax")
                }
            }
            disabled = !status.canClimax
        }
        div {
            id = "interactive-hold-container"
            act(status.hold)
        }
        div {
            id = "interactive-acts-container"
            status.hand.forEach { act(it) }
        }
    }
}

private fun updateMemoirs(simulation: InteractiveSimulation, status: InteractiveQueueStatus?) {
    val memoirCostText = document.getElementById("interactive-available-memoir-cost-text") as HTMLSpanElement
    val remainingCost = (status?.cutinCostMax ?: 0) - (status?.cutinCostUsed ?: 0)
    memoirCostText.textContent = "$remainingCost"

    val interactiveMemoirsContainer = document.getElementById("interactive-memoirs-container") as HTMLElement

    interactiveMemoirsContainer.clear()

    if (status == null) {
        return
    }

    fun TagConsumer<HTMLElement>.memoir(cutin: CutinCardStatus) {
        div("interactive-memoir") {
            div(
                "interactive-memoir-image-container ${
                    when(cutin.status) {
                        ActionStatus.QUEUED -> "interactive-memoir-queued"
                        ActionStatus.TOO_EXPENSIVE -> "interactive-memoir-too-expensive"
                        ActionStatus.HOLDER_EXITED -> "interactive-memoir-holder-exited"
                        ActionStatus.COOLDOWN -> "interactive-memoir-cooldown"
                        ActionStatus.NO_MORE_USES -> "interactive-memoir-no-more-uses"
                        else -> ""
                    }
                }"
            ) {
                img(classes = "interactive-memoir-img") { src = "img/large_icon/2_${cutin.memoirId}.png" }
                img(classes = "interactive-memoir-actor-img") { src = "img/large_icon/1_${cutin.dressId}.png" }
                if (cutin.isSupport) {
                    img(classes = "interactive-memoir-support-indicator") { src = "img/common/icon_support_dress.png" }
                }
                span("interactive-memoir-cost-text") {
                    +"${cutin.cost}"
                }
                span("interactive-memoir-uses-text") {
                    +"${cutin.maxUses - cutin.useCount}/${cutin.maxUses}"
                }
                when (cutin.status) {
                    ActionStatus.READY -> {
                        onClickFunction = {
                            GlobalScope.launch {
                                simulation.sendCommand("cutin ${cutin.actorName}")
                            }
                        }
                    }

                    ActionStatus.QUEUED -> {
                        onClickFunction = {
                            GlobalScope.launch {
                                simulation.sendCommand("cutin ${cutin.actorName}")
                            }
                        }
                    }

                    ActionStatus.COOLDOWN -> {
                        span("interactive-memoir-cooldown-text") {
                            +"${cutin.remainingColdown}t"
                        }
                    }

                    ActionStatus.TOO_EXPENSIVE -> {
                        span("interactive-memoir-too-expensive-text") {
                            +"C"
                        }
                    }

                    ActionStatus.HOLDER_EXITED -> {
                        span("interactive-memoir-holder-exited-text") {
                            +"X"
                        }
                    }

                    else -> {}
                }
            }
        }
    }

    interactiveMemoirsContainer.append {
        status.cutins.forEach { memoir(it) }
    }
}
