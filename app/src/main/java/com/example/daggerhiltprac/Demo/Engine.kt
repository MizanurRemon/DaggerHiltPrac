package com.example.daggerhiltprac.Demo

import android.util.Log
import javax.inject.Inject

class Engine {

    @Inject
    constructor()
    fun getEngine(){
        Log.d("dataxx", "Engine starts ")
    }
}