package com.example.donutsapp.ui.theme.screen.homeScreen

import androidx.compose.foundation.layout.Column
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.sp
import com.example.donutsapp.ui.theme.primary
import com.example.donutsapp.ui.theme.text

@Composable
fun HeaderText() {
    Column {
        Text(
            text = "Let’s Gonuts!",
            color = primary,
            fontSize = 30.sp,
            fontWeight = FontWeight.Bold
        )
        Text(
            text = "Order your favourite donuts from here",
            color = text,
            fontSize = 14.sp,
            fontWeight = FontWeight.Bold
        )

    }
}


