package com.jgsilveira.shoppinglist.kmp.counter

import androidx.datastore.core.DataStore
import androidx.datastore.preferences.core.Preferences
import com.jgsilveira.shoppinglist.kmp.DATA_STORE_FILE_NAME
import com.jgsilveira.shoppinglist.kmp.provideDataStore
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.IO
import org.koin.compose.viewmodel.dsl.viewModelOf
import org.koin.core.module.dsl.factoryOf
import org.koin.dsl.module

val counterKoinModule = module {
    factory<DataStore<Preferences>> {
        provideDataStore(
            filePath = DATA_STORE_FILE_NAME
        )
    }

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