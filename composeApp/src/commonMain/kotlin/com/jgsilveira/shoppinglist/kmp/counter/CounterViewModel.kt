package com.jgsilveira.shoppinglist.kmp.counter

import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import kotlinx.coroutines.flow.Flow
import kotlinx.coroutines.flow.last
import kotlinx.coroutines.launch

class CounterViewModel(
    private val getCounterAsFlow: GetCounterAsFlowUseCase,
    private val updateCounterValue: UpdateCounterValueUseCase
) : ViewModel() {

    val counterState: Flow<Int>
        get() = getCounterAsFlow()

    fun incrementCounter() {
        viewModelScope.launch {
            val counter = counterState.last() + 1
            updateCounterValue(counter)
        }
    }
}