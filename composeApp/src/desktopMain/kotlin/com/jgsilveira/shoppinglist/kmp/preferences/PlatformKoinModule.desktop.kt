package com.jgsilveira.shoppinglist.kmp.preferences

import com.jgsilveira.shoppinglist.kmp.DATA_STORE_FILE_NAME
import com.jgsilveira.shoppinglist.kmp.provideDataStore
import org.koin.dsl.module

actual val platformKoinModule = module {
    single {
        provideDataStore(DATA_STORE_FILE_NAME)
    }
}