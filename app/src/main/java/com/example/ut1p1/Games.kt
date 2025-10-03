package com.example.ut1p1

import android.widget.Toast
import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Done
import androidx.compose.material3.Checkbox
import androidx.compose.material3.FloatingActionButton
import androidx.compose.material3.Icon
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.platform.LocalContext
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.unit.dp


@Composable
fun Games() {
    val context = LocalContext.current

    val games = listOf(
        "Angry  Birds" to remember { mutableStateOf(false) },
        "Dragon Fly" to remember { mutableStateOf(false) },
        "Hill Climbing Racing" to remember { mutableStateOf(false) },
        "Radiant Defense" to remember { mutableStateOf(false) },
        "Pocket Soccer" to remember { mutableStateOf(false) },
        "Ninja Jump" to remember { mutableStateOf(false) },
        "Air Control" to remember { mutableStateOf(false) },
    )


    Box(
        modifier = Modifier
            .fillMaxSize()
            .background(Color(0xFFB9F4C9))
    ) {
        Column(
            modifier = Modifier
                .padding(16.dp)

        ) {
            games.forEach { (gameName, isChecked) ->
                Row(
                    verticalAlignment = Alignment.CenterVertically,
                    modifier = Modifier.padding(vertical = 8.dp)
                ) {
                    Image(
                        painter = painterResource(id = android.R.drawable.ic_menu_gallery),
                        contentDescription = "Game icon",
                        modifier = Modifier.padding(end = 8.dp)
                    )
                    Checkbox(
                        checked = isChecked.value,
                        onCheckedChange = { isChecked.value = it },
                    )
                    Text(
                        text = gameName,
                        modifier = Modifier.padding(start = 8.dp)
                    )
                }
            }
        }

        FloatingActionButton(
            onClick = {
                val selectedGames = games
                    .filter { it.second.value }
                    .map { it.first }

                val message = if (selectedGames.isNotEmpty()) {
                    "Has seleccionado ${selectedGames.joinToString(", ")}"
                } else {
                    "No has seleccionado ningún juego"
                }

                Toast.makeText(context, message, Toast.LENGTH_LONG).show()
            },
            modifier = Modifier
                .align(Alignment.BottomEnd)
                .padding(16.dp),
            shape = CircleShape,
            containerColor = Color(0xFFF9AA33)

        ) {
            Icon(Icons.Filled.Done, "Floating action button.")
        }
    }
}