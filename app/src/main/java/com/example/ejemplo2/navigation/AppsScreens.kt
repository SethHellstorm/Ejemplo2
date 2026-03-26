package com.example.ejemplo2.navigation

sealed class AppsScreens(val route : String) {
    object FirstScreen : AppsScreens("first_screen")
    object SecondScreen : AppsScreens("second_screen")
}