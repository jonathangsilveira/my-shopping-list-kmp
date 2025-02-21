package com.jgsilveira.shoppinglist.kmp

import androidx.datastore.core.DataStore
import androidx.datastore.preferences.core.PreferenceDataStoreFactory
import androidx.datastore.preferences.core.Preferences
import okio.Path.Companion.toPath

internal const val DATA_STORE_FILE_NAME = "prefs.preferences_pb"

fun createDataStore(
    filePath: String
): DataStore<Preferences> {
    return PreferenceDataStoreFactory.createWithPath(
        produceFile = { filePath.toPath() }
    )
}

expect fun provideDataStore(filePath: String): DataStore<Preferences>