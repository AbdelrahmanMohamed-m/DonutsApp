package com.example.donutsapp.ui.theme.screen.homeScreen.composable

import android.annotation.SuppressLint
import androidx.compose.foundation.layout.RowScope
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.Icon
import androidx.compose.material3.NavigationBar
import androidx.compose.material3.NavigationBarItem
import androidx.compose.material3.Scaffold
import androidx.compose.runtime.Composable
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.res.vectorResource
import androidx.compose.ui.tooling.preview.Preview
import com.example.donutsapp.ui.theme.secondary

@SuppressLint("UnusedMaterial3ScaffoldPaddingParameter")
@OptIn(ExperimentalMaterial3Api::class)
@Preview
@Composable
fun bottombarItem(
) {
    Scaffold(bottomBar = { bottombar() }) {

    }
}

@Composable
fun bottombar() {
    val screens = listOf(
        bottombarScreen.Home,
        bottombarScreen.Favourite,
        bottombarScreen.Notification,
        bottombarScreen.Market,
        bottombarScreen.Profile,
    )

    NavigationBar(containerColor = Color.White) {
        screens.forEach { Screen ->
            Additem(screen = Screen)
        }
    }
}

@Composable
fun RowScope.Additem(
    screen: bottombarScreen,
) {
    NavigationBarItem(

        icon = {
                Icon(
                    imageVector = ImageVector.vectorResource(id = screen.icon),
                    contentDescription = null,
                    tint = secondary
                )

        },
        onClick = { /*TODO*/ },
        selected = false
    )
}