package com.example.ejemplo2.navigation

import androidx.compose.runtime.Composable
import androidx.navigation.NavHost
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.rememberNavController
import com.example.ejemplo2.screens.FirstScreen
import com.example.ejemplo2.screens.SecondScreen

@Composable
fun AppNavigation(){
val navController = rememberNavController()
    NavHost(
        navController = navController,
        startDestination = AppsScreens.FirstScreen.route){
       //Navegacion implicita
        composable(route = AppsScreens.FirstScreen.route){
            FirstScreen(navController)
        }
        composable(route = AppsScreens.SecondScreen.route){
            SecondScreen(navController)
        }
    }
}