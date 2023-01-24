package com.example.daggerhiltprac.StudentInfo

import javax.inject.Inject

class StudentInfo @Inject constructor(private val student: Student, private val studentFullName: StudentFullName) {
    fun getName() {
        student.getName()
        studentFullName.getName()
    }
}