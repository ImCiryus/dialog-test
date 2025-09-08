package com.imciryus.dialogTest

import com.imciryus.dialogTest.commands.TestDialogCommand
import org.bukkit.plugin.java.JavaPlugin

class DialogTest : JavaPlugin() {

    override fun onEnable() {
        // Plugin startup logic
        server.consoleSender.sendMessage("Dialog Test startet")
        getCommand("testdiag")?.setExecutor(TestDialogCommand())
    }

    override fun onDisable() {
        // Plugin shutdown logic
    }
}
