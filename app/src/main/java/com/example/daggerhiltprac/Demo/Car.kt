package com.example.daggerhiltprac.Demo

import android.util.Log
import javax.inject.Inject


//constructor injection
class Car @Inject constructor(private  var engine: Engine, private var wheel: Wheel) {

    fun getColor() {
        Log.d("dataxx", "carcoloe:: ")
        engine.getEngine()
        wheel.getWheel()
    }
}