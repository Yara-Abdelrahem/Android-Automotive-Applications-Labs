package com.example.lab2_list

import android.util.Log
import androidx.car.app.CarAppService
import androidx.car.app.Session
import androidx.car.app.validation.HostValidator

class DemoCarAppService : CarAppService() {
    override fun createHostValidator(): HostValidator {
        return HostValidator.ALLOW_ALL_HOSTS_VALIDATOR
    }

    override fun onCreate() {
        super.onCreate()
        Log.i("DemoCarAppService", "onCreate called")
    }

    override fun onCreateSession(): Session {

        return DemoSession()
    }

    override fun onDestroy() {
        super.onDestroy()
        Log.i("DemoCarAppService", "onDestroy called")
    }
}