package com.kishibashi.androidapp.sample.compose.tutorial001.ui

import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.setValue
import androidx.lifecycle.ViewModel
import java.time.Instant
import kotlin.collections.plus
import kotlin.text.isNotBlank

class TaskListViewModel : ViewModel() {

    var taskTitleInput by mutableStateOf("")
        private set

    var taskList by mutableStateOf(listOf<Task>())
        private set

    fun updateTaskTitleInput(value: String) {
        taskTitleInput = value
    }

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
}
