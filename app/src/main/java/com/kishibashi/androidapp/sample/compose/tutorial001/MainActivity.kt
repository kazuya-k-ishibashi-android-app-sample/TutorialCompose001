package com.kishibashi.androidapp.sample.compose.tutorial001

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Scaffold
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

            // Scaffold（土台）
            // - edge-to-edgeと連携し、適切なinnerPaddingを提供する。
            // - topBar, bottomBar, floatingActionButtonなどの標準的なUIを構築するAPIを提供する。
            // https://developer.android.com/develop/ui/compose/components/scaffold
            Scaffold(
                modifier = Modifier.fillMaxSize()
            ) { innerPadding ->

                Column(
                    modifier = Modifier
                        .padding(innerPadding)
                        //.padding(16.dp, 32.dp)
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

                    Spacer(Modifier.height(20.dp))

                    Text(
                        "Jetpack Compose",
                        color = Color.Red,
                        modifier = Modifier
                            .background(Color.White)
                            .padding(8.dp)
                    )
                }
            }
        }
    }
}
