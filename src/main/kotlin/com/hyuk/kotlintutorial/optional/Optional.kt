package com.hyuk.kotlintutorial.optional

import java.util.*

class Optional {
    fun getRandomItem(): Item? {
        return Item(UUID.randomUUID().toString())
    }
}