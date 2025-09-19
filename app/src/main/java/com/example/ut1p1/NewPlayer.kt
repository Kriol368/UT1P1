package com.example.ut1p1

import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Button
import androidx.compose.material3.ButtonDefaults
import androidx.compose.material3.Text
import androidx.compose.material3.TextField
import androidx.compose.material3.TextFieldDefaults
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.unit.dp

@Composable
fun NewPlayer() {

    var nombre by remember { mutableStateOf("") }
    var apellidos by remember { mutableStateOf("") }
    var nickname by remember { mutableStateOf("") }
    var telefono by remember { mutableStateOf("") }
    var email by remember { mutableStateOf("") }

    Column(
        horizontalAlignment = Alignment.CenterHorizontally,
        modifier = Modifier
            .fillMaxSize()
            .background(Color(0xFFB9F4C9))
            .padding(16.dp)
    ) {
        Row(
            modifier = Modifier.fillMaxWidth(),
            horizontalArrangement = Arrangement.End,
            verticalAlignment = Alignment.CenterVertically
        ) {
            Image(
                painter = painterResource(R.drawable.account),
                contentDescription = null,
                modifier = Modifier
                    .padding(end = 8.dp)
                    .size(56.dp)
            )
            TextField(
                value = nombre,
                onValueChange = { nombre = it },
                label = { Text("Name") },
                modifier = Modifier
                    .width(275.dp)
                    .padding(bottom = 30.dp)
                    .clip(shape = RoundedCornerShape(percent = 80)),
                colors = TextFieldDefaults.colors(
                    focusedContainerColor = Color(0xFF8DD5A8),
                    unfocusedContainerColor = Color(0xFF8DD5A8),
                )
            )
        }

        TextField(
            value = apellidos,
            onValueChange = { apellidos = it },
            label = { Text("Apellidos") },
            modifier = Modifier
                .width(275.dp)
                .padding(bottom = 30.dp)
                .align(Alignment.End)
                .clip(shape = RoundedCornerShape(percent = 80)),
            colors = TextFieldDefaults.colors(
                focusedContainerColor = Color(0xFF8DD5A8),
                unfocusedContainerColor = Color(0xFF8DD5A8),
            )
        )

        TextField(
            value = nickname,
            onValueChange = { nickname = it },
            label = { Text("Nickname") },
            modifier = Modifier
                .width(275.dp)
                .padding(bottom = 30.dp)
                .align(Alignment.End)
                .clip(shape = RoundedCornerShape(percent = 80)),
            colors = TextFieldDefaults.colors(
                focusedContainerColor = Color(0xFF8DD5A8),
                unfocusedContainerColor = Color(0xFF8DD5A8),
            )
        )

        Row(
            modifier = Modifier.fillMaxWidth(),
            horizontalArrangement = Arrangement.Center,
            verticalAlignment = Alignment.CenterVertically
        ) {
            Image(
                painter = painterResource(R.drawable.android),
                contentDescription = null,
            )
            Button(
                onClick = {},
                colors = ButtonDefaults.buttonColors(
                    containerColor = Color(0xFFF9AA33)
                ),
                modifier = Modifier
                    .padding(bottom = 40.dp)
                    .padding(horizontal = 8.dp)
            ) {
                Text(
                    text = "Change",
                    color = Color.Black
                )
            }
        }

        Row(
            modifier = Modifier.fillMaxWidth(),
            horizontalArrangement = Arrangement.End,
            verticalAlignment = Alignment.CenterVertically
        ) {
            Image(
                painter = painterResource(R.drawable.camera),
                contentDescription = null,
                modifier = Modifier
                    .padding(end = 8.dp)
                    .size(56.dp)
            )
            TextField(
                value = telefono,
                onValueChange = { telefono = it },
                label = { Text("Teléfono") },
                modifier = Modifier
                    .width(275.dp)
                    .padding(bottom = 30.dp)
                    .padding(top = 20.dp)
                    .clip(shape = RoundedCornerShape(percent = 80)),
                colors = TextFieldDefaults.colors(
                    focusedContainerColor = Color(0xFF8DD5A8),
                    unfocusedContainerColor = Color(0xFF8DD5A8),
                )
            )
        }

        Row(
            modifier = Modifier.fillMaxWidth(),
            horizontalArrangement = Arrangement.End,
            verticalAlignment = Alignment.CenterVertically
        ) {
            Image(
                painter = painterResource(R.drawable.email),
                contentDescription = null,
                modifier = Modifier
                    .padding(end = 8.dp)
                    .size(56.dp)
            )
            TextField(
                value = email,
                onValueChange = { email = it },
                label = { Text("Email") },
                modifier = Modifier
                    .width(275.dp)
                    .padding(bottom = 30.dp)
                    .clip(shape = RoundedCornerShape(percent = 80)),
                colors = TextFieldDefaults.colors(
                    focusedContainerColor = Color(0xFF8DD5A8),
                    unfocusedContainerColor = Color(0xFF8DD5A8),
                )
            )
        }
    }
}

