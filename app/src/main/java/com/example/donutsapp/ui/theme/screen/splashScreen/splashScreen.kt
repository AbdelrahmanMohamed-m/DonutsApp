package com.example.donutsapp.ui.theme.screen.splashScreen

import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Button
import androidx.compose.material3.ButtonDefaults
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.text.font.FontWeight.Companion.Bold
import androidx.compose.ui.text.style.BaselineShift
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.hilt.navigation.compose.hiltViewModel
import androidx.navigation.NavController
import com.example.donutsapp.R
import com.example.donutsapp.ui.theme.primary

@Composable
fun SplashScreen(

    NavController: NavController,
    viewModel: SplashViewModel = hiltViewModel(),

    ) {

    SplashContent(
        onClick = {
            NavController.navigate("HomeScreen")
        }
    )
}

@Composable
fun SplashContent(
    onClick: () -> Unit = {}
) {

    Column(
        modifier = Modifier.fillMaxSize()
    ) {
        Box {
            BackGroundScreen()
            Body(onClick = onClick)
        }

    }

}


@Composable
private fun Body(
    onClick: () -> Unit = {}
) {
    Column(Modifier.fillMaxSize().padding(16.dp)) {
        Box(modifier = Modifier.weight(0.6f))
            Texts()
            ButtonGetstarted(onClick)
        Box(modifier = Modifier.weight(0.1f))
    }
}


@Composable
private fun ButtonGetstarted(onClick: () -> Unit) {
    Button(
        onClick = { onClick() },
        modifier = Modifier
            .fillMaxWidth().padding(top = 24.dp)
            .height(56.dp),
        colors = ButtonDefaults.buttonColors(
            containerColor = Color.White,
        ),
    ) {
        Text(

            text = stringResource(R.string.get_started),
            fontSize = 18.sp,
            fontWeight = Bold,
            color = Color.Black,
        )
    }
}

@Composable
private fun Texts() {
    Column() {
        Text(
            text = stringResource(R.string.go_nuts_with_donuts),
            fontSize = 54.sp,
            fontWeight = Bold,
            color = primary,
            textAlign = TextAlign.Start,
            modifier = Modifier.padding(bottom = 24.dp),
            style = TextStyle(baselineShift = BaselineShift(0.1f))

        )

        Text(
            text = stringResource(R.string.text2),
            fontSize = 18.sp,
            fontWeight = Bold,
            color = primary,
        )
    }

}


@Composable
private fun BackGroundScreen() {
    Image(
        painter = painterResource(id = R.drawable.backgoroundscreen),
        contentDescription = "Background",
        modifier = Modifier.fillMaxSize(),
        contentScale = ContentScale.FillBounds
    )
}
