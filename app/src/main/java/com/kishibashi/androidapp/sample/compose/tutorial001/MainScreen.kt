package com.kishibashi.androidapp.sample.compose.tutorial001

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.unit.dp

@Composable
fun MainScreen() {

    Scaffold(
        modifier = Modifier.fillMaxSize()
    ) { innerPadding ->

        Column(
            modifier = Modifier
                .padding(innerPadding)
                .fillMaxWidth()
                .background(Color.LightGray)
                .padding(8.dp)
        ) {

            Text(
                text = "Hello Android!",
                color = Color.Red,
                modifier = Modifier
                    .background(Color.White)
                    .padding(8.dp)
            )

            Spacer(Modifier.height(20.dp))

            Text(
                text = "Jetpack Compose",
                color = Color.Red,
                modifier = Modifier
                    .background(Color.White)
                    .padding(8.dp)
            )
        }
    }
}
