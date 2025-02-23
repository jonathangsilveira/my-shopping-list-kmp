package com.jgsilveira.shoppinglist.kmp.preferences

import com.jgsilveira.shoppinglist.kmp.DATA_STORE_FILE_NAME
import com.jgsilveira.shoppinglist.kmp.provideDataStore
import org.koin.android.ext.koin.androidContext
import org.koin.dsl.module
import java.io.File

actual val platformKoinModule = module {
    single {
        val context = androidContext()
        val absolutePath = File(
            context.applicationContext.filesDir,
            "datastore/$DATA_STORE_FILE_NAME"
        ).absolutePath
        provideDataStore(absolutePath)
    }
}