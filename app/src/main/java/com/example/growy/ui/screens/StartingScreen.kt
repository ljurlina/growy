package com.example.growy.ui.screens

import androidx.compose.animation.Crossfade
import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Button
import androidx.compose.material3.ButtonDefaults
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Text
import androidx.compose.runtime.*
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import kotlinx.coroutines.delay
import com.example.growy.R
import com.example.growy.ui.theme.Black
import com.example.growy.ui.theme.Cream
import com.example.growy.ui.theme.DarkPink

@Composable

fun StartingScreen(onStart: () -> Unit = {})
{
    //prilikom ulaska u app kratko učitavanje (delay) sa logotipom aplikacije

    var showSplash by remember { mutableStateOf(true) }

    LaunchedEffect(Unit) {
        delay(2000L)
        showSplash = false
    }

    val backgroud = Cream

    Box(
        modifier = Modifier
            .fillMaxSize()
            .background(backgroud)
    ) {
        Crossfade(targetState = showSplash) { inSplash ->
            if (inSplash) {
                SplashGrowy()
            }
            else{
                 WelcomeGrowy()
            }
        }
    }
}

@Composable
private fun SplashGrowy() {
    Box(
        modifier = Modifier
            .fillMaxSize(),
        contentAlignment = Alignment.Center
    ) {

        Image(
            painter = painterResource(id = R.drawable.growy_version1),
            contentDescription = "Growy logo",
            contentScale = ContentScale.Fit,
            modifier = Modifier.size(350.dp)
        )
    }
}

@Composable
@Preview (showBackground = true)
private fun WelcomeGrowy() {
    Column(
        modifier = Modifier
            .fillMaxSize()
            .padding(horizontal = 28.dp),
        horizontalAlignment = Alignment.CenterHorizontally,
        verticalArrangement = Arrangement.Center
    ) {
        // Title
        Text(
            text = "Ready",
            style = MaterialTheme.typography.titleLarge,
            color = Black
            )

        Text(
            text = "to Plant?",
            style = MaterialTheme.typography.titleMedium,
            color = DarkPink
        )

        Spacer(modifier = Modifier.height(20.dp))

        Box(
            modifier = Modifier
                .height(400.dp)
                .fillMaxWidth()
                .clip(RoundedCornerShape(16.dp))
                .background(DarkPink),
            contentAlignment = Alignment.Center,

        ){
            Image(
                painter = painterResource(id = R.drawable.hi_higherpx),
                contentDescription = "Welcoming page illustration",
                modifier = Modifier
                    .fillMaxWidth()
                    .fillMaxHeight(0.85f)
                    .align(Alignment.BottomCenter),
                contentScale = ContentScale.Crop


            )
        }
        Spacer(modifier = Modifier.height(20.dp))

        Button(
            onClick = {},
            colors = ButtonDefaults.buttonColors(containerColor = Color(0xFFD38CA0)),
            shape = RoundedCornerShape(16.dp),
            modifier = Modifier
                .height(65.dp)
                .width(260.dp)
        ) {
            Text(
                text = "Let's go",
                style = MaterialTheme.typography.bodyLarge,
                color = Cream
            )
        }
    }
}
