package com.example.donutsapp.ui.theme.screen.homeScreen.composable

import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.offset
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Card
import androidx.compose.material3.CardDefaults
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.draw.paint
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.BaselineShift
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.text.style.TextDecoration
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.donutsapp.R
import com.example.donutsapp.ui.theme.text

@Preview
@Composable
fun HomeCard(
    onClick: () -> Unit = {},
    CardImg: Int = R.drawable.donutup1,
    color: Color = Color.White
) {
    HomeContentCard(
        CardImg = CardImg,
        color = color,
        onClick = onClick
    )
}

@Composable
fun HomeContentCard(
    CardImg: Int,
    color: Color,
    onClick: () -> Unit
) {
    Box(
        modifier = Modifier
            .width(193.dp)
            .height(325.dp)
            .clickable { onClick() }
            .background(color, shape = RoundedCornerShape(16.dp)),
        contentAlignment = Alignment.Center
    ) {
        Box(
            modifier = Modifier.align(Alignment.TopStart)
        ) {
            FavouriteIcon()
        }
        CardText()
        Card(
            modifier = Modifier
                .padding(bottom = 90.dp)
                .height(200.dp)
                .width(308.dp)
                .offset(x = 70.dp, y = 0.dp)
                .background(Color.Transparent)
                .paint(
                    painter = painterResource(id = CardImg),
                ),
            colors = CardDefaults.cardColors(Color.Transparent)

        ) {
        }
    }

}

@Composable
private fun CardText() {
    Column(
        modifier = Modifier.fillMaxSize(),
        verticalArrangement = Arrangement.Bottom,
        horizontalAlignment = Alignment.CenterHorizontally
    ) {
        Text(
            text = "Strawberry Wheel",
            color = Color.Black,
            fontSize = 16.sp,
            fontWeight = FontWeight.Bold,
            textAlign = TextAlign.Start,
        )
        Text(
            text = "These Baked Strawberry Donuts are filled with\nfresh  strawberries...",
            color = text,
            fontSize = 12.sp,
            fontWeight = FontWeight.Normal,
            textAlign = TextAlign.Center,
            style = TextStyle(baselineShift = BaselineShift(0.1f)
                ),
            modifier = Modifier.padding(horizontal = 16.dp))


        Row(
            modifier = Modifier
                .padding(bottom = 16.dp)
                .offset(x = 40.dp),
            horizontalArrangement = Arrangement.spacedBy(4.dp)
        ) {
            Text(
                text = "\$20",
                color = Color(0xFF565B62),
                fontSize = 14.sp,
                fontWeight = FontWeight.Bold,
                modifier = Modifier.padding(top = 8.dp),
                style = TextStyle(textDecoration = TextDecoration.LineThrough)

            )
            Text(
                text = "$16",
                color = Color.Black,
                fontSize = 20.sp,
                fontWeight = FontWeight.Bold,
            )
        }

    }


}

@Composable
private fun FavouriteIcon() {
    Box(
        modifier = Modifier
            .padding(16.dp)
            .background(
                Color.White, RoundedCornerShape(16.dp)
            )
            .padding(4.dp)
    ) {
        Image(
            painter = painterResource(id = R.drawable.hearticonalone),
            contentDescription = "exit",
            Modifier.padding(4.dp)
        )
    }
}
