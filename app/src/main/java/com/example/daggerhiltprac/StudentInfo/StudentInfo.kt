package com.example.daggerhiltprac.StudentInfo

import javax.inject.Inject

class StudentInfo @Inject constructor(private val student: Student, private val studentFullName: StudentFullName) {
    suspend fun getName() {
        student.getName()
        studentFullName.getName()
    }
}