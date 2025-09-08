package com.imciryus.dialogTest.dialogs

import io.papermc.paper.dialog.Dialog
import io.papermc.paper.registry.data.dialog.DialogBase
import io.papermc.paper.registry.data.dialog.type.DialogType
import net.kyori.adventure.text.Component
import org.bukkit.entity.Player

class TestDialog {

    companion object {

        val testDialog: Dialog = Dialog.create{factory ->
            factory.empty()
                .base(DialogBase.builder(Component.text("Test")).build())
                .type(DialogType.notice())
        }

        fun showDialog(player: Player) {
            player.showDialog(testDialog)
        }
    }

}