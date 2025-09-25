package com.example.ut1p1

import android.widget.Toast
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.rememberScrollState
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.foundation.verticalScroll
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Add
import androidx.compose.material3.FloatingActionButton
import androidx.compose.material3.Icon
import androidx.compose.material3.RadioButton
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.platform.LocalContext
import androidx.compose.ui.unit.dp

@Composable
fun Preferences() {
    var context = LocalContext.current
    Box() {


        Column(
            horizontalAlignment = Alignment.CenterHorizontally,
            modifier = Modifier
                .fillMaxSize()
                .background(Color(0xFFB9F4C9))
                .padding(16.dp)
                .verticalScroll(rememberScrollState())

        ) {
            Text("Elige una opción:")
            /*
        Row {
            RadioButton(false, TODO())
            Text("Angry Birds")
        }
        Row {
            RadioButton(false, TODO())
            Text("Dragon Fly")
        }
        Row {
            RadioButton(false, TODO())
            Text("Hill Climbing Racing")
        }
        Row {
            RadioButton(false, TODO())
            Text("Pocket Soccer")
        }
        Row {
            RadioButton(false, TODO())
            Text("Radiant Defense")
        }
        Row {
            RadioButton(false, TODO())
            Text("Ninja Jump")
        }
        Row {
            RadioButton(false, TODO())
            Text("Air Controll")
        }
        */

        }
        FloatingActionButton(
            onClick = {
                Toast.makeText(context, "mensaje ", Toast.LENGTH_LONG).show()
            },
            shape = CircleShape,
            modifier = Modifier
                .padding(16.dp)
                .align(alignment = Alignment.BottomEnd)
        ) {
            Icon(Icons.Filled.Add, "Floating action button.")
        }
    }
}