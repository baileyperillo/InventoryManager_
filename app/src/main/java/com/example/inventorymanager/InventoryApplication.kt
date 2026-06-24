package com.example.inventorymanager

import android.app.Application
import com.example.inventorymanager.data.AppContainer
import com.example.inventorymanager.data.AppDataContainer

class InventoryApplication : Application() {
    lateinit var container: AppContainer

    override fun onCreate() {
        super.onCreate()
        container = AppDataContainer(this)
    }
}