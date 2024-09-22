package com.example.demoapp.navigation

import androidx.compose.runtime.Composable
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.rememberNavController
import com.example.demoapp.ui.screens.ProductScreen
import com.example.demoapp.ui.screens.WelcomeScreen

@Composable
fun AppNavigation() {
    // step 1 : NavController

    val navController = rememberNavController()

    // step2 : NavHost
    NavHost(
        navController = navController,
        startDestination = "Welcome"
    ) {
        // step 3: Composables that represent different screens

        composable("Welcome") {
            WelcomeScreen(
                lienDuBoutonClick = { navController.navigate("product-screen") }
            )
        }
        composable("product-screen") {
            ProductScreen()

        }

    }


}