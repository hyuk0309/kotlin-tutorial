package com.hyuk.kotlintutorial.inheritance

import assertk.assertThat
import assertk.assertions.isEqualTo
import assertk.assertions.isTrue
import org.junit.jupiter.api.Assertions.assertAll
import org.junit.jupiter.api.Test

internal class ItemWithCategoryTest {

    @Test
    fun 자식_클래스_생성() {
        //given
        val id = "123"
        val name = "hello"
        val categoryId = "456"

        //when
        val itemWithCategory = ItemWithCategory(id, name, categoryId)

        //then
        assertAll(
            { assertThat(itemWithCategory.id).isEqualTo(id) },
            { assertThat(itemWithCategory.name).isEqualTo(name) },
            { assertThat(itemWithCategory.categoryId).isEqualTo(categoryId) }
        )
    }

    @Test
    fun 자식_클래스는_부모_타입이다() {
        //given
        val itemWithCategory = ItemWithCategory("1", "name", "1")

        //when then
        assertAll(
            { assertThat(itemWithCategory is Item).isTrue() },
            { assertThat(itemWithCategory is ItemWithCategory).isTrue() }
        )
    }
}