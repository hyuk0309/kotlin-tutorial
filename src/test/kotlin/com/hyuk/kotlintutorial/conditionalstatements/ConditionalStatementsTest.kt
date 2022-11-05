package com.hyuk.kotlintutorial.conditionalstatements

import assertk.assertThat
import assertk.assertions.isEqualTo
import org.junit.jupiter.api.Test

internal class ConditionalStatementsTest {

    @Test
    fun if_else() {
        //given
        val money = 7777

        //when
        val result = if (money == 7777) "Lucky!" else "Sorry.."

        //then
        assertThat(result).isEqualTo("Lucky!")
    }

    @Test
    fun when_연습() {
        //given
        val sport = "cross-fit"

        //when
        var result: String = ""
        when (sport) {
            "cross-fit" -> result = "FUN!"
            "other" -> result = "BORING.."
        }

        //then
        assertThat(result).isEqualTo("FUN!")
    }
}