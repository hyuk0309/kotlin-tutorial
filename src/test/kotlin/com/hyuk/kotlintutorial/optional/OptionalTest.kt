package com.hyuk.kotlintutorial.optional

import assertk.assertThat
import assertk.assertions.isEqualTo
import assertk.assertions.isNotNull
import assertk.assertions.isNull
import org.junit.jupiter.api.Assertions.assertAll
import org.junit.jupiter.api.Test

internal class OptionalTest {

    @Test
    fun null_허용하지_않는_변수_선언() {
        //given
        var email: String

        //when
        email = "hyuk@mail.com"

        //then
        assertThat(email).isEqualTo("hyuk@mail.com")
    }

    @Test
    fun null_허용_변수_선언() {
        //given
        var email: String?

        //when
        email = null

        //then
        assertThat(email).isNull()
    }

    @Test
    fun nullable_type_처리() {
        //given when
        val item = Optional().getRandomItem()

        //then
        assertAll(
            { assertThat(item?.let { it -> it.id }).isNotNull() },
            { assertThat(item!!.id).isNotNull() }
        )
    }
}