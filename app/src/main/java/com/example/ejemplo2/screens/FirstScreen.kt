package com.example.ejemplo2.screens

import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.PaddingValues
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material3.Button
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import androidx.navigation.NavController
import com.example.ejemplo2.navigation.AppsScreens

@Composable
fun FirstScreen(navController: NavController){
    Scaffold() {paddingValues -> BodyContent(paddingValues,navController) }
}

@Composable
fun BodyContent(paddingValues: PaddingValues, navController: NavController){
    Column(
        modifier = Modifier.fillMaxSize(),
        verticalArrangement = Arrangement.Center,
        horizontalAlignment = Alignment.CenterHorizontally
    ) {
        Text("Hola Navegacion")
        Button(onClick = {
            navController.navigate(route = AppsScreens.SecondScreen.route)
        }) {
            Text("Navega")
        }
    }

}
@Preview
@Composable
fun DefaultPreview(){
    FirstScreen(
        navController = TODO()
    )
}
