package com.hyuk.kotlintutorial

import assertk.assertThat
import assertk.assertions.isEqualTo
import org.junit.jupiter.api.Test

internal class MainTest {

    private val main = Main()

    @Test
    fun testMain() {
        val hello = "Hello World!"

        assertThat(hello).isEqualTo(main.print("Hello World!"))
    }

}