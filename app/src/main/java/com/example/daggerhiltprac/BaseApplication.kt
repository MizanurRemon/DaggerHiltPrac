package com.example.daggerhiltprac

import android.app.Application
import dagger.hilt.android.HiltAndroidApp

//container : for storing dependencies
@HiltAndroidApp
class BaseApplication: Application()