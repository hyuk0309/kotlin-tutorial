package com.hyuk.kotlintutorial.collections

import assertk.assertThat
import assertk.assertions.isEqualTo
import org.junit.jupiter.api.Assertions.assertAll
import org.junit.jupiter.api.Test

internal class CollectionsTest {

    @Test
    fun immutable_collection_생성() {
        //given
        val itemList = listOf(1, 2, 3)
        val itemSet = setOf(1, 2, 3)
        val itemMap = mapOf(Pair(1, 1), Pair(2, 2))

        //when then
        assertAll(
            { assertThat(itemList.size).isEqualTo(3) },
            { assertThat(itemSet.size).isEqualTo(3) },
            { assertThat(itemMap.size).isEqualTo(2) }
        )
    }

    @Test
    fun mutable_collection_생성() {
        //given
        val itemList = mutableListOf(1, 2, 3)
        val itemSet = mutableSetOf(1, 2, 3)
        val itemMap = mutableMapOf(Pair(1, 1), Pair(2, 2))

        //when
        itemList.add(4)
        itemSet.add(4)
        itemMap.put(3, 3)

        //then
        assertAll(
            { assertThat(itemList.size).isEqualTo(4) },
            { assertThat(itemSet.size).isEqualTo(4) },
            { assertThat(itemMap.size).isEqualTo(3) }
        )
    }
}