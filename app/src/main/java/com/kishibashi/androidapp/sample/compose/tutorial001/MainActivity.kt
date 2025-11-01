package com.kishibashi.androidapp.sample.compose.tutorial001

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Text
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.unit.dp

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        // edge-to-edge
        // https://developer.android.com/develop/ui/views/layout/edge-to-edge
        // https://developer.android.com/develop/ui/compose/system/insets
        enableEdgeToEdge()

        setContent {
            Text(
                "Hello Android!",
                color = Color.Red,
                // Modifierは、順序や重ねがけの影響を受ける
                modifier = Modifier
                    .padding(horizontal = 16.dp, vertical = 32.dp)
                    .background(Color.LightGray)
                    .padding(8.dp)
                    .background(Color.White)
                    .padding(8.dp)
            )
        }
    }
}
