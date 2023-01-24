package com.example.daggerhiltprac.StudentInfo

import android.util.Log
import javax.inject.Inject

class Student @Inject constructor(): StudentName {
    override fun getName() {
        Log.d("dataxx", "student name is Ali")
    }
}