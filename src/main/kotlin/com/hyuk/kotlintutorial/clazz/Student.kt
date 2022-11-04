package com.hyuk.kotlintutorial.clazz

class Student(val name: String, val studentNo: String) {
    var hubby = ""

    constructor(name: String, studentNo: String, hubby: String): this(name, studentNo) {
        this.hubby = hubby
    }
}