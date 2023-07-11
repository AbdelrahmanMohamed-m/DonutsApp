package com.example.donutsapp.ui.theme.screen.homeScreen.composable

import com.example.donutsapp.R

sealed class bottombarScreen(
    val title:String,
    val icon:Int
){
    object Home:bottombarScreen("play", R.drawable.home)
    object Favourite:bottombarScreen("Search", R.drawable.search)
    object Notification:bottombarScreen("Profile", R.drawable.notification)
    object Market:bottombarScreen("ticket", R.drawable.buy)
    object Profile:bottombarScreen("ticket", R.drawable.user)
}