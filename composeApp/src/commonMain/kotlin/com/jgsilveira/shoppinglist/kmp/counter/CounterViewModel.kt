package com.jgsilveira.shoppinglist.kmp.counter

import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import kotlinx.coroutines.flow.MutableStateFlow
import kotlinx.coroutines.flow.StateFlow
import kotlinx.coroutines.flow.launchIn
import kotlinx.coroutines.flow.onEach
import kotlinx.coroutines.launch


class CounterViewModel(
    private val getCounterAsFlow: GetCounterAsFlowUseCase,
    private val updateCounterValue: UpdateCounterValueUseCase
) : ViewModel() {

    private val mutableCounterState = MutableStateFlow(0)
    val counterState: StateFlow<Int> = mutableCounterState

    fun incrementCounter() {
        viewModelScope.launch {
            val counter = mutableCounterState.value + 1
            updateCounterValue(counter)
        }
    }

    fun refreshCounter() {
        viewModelScope.launch {
            getCounterAsFlow()
                .onEach { counterValue ->
                    mutableCounterState.value = counterValue
                }
                .launchIn(viewModelScope)
        }
    }
}