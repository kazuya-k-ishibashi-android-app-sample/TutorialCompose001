package com.kishibashi.androidapp.sample.compose.tutorial001.ui

import java.time.Instant

data class Task(
    val id: String,
    val title: String,
    val createdAt: Instant
)
