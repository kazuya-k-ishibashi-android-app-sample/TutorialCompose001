package com.kishibashi.androidapp.sample.compose.tutorial001

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxWidth
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

            // Standard layout components（標準レイアウトコンポーネント）
            //   > Column
            // https://developer.android.com/develop/ui/compose/layouts/basics#standard-layouts
            Column(
                modifier = Modifier
                    .padding(16.dp, 32.dp)
                    .fillMaxWidth()
                    .background(Color.LightGray)
                    .padding(8.dp)
            ) {

                Text(
                    "Hello Android!",
                    color = Color.Red,
                    modifier = Modifier
                        .background(Color.White)
                        .padding(8.dp)
                )
            }
        }
    }
}
