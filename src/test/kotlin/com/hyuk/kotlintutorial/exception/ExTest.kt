package com.hyuk.kotlintutorial.exception

import assertk.assertThat
import assertk.assertions.isTrue
import org.junit.jupiter.api.Test

internal class ExTest {

    private val ex = Ex()

    @Test
    fun 예외_처리() {
        //given
        var catchException = false

        //when
        try {
            ex.throwException()
        } catch (e: IllegalArgumentException) {
            catchException = true
        }

        //then
        assertThat(catchException).isTrue()
    }
}