package com.example.lab2_list

import android.content.Intent
import android.util.Log
import androidx.car.app.Screen
import androidx.car.app.Session
import androidx.lifecycle.DefaultLifecycleObserver
import androidx.lifecycle.LifecycleOwner

class DemoSession : Session(), DefaultLifecycleObserver{
    init {
        lifecycle.addObserver(this)
    }
    override fun onCreate(owner: LifecycleOwner) {
        super.onCreate(owner)
        Log.i("DemoSession", "onCreate called")
    }
    override fun onCreateScreen(intent: Intent): Screen {
        return ListScreen(carContext)
    }

    override fun onResume(owner: LifecycleOwner) {
        super.onResume(owner)
        Log.i("DemoSession", "onResume called")
    }
    override fun onPause(owner: LifecycleOwner) {
        super.onPause(owner)
        Log.i("DemoSession", "onPause called")
    }

    override fun onStop(owner: LifecycleOwner) {
        super.onStop(owner)
        Log.i("DemoSession", "onStop called")
    }

    override fun onDestroy(owner: LifecycleOwner) {
        super.onDestroy(owner)
        Log.i("DemoSession", "onDestroy called")
    }
}