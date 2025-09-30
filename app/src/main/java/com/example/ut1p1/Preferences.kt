package com.example.ut1p1

import android.widget.Toast
import androidx.compose.foundation.background
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.rememberScrollState
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.foundation.verticalScroll
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Done
import androidx.compose.material.icons.filled.Star
import androidx.compose.material.icons.outlined.Star
import androidx.compose.material3.FloatingActionButton
import androidx.compose.material3.Icon
import androidx.compose.material3.RadioButton
import androidx.compose.material3.Slider
import androidx.compose.material3.SliderDefaults
import androidx.compose.material3.SmallFloatingActionButton
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableFloatStateOf
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.platform.LocalContext
import androidx.compose.ui.unit.dp

@Composable
fun Preferences() {
    val context = LocalContext.current
    var seleccion by remember { mutableStateOf("") }
    var puntuacion by remember { mutableFloatStateOf(1f) }
    var estrellas by remember { mutableFloatStateOf(1f) }

    val games = listOf(
        "Angry Birds",
        "Dragon Fly",
        "Hill Climbing Racing",
        "Pocket Soccer",
        "Radiant Defense",
        "Ninja Jump",
        "Air Controll"
    )

    Box {
        Column(
            modifier = Modifier
                .fillMaxSize()
                .background(Color(0xFFB9F4C9))
                .padding(16.dp)
                .verticalScroll(rememberScrollState())
        ) {
            Text(
                "Elige una opción:",
                modifier = Modifier
                    .padding(bottom = 16.dp)
                    .align(Alignment.CenterHorizontally)
            )

            games.forEach { game ->
                Row(
                    modifier = Modifier.padding(start = 8.dp),
                    verticalAlignment = Alignment.CenterVertically
                ) {
                    RadioButton(
                        selected = seleccion == game,
                        onClick = { seleccion = game }
                    )
                    Text(game, modifier = Modifier.padding(start = 8.dp))
                }
            }

            Slider(
                value = puntuacion,
                onValueChange = { puntuacion = it },
                valueRange = 1f..10f,
                steps = 8,
                colors = SliderDefaults.colors(
                    thumbColor = Color(0xFF379665),
                    activeTrackColor = Color(0xFF379665),
                ),
                modifier = Modifier
                    .padding(horizontal = 16.dp, vertical = 8.dp)
            )

            Row(
                modifier = Modifier.padding(bottom = 16.dp)
            ) {
                for (i in 1..10) {
                    Icon(
                        imageVector = if (i <= estrellas) Icons.Filled.Star else Icons.Outlined.Star,
                        contentDescription = "Star $i",
                        tint = if (i <= estrellas) Color(0xFF379665) else Color.Gray,
                        modifier = Modifier
                            .padding(end = 12.dp)
                            .clickable { estrellas = i.toFloat() }
                    )
                }
            }

            Text(
                "Plataformas:",
                modifier = Modifier
                    .padding(bottom = 16.dp)
            )

            Row {
                //Filter chips here
            }

        }

        Column(
            modifier = Modifier
                .padding(16.dp)
                .align(alignment = Alignment.BottomEnd)
        ) {
            SmallFloatingActionButton(
                onClick = {
                    val message = if (seleccion.isNotEmpty()) {
                        "Has seleccionado $seleccion con ${estrellas.toInt()} estrellas"
                    } else {
                        "No has pulsado ninguna opción"
                    }
                    Toast.makeText(context, message, Toast.LENGTH_LONG).show()
                },
                shape = CircleShape,
                containerColor = Color(0xFFABEABE),
                modifier = Modifier
                    .padding(bottom = 8.dp)
                    .align(alignment = Alignment.CenterHorizontally)
            ) {
                Icon(Icons.Filled.Star, "Rating button")
            }

            FloatingActionButton(
                onClick = {
                    val message = if (seleccion.isNotEmpty()) {
                        "Has seleccionado $seleccion con una puntuacion de ${puntuacion.toInt()}"
                    } else {
                        "No has pulsado ninguna opción"
                    }
                    Toast.makeText(context, message, Toast.LENGTH_LONG).show()
                },
                shape = CircleShape,
                containerColor = Color(0xFFF9AA33)
            ) {
                Icon(Icons.Filled.Done, "Floating action button.")
            }
        }
    }
}