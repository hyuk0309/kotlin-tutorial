package com.hyuk.kotlintutorial.extensionfunction

import java.util.concurrent.ThreadLocalRandom

class ListExtension {
    fun <T> getRandomElementOfList(list: List<T>): T? {
        return list.random()
    }
}

fun <T> List<T>.random(): T? {
    if (this.isEmpty()) return null
    return get(ThreadLocalRandom.current().nextInt(count()))
}
