package com.jgsilveira.shoppinglist.kmp.di

import com.jgsilveira.shoppinglist.kmp.counter.counterKoinModule
import com.jgsilveira.shoppinglist.kmp.preferences.platformKoinModule
import org.koin.core.context.startKoin
import org.koin.core.module.Module
import org.koin.dsl.KoinAppDeclaration

fun initKoin(
    definition: KoinAppDeclaration = {},
    additionalModules: List<Module> = emptyList()
) {
    startKoin {
        definition.invoke(this)
        modules(additionalModules + platformKoinModule + counterKoinModule)
    }
}