package com.jgsilveira.shoppinglist.kmp

import androidx.datastore.core.DataStore
import androidx.datastore.preferences.core.Preferences

actual fun provideDataStore(filePath: String): DataStore<Preferences> {
    return createDataStore(filePath = filePath)
}