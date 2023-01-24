package com.example.daggerhiltprac.StudentInfo

import android.util.Log
import javax.inject.Inject

class Student @Inject constructor(private val name: String): StudentName {
    override fun getName() {
        Log.d("dataxx", "student name is $name")
    }
}