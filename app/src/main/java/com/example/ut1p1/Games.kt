package com.example.ut1p1

import android.widget.Toast
import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Done
import androidx.compose.material3.Checkbox
import androidx.compose.material3.CheckboxDefaults
import androidx.compose.material3.FloatingActionButton
import androidx.compose.material3.Icon
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.LaunchedEffect
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.platform.LocalContext
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.unit.dp
import kotlinx.coroutines.delay

@Composable
fun Games() {
    val context = LocalContext.current

    val gameNames = listOf(
        "Angry Birds",
        "Dragon Fly",
        "Hill Climbing Racing",
        "Radiant Defense",
        "Pocket Soccer",
        "Ninja Jump",
        "Air Control"
    )

    val gameImages = listOf(
        R.drawable.games_angrybirds,
        R.drawable.games_dragonfly,
        R.drawable.games_hillclimbingracing,
        R.drawable.games_radiantdefense,
        R.drawable.games_pocketsoccer,
        R.drawable.games_ninjump,
        R.drawable.games_aircontrol
    )

    val gameStates = gameNames.map { remember { mutableStateOf(false) } }

    Box(
        modifier = Modifier
            .fillMaxSize()
            .background(Color(0xFFB9F4C9))
    ) {
        Column(
            modifier = Modifier
                .padding(16.dp)
        ) {
            gameNames.forEachIndexed { index, gameName ->
                Row(
                    verticalAlignment = Alignment.CenterVertically,
                    modifier = Modifier.padding(vertical = 8.dp)
                ) {
                    Image(
                        painter = painterResource(id = gameImages[index]),
                        contentDescription = "$gameName icon",
                        modifier = Modifier
                            .size(64.dp)
                            .padding(end = 8.dp)
                    )
                    Checkbox(
                        checked = gameStates[index].value,
                        onCheckedChange = { gameStates[index].value = it },
                        colors = CheckboxDefaults.colors(
                            checkedColor = Color(0xFF379665)
                        )
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
                val selectedGames = gameNames
                    .filterIndexed { index, _ -> gameStates[index].value } //_ Sirve para ignorar el parametro
                    .joinToString(", ")

                val message = if (selectedGames.isNotEmpty()) {
                    "Has seleccionado $selectedGames"
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