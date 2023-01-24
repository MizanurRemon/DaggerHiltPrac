package com.example.daggerhiltprac

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.daggerhiltprac.Demo.Car
import com.example.daggerhiltprac.StudentInfo.StudentInfo
import dagger.hilt.android.AndroidEntryPoint
import javax.inject.Inject


@AndroidEntryPoint  // enroll every dependency that is stored inside base application
class MainActivity : AppCompatActivity() {

    @Inject
    lateinit var car: Car  //filled injection

    @Inject
    lateinit var studentInfo: StudentInfo
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        //car.getColor()
        studentInfo.getName()
    }
}