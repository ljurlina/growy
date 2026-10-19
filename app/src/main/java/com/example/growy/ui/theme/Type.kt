package com.example.growy.ui.theme

import androidx.compose.material3.Typography
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.text.font.FontFamily
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.sp
import androidx.compose.ui.text.font.Font
import com.example.growy.R

val  MyTitleLarge = FontFamily(
    Font(R.font.dm_serif_display_regular, FontWeight.Normal)
)

val  MyTitleMedium = FontFamily(
    Font(R.font.poppins_black, FontWeight.Bold)
)

// Set of Material typography styles to start with
val Typography = Typography(
    titleLarge = TextStyle(
        fontFamily = MyTitleLarge,
        fontSize = 128.sp,
        lineHeight = 28.sp,
        letterSpacing = 0.sp
    ),
    titleMedium = TextStyle(
        fontFamily = MyTitleMedium,
        fontSize = 48.sp,
        lineHeight = 0.sp,
        letterSpacing = 0.sp
    ),
    bodyLarge = TextStyle(
        fontFamily = MyTitleLarge,
        fontSize = 35.sp,
        letterSpacing = 0.sp
    )
)