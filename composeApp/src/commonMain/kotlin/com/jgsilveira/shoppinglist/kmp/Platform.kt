package com.jgsilveira.shoppinglist.kmp

interface Platform {
    val name: String
}

expect fun getPlatform(): Platform