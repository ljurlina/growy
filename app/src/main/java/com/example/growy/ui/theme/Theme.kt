package com.example.growy.ui.theme

import androidx.compose.material3.MaterialTheme
import androidx.compose.runtime.Composable

@Composable
fun GrowyTheme(content: @Composable () -> Unit) {
    MaterialTheme(
        typography = Typography,
        content = content
    )
}
