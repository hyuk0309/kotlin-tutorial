package com.hyuk.kotlintutorial.extensionfunction

import assertk.assertThat
import assertk.assertions.isTrue
import org.junit.jupiter.api.Test

internal class ListExtensionTest {

    @Test
    fun extension_function_사용() {
        //given
        val elements = listOf("a", "b", "c")

        //when
        val result = ListExtension().getRandomElementOfList(elements)

        //then
        assertThat(elements.contains(result)).isTrue()
    }
}