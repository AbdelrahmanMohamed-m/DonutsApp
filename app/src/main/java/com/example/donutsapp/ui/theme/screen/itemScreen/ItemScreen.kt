package com.example.donutsapp.ui.theme.screen.itemScreen

import androidx.compose.foundation.Image
import androidx.compose.foundation.ScrollState
import androidx.compose.foundation.background
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.foundation.verticalScroll
import androidx.compose.material3.Button
import androidx.compose.material3.ButtonDefaults
import androidx.compose.material3.Card
import androidx.compose.material3.CardDefaults
import androidx.compose.material3.Icon
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.mutableIntStateOf
import androidx.compose.runtime.remember
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.navigation.NavController
import com.example.donutsapp.R
import com.example.donutsapp.ui.theme.primary
import com.example.donutsapp.ui.theme.tertiary
import com.example.donutsapp.ui.theme.text


@Composable
fun ItemScreen(
    NavController: NavController,


    ) {
    card(
        onClick = {
           NavController.navigate("HomeScreen")
        }
    )
    Column(
        modifier = Modifier
            .fillMaxSize()
            .background(Color.Transparent)
        ) {
        Spacer(
            modifier = Modifier.weight(1f)
        )
        Card(
            modifier = Modifier
                .background(Color.Transparent)
                .fillMaxWidth()
                .clip(RoundedCornerShape(topStart = 32.dp, topEnd = 32.dp)),
            colors = CardDefaults.cardColors(
                containerColor = Color.White
            ),
        ) {
            DetailsText()
            val incrment = remember {
                mutableIntStateOf(1)
            }
            Row(
                modifier = Modifier
                    .fillMaxWidth()
                    .padding(top = 16.dp, start = 32.dp, end = 32.dp),
                Arrangement.spacedBy(16.dp)
            ) {
                Card(
                    modifier = Modifier
                        .clip(RoundedCornerShape(12.dp))
                        .clickable { incrment.value-- },
                    colors = CardDefaults.cardColors(
                        containerColor = Color.White
                    ),
                    elevation = CardDefaults.cardElevation(
                        defaultElevation = 8.dp,
                    )
                ) {

                    Icon(
                        painter = painterResource(id = R.drawable.minus),
                        contentDescription = "minus",
                        modifier = Modifier.padding(horizontal = 16.dp, vertical = 20.dp)
                    )
                }
                Card(
                    modifier = Modifier
                        .clip(RoundedCornerShape(12.dp)),
                    colors = CardDefaults.cardColors(
                        containerColor = Color.White
                    ),
                    elevation = CardDefaults.cardElevation(
                        defaultElevation = 8.dp,
                    )
                ) {

                    Text(
                        text = incrment.value.toString(),
                        fontSize = 22.sp,
                        fontWeight = FontWeight.Bold,
                        modifier = Modifier
                            .padding(horizontal = 20.dp, vertical = 8.dp)

                    )
                }
                Card(
                    modifier = Modifier
                        .clip(RoundedCornerShape(12.dp))
                        .clickable { incrment.value++ },
                    colors = CardDefaults.cardColors(
                        containerColor = Color.Black
                    ),
                    elevation = CardDefaults.cardElevation(
                        defaultElevation = 2.dp,
                    )

                ) {

                    Icon(
                        painter = painterResource(id = R.drawable.pluss),
                        contentDescription = "pluss",
                        tint = Color.White,
                        modifier = Modifier.padding(horizontal = 14.dp, vertical = 14.dp)
                    )
                }

            }
            Box(
                modifier = Modifier
                    .fillMaxWidth()
                    .padding(top = 8.dp, start = 32.dp)
            ) {
                Text(
                    text = (incrment.value * 16).toString() + "\$",
                    fontSize = 30.sp,
                    fontWeight = FontWeight.Bold,
                    color = Color.Black,
                )
                Button(
                    onClick = { /*TODO*/ },
                    modifier = Modifier
                        .fillMaxWidth()
                        .padding(bottom = 16.dp, start = 64.dp, end = 32.dp),
                    shape = RoundedCornerShape(32.dp),
                    colors = ButtonDefaults.buttonColors(
                        containerColor = primary
                    )
                ) {
                    Text(
                        text = "Add to cart",
                        fontSize = 16.sp,
                        fontWeight = FontWeight.Bold,
                        color = Color.White,
                        modifier = Modifier.padding(horizontal = 56.dp, vertical = 8.dp)
                    )
                }

            }

        }

    }

}


@Composable
private fun DetailsText() {
    Text(
        text = "Strawberry Wheel",
        modifier = Modifier
            .fillMaxWidth()
            .padding(top = 24.dp, start = 32.dp),
        fontSize = 30.sp,
        fontWeight = FontWeight.Bold,
        color = primary
    )
    Text(
        text = "About Gonut",
        modifier = Modifier
            .fillMaxWidth()
            .padding(top = 24.dp, start = 32.dp),
        fontSize = 18.sp,
        fontWeight = FontWeight.Bold,
        color = Color.Black
    )
    Text(
        text = "These soft, cake-like Strawberry Frosted Donuts feature fresh strawberries and a delicious fresh strawberry glaze frosting. Pretty enough for company and the perfect treat to satisfy your sweet tooth.",
        modifier = Modifier
            .fillMaxWidth()
            .padding(top = 24.dp, start = 32.dp, end = 32.dp),
        fontSize = 14.sp,
        fontWeight = FontWeight.Bold,
        color = text,
        textAlign = TextAlign.Start
    )
    Text(
        text = "Quantity",
        modifier = Modifier
            .fillMaxWidth()
            .padding(top = 24.dp, start = 32.dp),
        fontSize = 18.sp,
        fontWeight = FontWeight.Bold,
        color = Color.Black
    )
}


@Composable
fun card(onClick: () -> Unit) {
    Column(
        modifier = Modifier
            .fillMaxSize()
            .background(tertiary)
    ) {
        Box {
            Icon(
                painter = painterResource(id = R.drawable.backspace),
                contentDescription = "back",
                tint = primary,
                modifier = Modifier
                    .padding(top = 32.dp, start = 32.dp)
                    .clickable {
                        onClick()
                    }
            )
            Image(
                painter = painterResource(id = R.drawable.donutup1),
                contentDescription = "image holder",
                modifier = Modifier.padding(start = 72.dp),

                )

        }
    }

}