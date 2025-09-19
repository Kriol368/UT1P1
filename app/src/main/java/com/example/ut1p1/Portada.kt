package com.example.ut1p1

import android.content.res.Configuration.ORIENTATION_LANDSCAPE
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Button
import androidx.compose.material3.ButtonDefaults
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.platform.LocalConfiguration
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.text.font.FontFamily
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.navigation.NavHostController
import com.example.ut1p1.ui.theme.FontTittle

@Composable
fun Portada(navController: NavHostController) {
    when (LocalConfiguration.current.orientation) {
        ORIENTATION_LANDSCAPE -> {
            Orientacion_Panorama(navController)
        }

        else -> {
            Orientacion_Retrato(navController)
        }
    }
}

@Composable
fun Orientacion_Retrato(navController: NavHostController) {
    Column(
        horizontalAlignment = Alignment.CenterHorizontally,
        modifier = Modifier
            .fillMaxSize()
            .background(Color(0xFFB9F4C9))
    ) {
        Spacer(modifier = Modifier.weight(1f))

        Text(
            text = stringResource(id = R.string.header),
            fontSize = 55.sp,
            fontFamily = FontTittle,
            textAlign = TextAlign.Center,
        )
        Spacer(modifier = Modifier.size(size = 10.dp))

        // Play Button
        Button(
            onClick = { navController.navigate("Play") },
            modifier = Modifier
                .padding(vertical = 2.dp)
                .width(200.dp)
                .clip(shape = RoundedCornerShape(percent = 80)),
            colors = ButtonDefaults.buttonColors(
                containerColor = Color(0xFF379665)
            ),
        ) {
            Text(text = "Play")
        }

        // New Player Button
        Button(
            onClick = { navController.navigate("NewPlayer") },
            modifier = Modifier
                .padding(vertical = 2.dp)
                .width(200.dp)
                .clip(shape = RoundedCornerShape(percent = 80)),
            colors = ButtonDefaults.buttonColors(
                containerColor = Color(0xFF379665)
            ),
        ) {
            Text(text = "New Player")
        }

        // Preferences Button
        Button(
            onClick = { navController.navigate("Preferences") },
            modifier = Modifier
                .padding(vertical = 2.dp)
                .width(200.dp)
                .clip(shape = RoundedCornerShape(percent = 80)),
            colors = ButtonDefaults.buttonColors(
                containerColor = Color(0xFF379665)
            ),
        ) {
            Text(text = "Preferences")
        }

        // About Button
        Button(
            onClick = { navController.navigate("About") },
            modifier = Modifier
                .padding(vertical = 2.dp)
                .width(200.dp)
                .clip(shape = RoundedCornerShape(percent = 80)),
            colors = ButtonDefaults.buttonColors(
                containerColor = Color(0xFF379665)
            ),
        ) {
            Text(text = "About")
        }

        Spacer(modifier = Modifier.weight(1f))
    }
}

@Composable
fun Orientacion_Panorama(navController: NavHostController) {
    Column(
        horizontalAlignment = Alignment.CenterHorizontally,
        modifier = Modifier
            .fillMaxSize()
            .background(Color(0xFFB9F4C9))
    ) {
        Spacer(modifier = Modifier.weight(1f))

        Text(
            text = stringResource(id = R.string.header),
            fontSize = 55.sp,
            fontFamily = FontTittle,
            textAlign = TextAlign.Center,
        )
        Spacer(modifier = Modifier.size(size = 1.dp))

        Row(
            horizontalArrangement = Arrangement.spacedBy(8.dp),
            modifier = Modifier.padding(vertical = 2.dp)
        ) {
            // Play Button
            Button(
                onClick = { navController.navigate("Play") },
                modifier = Modifier
                    .width(200.dp)
                    .clip(shape = RoundedCornerShape(percent = 80)),
                colors = ButtonDefaults.buttonColors(
                    containerColor = Color(0xFF379665)
                ),
            ) {
                Text(text = "Play")
            }

            // New Player Button
            Button(
                onClick = { navController.navigate("NewPlayer") },
                modifier = Modifier
                    .width(200.dp)
                    .clip(shape = RoundedCornerShape(percent = 80)),
                colors = ButtonDefaults.buttonColors(
                    containerColor = Color(0xFF379665)
                ),
            ) {
                Text(text = "New Player")
            }
        }

        Row(
            horizontalArrangement = Arrangement.spacedBy(8.dp),
            modifier = Modifier.padding(vertical = 2.dp)
        ) {
            // Preferences Button
            Button(
                onClick = { navController.navigate("Preferences") },
                modifier = Modifier
                    .width(200.dp)
                    .clip(shape = RoundedCornerShape(percent = 80)),
                colors = ButtonDefaults.buttonColors(
                    containerColor = Color(0xFF379665)
                ),
            ) {
                Text(text = "Preferences")
            }

            // About Button
            Button(
                onClick = { navController.navigate("About") },
                modifier = Modifier
                    .width(200.dp)
                    .clip(shape = RoundedCornerShape(percent = 80)),
                colors = ButtonDefaults.buttonColors(
                    containerColor = Color(0xFF379665)
                ),
            ) {
                Text(text = "About")
            }
        }

        Spacer(modifier = Modifier.weight(1f))
    }
}