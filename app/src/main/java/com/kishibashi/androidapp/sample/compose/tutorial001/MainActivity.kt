package com.kishibashi.androidapp.sample.compose.tutorial001

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.compose.material3.Text

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        // edge-to-edge
        // https://developer.android.com/develop/ui/views/layout/edge-to-edge
        // https://developer.android.com/develop/ui/compose/system/insets
        enableEdgeToEdge()

        setContent {
            Text("Hello Android!")
        }
    }
}
