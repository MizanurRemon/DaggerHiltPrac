package com.example.daggerhiltprac.StudentInfo

import android.util.Log
import javax.inject.Inject

class StudentFullName @Inject constructor(
    @FName
    private var fname: String,
    @LName
    private var lname: String
) :
    StudentName {
    override fun getName() {
        Log.d("dataxx", "my full name is $fname $lname")
    }
}