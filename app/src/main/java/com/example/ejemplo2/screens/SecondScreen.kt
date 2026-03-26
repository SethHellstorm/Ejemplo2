package com.example.ejemplo2.screens

import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.PaddingValues
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.ArrowBack
import androidx.compose.material3.Button
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.Icon
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.material3.TopAppBar
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import androidx.navigation.NavController

@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun SecondScreen(navController: NavController){
    Scaffold(topBar = {
        TopAppBar(
            title = {Text("Segunda pantalla")},
            navigationIcon = {
                Icon(imageVector = Icons.Default.ArrowBack,
                    contentDescription = "Arrow Back",
                    modifier = Modifier.clickable{
                        navController.popBackStack()
                    })
            }
        )
    }) {paddingValues -> SecondBodyContent(paddingValues, navController) }
}

@Composable
fun SecondBodyContent(paddingValues: PaddingValues,navController: NavController){
    Column(
        modifier = Modifier.fillMaxSize(),
        verticalArrangement = Arrangement.Center,
        horizontalAlignment = Alignment.CenterHorizontally
    ) {
        Text("He Navegacion")
        Button(onClick = {
            navController.popBackStack()
        }) {
            Text("Regresar")
        }
    }

}
@Preview
@Composable
fun DefaultPreview2(){
    SecondScreen(
        navController = TODO()
    )
}
