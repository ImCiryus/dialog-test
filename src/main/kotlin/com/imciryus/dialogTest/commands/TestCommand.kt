package com.imciryus.dialogTest.commands

import org.bukkit.command.Command
import org.bukkit.command.CommandExecutor
import org.bukkit.command.CommandSender

class TestCommand : CommandExecutor {
    override fun onCommand(sender: CommandSender, cmd: Command, s: String, args: Array<out String>): Boolean {
        sender.sendMessage("Test successful")
        return true
    }
}