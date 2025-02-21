package com.jgsilveira.shoppinglist.kmp

import androidx.datastore.core.DataStore
import androidx.datastore.preferences.core.Preferences
import kotlinx.cinterop.ExperimentalForeignApi

@OptIn(ExperimentalForeignApi::class)
actual fun provideDataStore(filePath: String): DataStore<Preferences> {
    return createDataStore()
}