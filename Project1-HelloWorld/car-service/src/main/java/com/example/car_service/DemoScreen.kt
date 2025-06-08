package com.example.car_service

import android.content.Context
import android.util.Log
import androidx.car.app.CarContext
import androidx.car.app.Screen
import androidx.car.app.model.Action
import androidx.car.app.model.Pane
import androidx.car.app.model.PaneTemplate
import androidx.car.app.model.Row
import androidx.car.app.model.Template
import androidx.lifecycle.DefaultLifecycleObserver
import androidx.lifecycle.LifecycleOwner

class DemoScreen(context: CarContext): Screen(context)  , DefaultLifecycleObserver{
    init{
        lifecycle.addObserver(this)
    }

    override fun onCreate(owner: LifecycleOwner) {
        super.onCreate(owner)
        Log.i("DemoScreen", "onCreate called")
    }

    override fun onGetTemplate(): Template {
        val row = Row.Builder()
            .setTitle("Hello World")
            .build()
        val pane = Pane.Builder()
            .addRow(row)
            .build()
        return PaneTemplate.Builder(pane)
            .setHeaderAction(Action.APP_ICON)
            .build()
    }
    override fun onResume(owner: LifecycleOwner) {
        super.onResume(owner)
        Log.i("DemoScreen", "onResume called")
    }
    override fun onPause(owner: LifecycleOwner) {
        super.onPause(owner)
        Log.i("DemoScreen", "onPause called")
    }
    override fun onStop(owner: LifecycleOwner) {
        super.onStop(owner)
        Log.i("DemoScreen", "onStop called")
    }
    override fun onDestroy(owner: LifecycleOwner) {
        super.onDestroy(owner)
        Log.i("DemoScreen", "onDestroy called")
    }
}