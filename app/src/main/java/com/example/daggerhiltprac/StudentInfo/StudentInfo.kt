package com.example.daggerhiltprac.StudentInfo

import javax.inject.Inject

class StudentInfo @Inject constructor(private val student: Student) {
    fun getName() {
        student.getName()
    }
}