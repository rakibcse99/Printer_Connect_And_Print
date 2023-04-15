package com.rakib.printerconnectandprint

import android.app.Application
import com.mazenrashed.printooth.Printooth

class App: Application() {
    override fun onCreate() {
        super.onCreate()
        Printooth.init(this)
    }
}