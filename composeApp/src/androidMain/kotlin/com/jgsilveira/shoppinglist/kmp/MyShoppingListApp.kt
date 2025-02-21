package com.jgsilveira.shoppinglist.kmp

import android.app.Application
import com.jgsilveira.shoppinglist.kmp.counter.counterKoinModule
import org.koin.core.context.startKoin

internal class MyShoppingListApp : Application() {

    override fun onCreate() {
        super.onCreate()
        startKoin {
            modules(counterKoinModule)
        }
    }
}