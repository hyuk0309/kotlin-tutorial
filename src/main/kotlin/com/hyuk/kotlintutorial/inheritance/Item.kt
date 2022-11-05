package com.hyuk.kotlintutorial.inheritance

open class Item(val id: String, val name: String = "unknown_name") {
    open fun getIdOfItem(): String {
        return id
    }
}