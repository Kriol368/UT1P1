package com.example.ut1p1

import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material3.Button
import androidx.compose.material3.ButtonDefaults
import androidx.compose.material3.Text
import androidx.compose.material3.TextField
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource

@Composable
fun NewPlayer() {

    var nombre by remember { mutableStateOf("Nombre") }
    var apellidos by remember { mutableStateOf("Apellidos") }
    var nickname by remember { mutableStateOf("Nickname") }
    var telefono by remember { mutableStateOf("Teléfono") }
    var email by remember { mutableStateOf("Email") }

    Column(
        horizontalAlignment = Alignment.CenterHorizontally,
        modifier = Modifier
            .fillMaxSize()
            .background(Color(0xFFB9F4C9))
    ) {
        Row {
            Image(
                painter = painterResource(R.drawable.account),
                contentDescription = null
            )
            TextField(
                value = nombre,
                onValueChange = { nombre = it },
                label = { Text("Name") }
            )
        }
        TextField(
            value = apellidos,
            onValueChange = { apellidos = it }
        )
        TextField(
            value = nickname,
            onValueChange = { nickname = it }
        )
        Row {
            Image(
                painter = painterResource(R.drawable.android),
                contentDescription = null
            )
            Button(
                onClick = {},
                colors = ButtonDefaults.buttonColors(
                    containerColor = Color(0xFFF9AA33)
                ),

                ) {
                Text(
                    text = "Change",
                    color = Color.Black
                )
            }
        }
        Row {
            Image(
                painter = painterResource(R.drawable.camera),
                contentDescription = null
            )
            TextField(
                value = telefono,
                onValueChange = { telefono = it }
            )
        }
        Row {
            Image(
                painter = painterResource(R.drawable.email),
                contentDescription = null
            )
            TextField(
                value = email,
                onValueChange = { email = it }
            )
        }
    }
}