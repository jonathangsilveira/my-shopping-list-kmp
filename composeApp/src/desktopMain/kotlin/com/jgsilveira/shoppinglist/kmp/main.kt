package com.jgsilveira.shoppinglist.kmp

import androidx.compose.ui.window.Window
import androidx.compose.ui.window.application
import com.jgsilveira.shoppinglist.kmp.di.initKoin

fun main() {
    initKoin()
    application {
        Window(
            onCloseRequest = ::exitApplication,
            title = "my-shopping-list-kmp"
        ) {
            App()
        }
    }
}