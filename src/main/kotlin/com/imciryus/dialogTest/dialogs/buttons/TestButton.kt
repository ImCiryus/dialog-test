package com.imciryus.dialogTest.dialogs.buttons

import io.papermc.paper.registry.data.dialog.ActionButton
import io.papermc.paper.registry.data.dialog.action.DialogAction
import net.kyori.adventure.text.Component
import net.kyori.adventure.text.event.ClickEvent

class TestButton() {

    companion object {
        //val label: Component, val tooltip: Component?, val width: Int, val action: DialogAction
        val action: DialogAction = DialogAction.staticAction(ClickEvent.runCommand("kill"))

        val b: ActionButton = ActionButton.create(
            Component.text("Test"),
            null,
            10,
            action
        )
    }

}