package com.example.daggerhiltprac.Demo

import android.util.Log
import javax.inject.Inject

class Wheel {

    @Inject
    constructor()
    fun getWheel(){
        Log.d("dataxx", "get wheel ")
    }
}