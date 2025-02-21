package com.jgsilveira.shoppinglist.kmp.counter

import androidx.datastore.core.DataStore
import androidx.datastore.preferences.core.Preferences
import androidx.datastore.preferences.core.edit
import androidx.datastore.preferences.core.intPreferencesKey
import kotlinx.coroutines.CoroutineDispatcher
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.IO
import kotlinx.coroutines.withContext

private const val COUNTER_KEY = "counter_key"

class UpdateCounterValueUseCase(
    private val dataStore: DataStore<Preferences>,
    private val dispatcher: CoroutineDispatcher = Dispatchers.IO
) {

    suspend operator fun invoke(
        value: Int
    ) = withContext(dispatcher) {
        dataStore.edit { prefs ->
            val key = intPreferencesKey(COUNTER_KEY)
            prefs[key] = value
        }
    }
}