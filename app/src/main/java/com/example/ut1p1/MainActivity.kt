package com.example.ut1p1

import android.content.res.Configuration
import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
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
import androidx.compose.material3.Scaffold
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
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.ut1p1.ui.theme.UT1P1Theme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContent {
            UT1P1Theme {
                Scaffold(modifier = Modifier.fillMaxSize()) { innerPadding ->
                    Portada(
                        modifier = Modifier.padding(innerPadding)
                    )
                }
            }
        }
    }
}

@Composable
fun Portada(modifier: Modifier) {
    when(LocalConfiguration.current.orientation){
        Configuration.ORIENTATION_LANDSCAPE -> {
            Orientacion_Panorama("panorama")
        }else -> {
            Orientacion_Retrato("retrato")
        }
    }
}

@Composable
fun Orientacion_Retrato(name: String, modifier: Modifier = Modifier) {
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
            fontFamily = FontFamily.Cursive,
            fontWeight = FontWeight.Bold,
            textAlign = TextAlign.Center,
        )
        Spacer(modifier = modifier.size(size = 1.dp))

        val buttonTexts = listOf("Play", "New Player", "Preferences", "About")
        buttonTexts.forEachIndexed { index, text ->
            Button(
                onClick = {},
                modifier = Modifier
                    .padding(vertical = 2.dp)
                    .width(200.dp)
                    .clip(shape = RoundedCornerShape(percent = 80)),
                colors = ButtonDefaults.buttonColors(
                    containerColor = Color(0xFF379665)
                ),
            ) {
                Text(text = text)
            }
        }

        Spacer(modifier = Modifier.weight(1f))
    }
}

@Composable
fun Orientacion_Panorama(name: String, modifier: Modifier = Modifier) {
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
            fontFamily = FontFamily.Cursive,
            fontWeight = FontWeight.Bold,
            textAlign = TextAlign.Center,
        )
        Spacer(modifier = modifier.size(size = 1.dp))

        val buttonTexts = listOf("Play", "New Player", "Preferences", "About")

        Row(
            horizontalArrangement = Arrangement.spacedBy(8.dp),
            modifier = Modifier.padding(vertical = 2.dp)
        ) {
            buttonTexts.take(2).forEach { text ->
                Button(
                    onClick = {},
                    modifier = Modifier
                        .width(200.dp)
                        .clip(shape = RoundedCornerShape(percent = 80)),
                    colors = ButtonDefaults.buttonColors(
                        containerColor = Color(0xFF379665)
                    ),
                ) {
                    Text(text = text)
                }
            }
        }

        Row(
            horizontalArrangement = Arrangement.spacedBy(8.dp),
            modifier = Modifier.padding(vertical = 2.dp)
        ) {
            buttonTexts.drop(2).forEach { text ->
                Button(
                    onClick = {},
                    modifier = Modifier
                        .width(200.dp)
                        .clip(shape = RoundedCornerShape(percent = 80)),
                    colors = ButtonDefaults.buttonColors(
                        containerColor = Color(0xFF379665)
                    ),
                ) {
                    Text(text = text)
                }
            }
        }

        Spacer(modifier = Modifier.weight(1f))
    }
}

@Preview(showBackground = true)
@Composable
fun GreetingPreview() {
    UT1P1Theme {
        Portada(
            modifier = TODO()
        )
    }
}