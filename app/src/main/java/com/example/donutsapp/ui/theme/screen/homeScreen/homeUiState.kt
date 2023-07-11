package com.example.donutsapp.ui.theme.screen.homeScreen

data class homeUiState(
    val listOfCards: List<CardUIState> = emptyList(),
    val listOfCardsSmaller: List<CardSmallerUiState> = emptyList(),
)

data class CardUIState(
    val img: Int = 0,
    val color: androidx.compose.ui.graphics.Color = androidx.compose.ui.graphics.Color.White,
)

data class CardSmallerUiState(
    val img: Int = 0,
    val name: String = "",
)