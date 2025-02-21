package com.jgsilveira.shoppinglist.kmp

import androidx.compose.ui.window.ComposeUIViewController
import com.jgsilveira.shoppinglist.kmp.di.initKoin

fun MainViewController() = ComposeUIViewController(
    configure = {
        initKoin()
    }
) { App() }