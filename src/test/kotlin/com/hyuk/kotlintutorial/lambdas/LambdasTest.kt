package com.hyuk.kotlintutorial.lambdas

import assertk.assertThat
import assertk.assertions.isEqualTo
import org.junit.jupiter.api.Test

internal class LambdasTest {

    @Test
    fun 람다_사용() {
        //given
        val listOfNumbers = listOf(1, 2, 3)

        //when
        val sum = listOfNumbers.reduce { a, b -> a + b }

        //then
        assertThat(sum).isEqualTo(6)
    }
}