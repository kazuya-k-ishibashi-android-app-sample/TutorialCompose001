package com.kishibashi.androidapp.sample.compose.tutorial001.ui

import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.setValue
import androidx.lifecycle.ViewModel
import kotlinx.coroutines.flow.MutableStateFlow
import kotlinx.coroutines.flow.StateFlow
import kotlinx.coroutines.flow.asStateFlow
import java.time.Instant
import kotlin.collections.plus
import kotlin.text.isNotBlank

class TaskListViewModel : ViewModel() {

    // 「新しいタスク」テキストフィールドの入力値
    //   ＝ UI のみで使う入力値
    //   ＝ mutableStateOf で軽量に管理
    var taskTitleInput by mutableStateOf("")
        private set

    // タスク一覧
    // Repository と連携される
    //   ＝ StateFlow（Kotlin Flow）
    private val _taskList = MutableStateFlow<List<Task>>(emptyList())
    val taskList: StateFlow<List<Task>> = _taskList.asStateFlow()

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

            _taskList.value = _taskList.value + newTask

            taskTitleInput = ""
        }
    }
}
