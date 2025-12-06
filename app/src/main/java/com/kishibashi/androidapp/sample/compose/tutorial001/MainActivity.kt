package com.kishibashi.androidapp.sample.compose.tutorial001

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.lifecycle.viewmodel.compose.viewModel
import com.kishibashi.androidapp.sample.compose.tutorial001.ui.TaskListScreen
import com.kishibashi.androidapp.sample.compose.tutorial001.ui.TaskListViewModel
import com.kishibashi.androidapp.sample.compose.tutorial001.ui.theme.AppTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        // edge-to-edge
        // https://developer.android.com/develop/ui/views/layout/edge-to-edge
        // https://developer.android.com/develop/ui/compose/system/insets
        enableEdgeToEdge()

        setContent {
            val taskListViewModel: TaskListViewModel = viewModel()

            // Theme
            // https://developer.android.com/develop/ui/compose/designsystems/material3#material-theming
            AppTheme {
                TaskListScreen(viewModel = taskListViewModel)
            }
        }
    }
}
