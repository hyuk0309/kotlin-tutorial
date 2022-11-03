package com.hyuk.kotlintutorial.basicsyntax

import assertk.assertThat
import assertk.assertions.isEqualTo
import org.junit.jupiter.api.Test
import org.junit.jupiter.api.assertAll

internal class BasicTest {

    private var basic = Basic();

    @Test
    fun read_only_변수_선언() {
        //given
        val a = 10
        val b = 20

        //when then
        assertAll(
            { assertThat(a).isEqualTo(10) },
            { assertThat(b).isEqualTo(20) }
        )
    }

    @Test
    fun 일반_변수_선언() {
        //given
        var v = 10

        //when
        v = 20

        //then
        assertThat(v).isEqualTo(20)
    }

    @Test
    fun sum_함수() {
        //given
        var a = 10
        var b = 20

        //when
        var result = basic.sum(a, b)

        //then
        assertThat(result).isEqualTo(a + b);
    }

    @Test
    fun sub_함수() {
        //given
        var a = 20
        var b = 10

        //when
        val result = basic.sub(a, b)

        //then
        assertThat(result).isEqualTo(a - b)
    }
}