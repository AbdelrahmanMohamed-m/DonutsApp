package com.example.donutsapp.ui.theme.screen.homeScreen

import androidx.compose.ui.graphics.Color
import androidx.lifecycle.ViewModel
import com.example.donutsapp.R
import com.example.donutsapp.ui.theme.primary
import dagger.hilt.android.lifecycle.HiltViewModel
import kotlinx.coroutines.flow.MutableStateFlow
import kotlinx.coroutines.flow.asStateFlow
import kotlinx.coroutines.flow.update
import javax.inject.Inject

@HiltViewModel
class HomeViewModel @Inject constructor()  : ViewModel() {


    private val _state = MutableStateFlow(homeUiState())
    val state = _state.asStateFlow()

    init {
        getDonutImages()
        getSmallerDonutImages()
    }

fun getSmallerDonutImages() {
        _state.update {
            it.copy(
                listOfCardsSmaller = listOf(
                    CardSmallerUiState(
                        name ="Chocolate Cherry",
                        img = R.drawable.donutdown2,
                    ),
                    CardSmallerUiState(
                        name ="Strawberry Rain",
                        img = R.drawable.donutdown1,
                    ),
                    CardSmallerUiState(
                        name ="Strawberry doughnut",
                        img = R.drawable.donutdown3,
                    ),
                )

            )
        }
    }
    fun getDonutImages() {
        _state.update {
            it.copy(
                listOfCards = listOf(
                    CardUIState(
                        img = R.drawable.donutup1,
                        color = Color(0xFFD7E4F6)
                    ),
                    CardUIState(
                        img = R.drawable.donutup2,
                        color = primary
                    ),
                )
            )
        }
    }


}