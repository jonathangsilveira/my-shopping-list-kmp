package com.jgsilveira.shoppinglist.kmp.counter

import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.IO
import org.koin.compose.viewmodel.dsl.viewModelOf
import org.koin.dsl.module

val counterKoinModule = module {
    factory {
        GetCounterAsFlowUseCase(
            dataStore = get()
        )
    }

    factory {
        UpdateCounterValueUseCase(
            dataStore = get(),
            dispatcher = Dispatchers.IO
        )
    }

    viewModelOf(::CounterViewModel)
}