package com.example.forecastscreen2

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Add
import androidx.compose.material.icons.filled.ArrowBack
import androidx.compose.material.icons.filled.LocationOn
import androidx.compose.material.icons.filled.MoreVert
import androidx.compose.material3.Button
import androidx.compose.material3.Icon
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.forecastscreen2.ui.theme.ForecastScreen2Theme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            ForecastScreen2Theme {
                // A surface container using the 'background' color from the theme
                Surface(
                    modifier = Modifier.fillMaxSize(),
                    color = MaterialTheme.colorScheme.background
                ) {
                   LocationScreen()
                }
            }
        }
    }
}

@Composable
fun LocationScreen() {
    Column(
        modifier = Modifier.fillMaxSize()
    ) {
        Row(
            modifier = Modifier
                .fillMaxWidth()
                .padding(start = 16.dp, top = 5.dp),
            verticalAlignment = Alignment.Top
        ) {
            Column(
                modifier = Modifier.weight(0.7f)
            ) {
                Row(
                    modifier = Modifier.fillMaxWidth(),
                    verticalAlignment = Alignment.CenterVertically,
                    horizontalArrangement = Arrangement.SpaceBetween
                ) {
                    Icon(
                        imageVector = Icons.Default.ArrowBack,
                        contentDescription = "Back Arrow",
                        tint = Color.Black
                    )

                    Text("LOCATIONS", fontWeight = FontWeight.Bold)

                    Icon(
                        imageVector = Icons.Default.MoreVert,
                        contentDescription = "Dot Menu",
                        tint = Color.Black
                    )
                }
                Spacer(modifier = Modifier.height(50.dp))
                Text(
                    text = "You are currently getting results from the popular places of Pakistan",
                    lineHeight = 20.sp, // Adjust the line height as needed
                )
                Spacer(modifier = Modifier.height(20.dp))
                Button(onClick = { /* TODO */ }) {
                    Text("Choose Place")
                }
            }
            Box(
                modifier = Modifier
                    .weight(0.3f)
                    .height(220.dp)
                    .background(Color.LightGray)
            ) {3
                Column(
                    modifier = Modifier
                        .fillMaxSize(),
                    verticalArrangement = Arrangement.Center,
                    horizontalAlignment = Alignment.CenterHorizontally
                ) {
                    Icon(
                        imageVector = Icons.Default.Add,
                        contentDescription = "Add Icon",
                        tint = Color.Black
                    )

                    Text(
                        "Add Place",
                        fontWeight = FontWeight.Bold
                    )
                }
            }

        }
        Row(
            modifier = Modifier
                .fillMaxWidth()
                .background(Color.Gray)
                .padding(16.dp),
            horizontalArrangement = Arrangement.SpaceBetween,
        ) {
            Column{
                Text(
                    text = "Lahore",
                    color = Color.White,
                )
                Spacer(modifier = Modifier.height(5.dp))
                Text(
                    text = "Humidity: 51%",
                    color = Color.White,
                    fontSize = 12.sp,
                    fontWeight = FontWeight.Light
                )
            }
            Column {
                Text(
                    text = "28, Sunny",
                    color = Color.White,
                )
            }
        }

        Row(
            modifier = Modifier
                .fillMaxWidth()
                .padding(16.dp),
            horizontalArrangement = Arrangement.SpaceBetween
        ) {
            Column {
                Text(
                    text = "Lahore"
                )
                Spacer(modifier = Modifier.height(5.dp))
                Text(
                    text = "Humidity: 51%",
                    fontWeight = FontWeight.Light,
                    fontSize = 12.sp,
                )
            }
            Column {
                Text(
                    text = "28, Sunny"
                )
            }
        }

        Row(
            modifier = Modifier
                .fillMaxWidth()
                .padding(16.dp),
            horizontalArrangement = Arrangement.SpaceBetween
        ) {
            Column {
                Text(
                    text = "Lahore"
                )
                Spacer(modifier = Modifier.height(5.dp))
                Text(
                    text = "Humidity: 51%",
                    fontWeight = FontWeight.Light,
                    fontSize = 12.sp,
                )
            }
            Column {
                Text(
                    text = "28, Sunny"
                )
            }
        }

    }
}

@Preview(showBackground = true)
@Composable
fun GreetingPreview() {
    ForecastScreen2Theme {
        LocationScreen()
    }
}