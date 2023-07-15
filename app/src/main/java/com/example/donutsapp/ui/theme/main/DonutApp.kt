package com.example.donutsapp.ui.theme.main

import android.annotation.SuppressLint
import androidx.compose.runtime.Composable
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.rememberNavController
import com.example.donutsapp.ui.theme.screen.homeScreen.HomeScreen
import com.example.donutsapp.ui.theme.screen.itemScreen.ItemScreen
import com.example.donutsapp.ui.theme.screen.splashScreen.SplashScreen

@SuppressLint("UnusedMaterial3ScaffoldPaddingParameter")
@Composable
fun DonutApp() {
    val navController = rememberNavController()
    NavHost(navController = navController, startDestination = "SplashScreen") {
        composable("SplashScreen") { SplashScreen(navController) }
        composable("HomeScreen") { HomeScreen(navController) }
        composable("ItemScreen") { ItemScreen(navController) }
    }
}



