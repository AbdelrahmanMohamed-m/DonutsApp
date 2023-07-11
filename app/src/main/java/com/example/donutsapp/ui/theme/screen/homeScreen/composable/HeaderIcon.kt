package com.example.donutsapp.ui.theme.screen.homeScreen

import androidx.compose.foundation.background
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Icon
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.unit.dp
import com.example.donutsapp.R
import com.example.donutsapp.ui.theme.primary


@Composable
fun HeaderIcon() {
    Box(
        modifier = Modifier
            .padding(top = 8.dp, start = 82.dp)
            .background(
                color = Color(0xFFFED8DF),
                shape = RoundedCornerShape(8.dp)
            )
            .clickable { },
    ) {
        Icon(
            painter = painterResource(id = R.drawable.search),
            tint = primary,
            contentDescription = "Cart",
            modifier = Modifier.padding(8.dp),
        )
    }
}