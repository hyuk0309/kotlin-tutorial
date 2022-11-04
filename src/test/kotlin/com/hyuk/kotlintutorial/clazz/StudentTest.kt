package com.hyuk.kotlintutorial.clazz

import assertk.assertThat
import assertk.assertions.isEqualTo
import assertk.assertions.isNotNull
import org.junit.jupiter.api.Assertions.assertAll
import org.junit.jupiter.api.Test

internal class StudentTest {

    @Test
    fun 기본_생성자_사용_1() {
        //given
        val name = "hyuk"
        val studentNo = "1"

        //when
        val student = Student(name, studentNo)

        //then
        assertAll(
            { assertThat(student.name).isEqualTo(name) },
            { assertThat(student.studentNo).isEqualTo(studentNo) },
            { assertThat(student.hubby).isNotNull() }
        )
    }

    @Test
    fun 기본_생성자_사용_2() {
        //given
        val name = "hyuk"
        val studentNo = "1"

        //when
        val student = Student(name = name, studentNo = studentNo)

        //then
        assertAll(
            { assertThat(student.name).isEqualTo(name) },
            { assertThat(student.studentNo).isEqualTo(studentNo) },
            { assertThat(student.hubby).isEqualTo("") }
        )
    }

    @Test
    fun 모든_인자_받는_생성자_사용() {
        //given
        val name = "hyuk"
        val studentNo = "123"
        val hubby = "cross-fit"

        //when
        val student = Student(name, studentNo, hubby)

        //then
        assertAll(
            { assertThat(student.name).isEqualTo(name) },
            { assertThat(student.studentNo).isEqualTo(studentNo) },
            { assertThat(student.hubby).isEqualTo(hubby) }
        )
    }

    @Test
    fun 모든_인자_받는_생성자_사용_2() {
        //given
        val name = "hyuk"
        val studentNo = "123"
        val hubby = "cross-fit"

        //when
        val student = Student(name = name, studentNo = studentNo, hubby = hubby)

        //then
        assertThat(student).isNotNull()
    }
}