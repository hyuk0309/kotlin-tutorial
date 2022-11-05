package com.hyuk.kotlintutorial.dataclasses

import assertk.assertThat
import assertk.assertions.isEqualTo
import assertk.assertions.isNotNull
import assertk.assertions.isTrue
import org.junit.jupiter.api.Assertions.assertAll
import org.junit.jupiter.api.Test

internal class DataTest {

    @Test
    fun Data_Class_생성() {
        //given
        val value = "value"

        //when
        val data = Data(value)

        //then
        assertAll(
            { assertThat(data.value).isEqualTo(value) },
            { assertThat(data.hashCode()).isNotNull() },
            { assertThat(data.equals(Data(value))).isTrue() },
            { assertThat(data.toString()).isNotNull() }
        )
    }
}