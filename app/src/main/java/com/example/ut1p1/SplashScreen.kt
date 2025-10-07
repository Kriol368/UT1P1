package com.example.ut1p1

import androidx.compose.foundation.layout.Box
import androidx.compose.runtime.Composable
import androidx.compose.runtime.LaunchedEffect
import androidx.navigation.NavHostController
import kotlinx.coroutines.delay

@Composable
fun SplashScreen(navController: NavHostController) {
    Box {

    }
    LaunchedEffect(true) {
        delay(2000)
        navController.navigate("Portada")
    }
}