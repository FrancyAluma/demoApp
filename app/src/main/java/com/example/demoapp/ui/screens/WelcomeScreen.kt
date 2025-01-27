package com.example.demoapp.ui.screens

import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material3.Button
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.sp

@Composable
fun WelcomeScreen(
    lienDuBoutonClick: () -> Unit
) {
    Box(
        modifier = Modifier.fillMaxSize(),
        contentAlignment = Alignment.Center
    ) {

     Column {
         Text(text = "Welcome", fontSize = 30.sp)
         Button(
             onClick = { lienDuBoutonClick() },
             modifier = Modifier.align(Alignment.CenterHorizontally)
         ) {
             Text (text = "Click Me")
         }
     }
    }
}



