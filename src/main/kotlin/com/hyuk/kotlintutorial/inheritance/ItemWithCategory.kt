package com.hyuk.kotlintutorial.inheritance

class ItemWithCategory(id: String, name: String, val categoryId: String) : Item(id, name) {
    override fun getIdOfItem(): String {
        return id + name
    }
}