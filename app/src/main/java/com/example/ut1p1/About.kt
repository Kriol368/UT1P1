package com.example.ut1p1

import android.widget.Toast
import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.items
import androidx.compose.material3.HorizontalDivider
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.platform.LocalContext
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp

data class User(
    val name: String,
    val points: Int,
    val imageRes: Int
)

val users = listOf(
    User("María Mata", 2014, R.drawable.image1),
    User("Antonio Sanz", 2056, R.drawable.image2),
    User("Carlos Pérez", 5231, R.drawable.image3),
    User("Beatriz Martos", 1892, R.drawable.image4),
    User("Sandra Alegre", 3400, R.drawable.image5),
    User("Alex Serrat", 5874, R.drawable.image6),
    User("Ana Peris", 2238, R.drawable.image7),
    User("David Martínez", 2525, R.drawable.image8)
)

@Composable
fun About() {
    val context = LocalContext.current

    Box {
        LazyColumn(
            modifier = Modifier
                .fillMaxSize()
                .background(Color(0xFFB9F4C9))
                .padding(16.dp)
        ) {
            items(
                items = users
            ) { user ->
                UserItem(
                    user = user,
                    onItemClick = {
                        Toast.makeText(context, user.name, Toast.LENGTH_SHORT).show()
                    }
                )
                HorizontalDivider(
                    thickness = 1.dp,
                    color = MaterialTheme.colorScheme.onSurface.copy(alpha = 0.2f)
                )
            }
        }
    }
}

@Composable
fun UserItem(
    user: User,
    onItemClick: () -> Unit
) {
    Row(
        modifier = Modifier
            .fillMaxWidth()
            .clickable(onClick = onItemClick)
            .padding(16.dp),
        verticalAlignment = Alignment.CenterVertically
    ) {
        Image(
            painter = painterResource(id = user.imageRes),
            contentDescription = "Imagen de ${user.name}",
            modifier = Modifier
                .size(60.dp)
                .background(
                    color = MaterialTheme.colorScheme.primaryContainer,
                    shape = MaterialTheme.shapes.medium
                )
                .padding(8.dp)
        )

        Spacer(modifier = Modifier.width(16.dp))

        Column {
            Text(
                text = user.name,
                style = MaterialTheme.typography.titleMedium.copy(
                    fontWeight = FontWeight.Bold,
                    fontSize = 18.sp
                ),
                color = MaterialTheme.colorScheme.onBackground
            )

            Spacer(modifier = Modifier.height(4.dp))

            Text(
                text = "${user.points} puntos",
                style = MaterialTheme.typography.bodyMedium,
                color = MaterialTheme.colorScheme.onSurfaceVariant
            )
        }
    }
}