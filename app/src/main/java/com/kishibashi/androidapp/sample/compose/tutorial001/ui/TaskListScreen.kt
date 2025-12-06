package com.kishibashi.androidapp.sample.compose.tutorial001.ui

import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxHeight
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.items
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Button
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.material3.TextField
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp
import java.time.Instant

@Composable
fun TaskListScreen() {

    var taskList by remember { mutableStateOf(listOf<Task>()) }

    var taskTitleInput by remember { mutableStateOf("") }

    fun addTask() {
        if (taskTitleInput.isNotBlank()) {
            val timestamp = Instant.now()
            val newTask = Task(
                id = timestamp.toEpochMilli().toString(),
                title = taskTitleInput,
                createdAt = timestamp
            )

            taskList = taskList + newTask

            taskTitleInput = ""
        }
    }

    Scaffold(
        modifier = Modifier.fillMaxSize()
    ) { innerPadding ->

        Column(
            modifier = Modifier
                .padding(innerPadding)
                .fillMaxSize()
                .padding(16.dp)
        ) {

            // タスクリスト
            LazyColumn(
                modifier = Modifier
                    .fillMaxWidth()
                    .weight(1f)
            ) {

                items(taskList) { task ->
                    Text(
                        text = task.title,
                        style = MaterialTheme.typography.bodyLarge,
                        modifier = Modifier.padding(vertical = 8.dp)
                    )
                }
            }

            // 新規タスク入力
            Row(
                modifier = Modifier
                    .fillMaxWidth()
                    .height(56.dp),
                horizontalArrangement = Arrangement.spacedBy(8.dp),
                verticalAlignment = Alignment.CenterVertically
            ) {

                TextField(
                    value = taskTitleInput,
                    onValueChange = { taskTitleInput = it },
                    modifier = Modifier.weight(1f),
                    placeholder = { Text("新しいタスク") }
                )

                Button(
                    onClick = { addTask() },
                    shape = RoundedCornerShape(12.dp),
                    modifier = Modifier.fillMaxHeight()
                ) {

                    Text("追加")
                }
            }
        }
    }
}
