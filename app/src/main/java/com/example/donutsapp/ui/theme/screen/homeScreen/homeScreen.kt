package com.example.donutsapp.ui.theme.screen.homeScreen

import androidx.compose.foundation.ScrollState
import androidx.compose.foundation.background
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.PaddingValues
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.lazy.LazyRow
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.foundation.verticalScroll
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.collectAsState
import androidx.compose.runtime.getValue
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.hilt.navigation.compose.hiltViewModel
import androidx.navigation.NavController
import com.example.donutsapp.R
import com.example.donutsapp.ui.theme.screen.homeScreen.composable.HomeCard
import com.example.donutsapp.ui.theme.screen.homeScreen.composable.HomeDownCard
import com.example.donutsapp.ui.theme.screen.homeScreen.composable.bottombar

@Composable
fun HomeScreen(
    navController: NavController,
    viewModel: HomeViewModel = hiltViewModel(),

) {
    val state by viewModel.state.collectAsState()

    HomeContent(
        CardUIState = state,
        onClick = {
            navController.navigate("ItemScreen")
        }
    )
}

@Composable
fun HomeContent(
    CardUIState: homeUiState,
    onClick: () -> Unit

) {
    Column(
        modifier = Modifier
            .fillMaxSize()
            .background(Color.White)
            .padding(start = 16.dp, top = 48.dp)
            .verticalScroll(state = ScrollState(0), enabled = true)
    ) {
        Header()
        Spacer32()
        Text(
            text = stringResource(R.string.today_offers),
            color = Color.Black,
            fontSize = 20.sp,
            fontWeight = FontWeight.Bold
        )
        Spacer16()
        DonutRow(CardUIState, onClick =  onClick )
        Spacer32()
        Text(
            text = "Donuts",
            color = Color.Black,
            fontSize = 20.sp,
            fontWeight = FontWeight.Bold
        )

        LowerLazyRow(CardUIState)
        Spacer16()
        bottombar()
    }
}

@Composable
private fun LowerLazyRow(CardUIState: homeUiState) {
    LazyRow(
        contentPadding = PaddingValues(top = 64.dp),
        content = {
            items(CardUIState.listOfCardsSmaller.size) {
                Box(

                    modifier = Modifier
                        .padding(end = 12.dp)
                        .background(
                            color = Color(0xFFFED8DF),
                            shape = RoundedCornerShape(20.dp)
                        )
                        .clickable { },

                    ) {
                    HomeDownCard(
                        CardImg = CardUIState.listOfCardsSmaller[it].img,
                        name = CardUIState.listOfCardsSmaller[it].name
                    )
                }
            }
        })
}

@Composable
private fun DonutRow(
    CardUIState: homeUiState,
    onClick: () -> Unit
) {
    LazyRow(
        modifier = Modifier.fillMaxWidth(),
        contentPadding = PaddingValues(start = 16.dp, end = 16.dp),
        content = {
            items(CardUIState.listOfCards.size) {
                Box(
                    modifier = Modifier
                        .padding(end = 64.dp)
                        .background(
                            color = Color(0xFFFED8DF),
                            shape = RoundedCornerShape(20.dp)
                        ),

                    ) {
                    HomeCard(
                        CardImg = CardUIState.listOfCards[it].img,
                        color = CardUIState.listOfCards[it].color,
                        onClick = onClick
                    )
                }
            }
        })
}


@Composable
private fun Spacer32() {
    Spacer(modifier = Modifier.height(32.dp))
}

@Composable
private fun Spacer16() {
    Spacer(modifier = Modifier.height(16.dp))
}


@Composable
private fun Header() {
    Row {
        HeaderText()
        HeaderIcon()
    }

    }




