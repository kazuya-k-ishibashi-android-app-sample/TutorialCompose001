package com.kishibashi.androidapp.sample.compose.tutorial001

import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.material3.TextField
import androidx.compose.runtime.Composable
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp

@Composable
fun MainScreen() {

    val textState = remember { mutableStateOf("") }

    Scaffold(
        modifier = Modifier.fillMaxSize()
    ) { innerPadding ->

        Column(
            modifier = Modifier
                .padding(innerPadding)
                .fillMaxSize()
                .padding(horizontal = 32.dp, vertical = 40.dp)
        ) {

            TextField(
                value = textState.value,
                onValueChange = { textState.value = it },
                label = { Text("入力してください") },
                modifier = Modifier.fillMaxWidth()
            )

            Spacer(Modifier.height(40.dp))

            Text("入力内容：")

            Text(textState.value)
        }
    }
}
