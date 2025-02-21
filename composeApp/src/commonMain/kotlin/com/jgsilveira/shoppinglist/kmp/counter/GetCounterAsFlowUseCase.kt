package com.jgsilveira.shoppinglist.kmp.counter

import androidx.datastore.core.DataStore
import androidx.datastore.preferences.core.Preferences
import androidx.datastore.preferences.core.intPreferencesKey
import kotlinx.coroutines.flow.Flow
import kotlinx.coroutines.flow.map

private const val COUNTER_KEY = "counter_key"

class GetCounterAsFlowUseCase(
    private val dataStore: DataStore<Preferences>
) {

    operator fun invoke(): Flow<Int> =
        dataStore.data.map { prefs ->
            val key = intPreferencesKey(COUNTER_KEY)
            prefs[key] ?: 0
        }
}