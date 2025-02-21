package com.jgsilveira.shoppinglist.kmp.di

import com.jgsilveira.shoppinglist.kmp.counter.counterKoinModule
import org.koin.core.context.startKoin
import org.koin.dsl.KoinAppDeclaration

fun initKoin(config: KoinAppDeclaration? = null) {
    startKoin {
        config?.invoke(this)
        modules(counterKoinModule)
    }
}