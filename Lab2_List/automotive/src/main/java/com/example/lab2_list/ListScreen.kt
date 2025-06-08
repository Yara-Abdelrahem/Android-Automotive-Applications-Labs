package com.example.lab2_list

import androidx.car.app.Screen
import androidx.car.app.model.ItemList
import androidx.car.app.model.ListTemplate
import androidx.car.app.model.Row
import androidx.car.app.model.Template
import androidx.car.app.CarContext
import androidx.car.app.model.CarIcon
import androidx.core.graphics.drawable.IconCompat

class ListScreen(carContext: CarContext) : Screen(carContext) {
    override fun onGetTemplate(): Template {
        val iconCompat1 = IconCompat.createWithResource(carContext, R.drawable.carspeed1)
        val carIcon1 = CarIcon.Builder(iconCompat1).build()

        val iconCompat2 = IconCompat.createWithResource(carContext, R.drawable.electriccar)
        val carIcon2= CarIcon.Builder(iconCompat2).build()

        val iconCompat3 = IconCompat.createWithResource(carContext, R.drawable.car_setting)
        val carIcon3 = CarIcon.Builder(iconCompat3).build()

        val iconCompat4 = IconCompat.createWithResource(carContext, R.drawable.car_maintenance)
        val carIcon4 = CarIcon.Builder(iconCompat4).build()

        val iconCompat5 = IconCompat.createWithResource(carContext, R.drawable.carwash1)
        val carIcon5 = CarIcon.Builder(iconCompat5).build()

        fun createRow(title: String, description: String ,icon: CarIcon ): Row {
            return Row.Builder()
                .setTitle(title)
                .addText(description)
                .setImage(icon)
                .setOnClickListener {
                    screenManager.push(
                        ScreenDetail(carContext, title, icon)
                    )
                }
                .build()
        }

        val itemList = ItemList.Builder()
            .addItem(createRow("Speed", "Control car speed" , carIcon1))
            .addItem(createRow("Charge", "change car mood to charge" , carIcon2))
            .addItem(createRow("Car Settings", "control car settings" , carIcon3))
            .addItem(createRow("Maintenance", "car maintenance" , carIcon4))
            .addItem(createRow("Wash", "car wash mood" , carIcon5))
            .build()

        return ListTemplate.Builder()
            .setTitle("The Options")
            .setSingleList(itemList)
            .build()
    }
}
