package com.jgsilveira.shoppinglist.kmp

import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.material.Button
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.collectAsState
import androidx.compose.runtime.getValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import com.jgsilveira.shoppinglist.kmp.counter.CounterViewModel
import org.jetbrains.compose.ui.tooling.preview.Preview
import org.koin.compose.viewmodel.koinViewModel
import org.koin.core.annotation.KoinExperimentalAPI

@OptIn(KoinExperimentalAPI::class)
@Composable
@Preview
fun CounterScreen(
    viewModel: CounterViewModel = koinViewModel()
) {
    val counter by viewModel.counterState.collectAsState(initial = 0)
    Column(
        Modifier.fillMaxWidth(),
        horizontalAlignment = Alignment.CenterHorizontally
    ) {
        Text("Counter: $counter")
        Button(onClick = { viewModel.incrementCounter() }) {
            Text("Increment")
        }
    }
}