package com.imciryus.dialogTest.commands

import com.imciryus.dialogTest.dialogs.TestDialog
import org.bukkit.command.Command
import org.bukkit.command.CommandExecutor
import org.bukkit.command.CommandSender
import org.bukkit.entity.Player

class TestDialogCommand: CommandExecutor {
    override fun onCommand(sender: CommandSender, command: Command, string: String, args: Array<out String>): Boolean {
        if (sender !is Player) return true
        TestDialog.showDialog(sender)
        return true
    }
}