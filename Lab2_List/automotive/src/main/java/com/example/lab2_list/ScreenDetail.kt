package com.example.lab2_list

import androidx.car.app.CarContext
import androidx.car.app.Screen
import androidx.car.app.model.Action
import androidx.car.app.model.CarIcon
import androidx.car.app.model.MessageTemplate
import androidx.car.app.model.Template

class ScreenDetail(
    carContext: CarContext,
    val title: String,
     val icon: CarIcon
) : Screen(carContext) {

    override fun onGetTemplate(): Template {
        return MessageTemplate.Builder(title)
            .setTitle("Detail View")
            .setIcon(icon)
            .setHeaderAction(Action.BACK)
            .build()
    }
}
