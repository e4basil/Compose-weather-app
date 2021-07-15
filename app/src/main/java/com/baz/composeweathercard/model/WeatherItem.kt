package com.baz.composeweathercard.model

import androidx.annotation.DrawableRes

data class WeatherItem(
    val date: String,
    val temperature: Int,
    val precipitation: Int,
    val windSpeed: Int,
    @DrawableRes
    val icon: Int
)