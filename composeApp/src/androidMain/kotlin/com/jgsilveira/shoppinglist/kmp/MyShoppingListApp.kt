package com.jgsilveira.shoppinglist.kmp

import android.app.Application
import com.jgsilveira.shoppinglist.kmp.counter.counterKoinModule
import com.jgsilveira.shoppinglist.kmp.di.initKoin
import org.koin.android.ext.koin.androidContext
import org.koin.core.context.startKoin
import org.koin.dsl.module

internal class MyShoppingListApp : Application() {

    override fun onCreate() {
        super.onCreate()
        initKoin(
            definition = {
                androidContext(this@MyShoppingListApp)
            }
        )
    }
}