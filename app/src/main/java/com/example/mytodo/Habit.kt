package com.example.xtendtv_webview

import com.example.mytodo.R


data class Habit(val tile: String,val Discription :String,val img:Int)
fun getSampleHabits():List<Habit>{
    return listOf(
        Habit("go for walk",
        "a nice walk in the sun to charge energie ",
        R.drawable.walk),
                Habit("drink a glass of water",
        "a refreshing glass of water gets you hydrated ",
        R.drawable.water)

    )
}