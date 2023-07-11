package com.example.donutsapp.ui.theme.main

import android.annotation.SuppressLint
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.Scaffold
import androidx.compose.runtime.Composable
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.rememberNavController
import com.example.donutsapp.ui.theme.DonutsAppTheme
import com.example.donutsapp.ui.theme.screen.homeScreen.HomeScreen
import com.example.donutsapp.ui.theme.screen.itemScreen.ItemScreen
import com.example.donutsapp.ui.theme.screen.splashScreen.SplashScreen

@SuppressLint("UnusedMaterial3ScaffoldPaddingParameter")
@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun DonutApp() {
    DonutsAppTheme {
        Scaffold {
            val navcontroller = rememberNavController()
            NavHost(navController = navcontroller, startDestination = "SplashScreen")
            {
                composable("SplashScreen") { SplashScreen(navcontroller) }
                composable("HomeScreen") { HomeScreen(navcontroller) }
                composable("ItemScreen") { ItemScreen(navcontroller) }
            }
        }
    }
}