package com.example.donutsapp.ui.theme.screen.homeScreen.composable

import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.offset
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.Text
import androidx.compose.material3.Card
import androidx.compose.material3.CardDefaults
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp

@Composable
fun HomeDownCard(
    CardImg: Int ,
    name: String,
) {
    HomeDownCardContent(
        CardImg = CardImg,
        name = name
    )
}

@Composable
fun HomeDownCardContent(
    CardImg: Int,
    name: String,
) {

    Box(
        modifier = Modifier
            .width(138.dp)
            .height(120.dp),
        contentAlignment = Alignment.Center
    ) {
        Card(
            modifier = Modifier.fillMaxSize(),
            colors = CardDefaults.cardColors(Color.White),

            shape = RoundedCornerShape(topEnd = 16.dp, topStart = 16.dp, bottomEnd = 8.dp, bottomStart = 8.dp),
            elevation = CardDefaults.cardElevation(
                defaultElevation = 2.dp,
        )
        ,

        ) { }
        Card(
            modifier = Modifier
                .height(112.dp)
                .width(104.dp)
                .offset(0.dp, (-60).dp)
                .background(Color.Transparent),
            colors = CardDefaults.cardColors(Color.Transparent)

        ) {
            Image(
                painter = painterResource(id = CardImg),
                contentDescription = "category",
                modifier = Modifier.fillMaxSize().clickable {  },
            )
        }
           Column(
                modifier = Modifier
                    .fillMaxWidth()
                    .height(100.dp),

                horizontalAlignment = Alignment.CenterHorizontally,
                verticalArrangement = Arrangement.Center
            ) {
                Text(
                    text = name,
                    style = androidx.compose.ui.text.TextStyle(
                        color = Color.Black,
                        fontSize = 16.sp,
                        textAlign = androidx.compose.ui.text.style.TextAlign.Center
                    ),
                    modifier = Modifier.padding(top = 20.dp)

                )

               Text(
                   text = "22$",
                   style = androidx.compose.ui.text.TextStyle(
                       color = Color.Black,
                       fontSize = 16.sp
                   ),
                   modifier = Modifier.padding(top = 8.dp)
               )
        }
    }
}


