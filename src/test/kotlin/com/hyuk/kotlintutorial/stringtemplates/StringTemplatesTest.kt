package com.hyuk.kotlintutorial.stringtemplates

import assertk.assertThat
import assertk.assertions.isEqualTo
import org.junit.jupiter.api.Test

internal class StringTemplatesTest {

    @Test
    fun String_Templates_이용_1() {
        //given
        val firstName = "eunhyuk"
        val lastName = "bahng"

        //when
        val fullName = "$firstName $lastName"

        //then
        assertThat(fullName).isEqualTo("eunhyuk bahng")
    }

    @Test
    fun String_Templates_이용_2() {
        //given
        val num = 10

        //when
        val result = "${num == 10}"

        //then
        assertThat(result).isEqualTo("true")
    }
}