package com.example.growy.ui.screens

import androidx.compose.material3.Button
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.platform.LocalFocusManager
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.example.growy.ui.theme.Cream
import androidx.compose.foundation.layout.*
import androidx.compose.ui.res.painterResource
import androidx.compose.foundation.Image
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.foundation.text.KeyboardOptions
import androidx.compose.material3.ButtonDefaults
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Text
import androidx.compose.material3.TextField
import androidx.compose.material3.TextFieldDefaults
import androidx.compose.ui.draw.shadow
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.input.ImeAction
import androidx.compose.ui.text.input.KeyboardType
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.unit.sp
import com.example.growy.R
import com.example.growy.ui.theme.Black
import com.example.growy.ui.theme.LightOlive
import com.example.growy.ui.theme.Olive

@Composable
@Preview
fun NameScreen (
   // onSkip: () -> Unit,
   // onContinue: (String) -> Unit
) {
    var name by remember { mutableStateOf("") }

    val focusManager = LocalFocusManager.current

    Column(
        modifier = Modifier
            .fillMaxSize()
            .background(Cream)
            .padding(horizontal = 28.dp),
        horizontalAlignment = Alignment.CenterHorizontally
    ) {
        Spacer(Modifier.height(28.dp))

        Image(
            painter = painterResource(id = R.drawable.sun),
            contentDescription = "Sun",
            modifier = Modifier.size(200.dp)
        )

        Spacer(Modifier.height(18.dp))

        Text(
            text = "What should\nwe call you?",
            style = MaterialTheme.typography.bodyLarge,
            color = Black,
            textAlign = TextAlign.Center,

            )

        Spacer(Modifier.height(14.dp))
        Text(
            text = "This helps us personalize your\n experience.",
            style = MaterialTheme.typography.bodyMedium,
            color = Olive,
            textAlign = TextAlign.Center,
        )
        Spacer(Modifier.height(14.dp))

        TextField(
            value = name,
            onValueChange = { name = it },
            placeholder = {
                Text(
                    text = "Enter your name",
                    color = LightOlive,
                    fontSize = 16.sp,
                    modifier = Modifier.fillMaxWidth(),
                    textAlign = TextAlign.Center

                )
            },
            singleLine = true,
            keyboardOptions = KeyboardOptions(
                keyboardType = KeyboardType.Text,
                imeAction = ImeAction.Done
            ),
            colors = TextFieldDefaults.colors(
                focusedContainerColor = Color.Transparent,
                unfocusedContainerColor = Color.Transparent,
                disabledContainerColor = Color.Transparent,
            ),

        )
        Spacer(Modifier.height(14.dp))
        
        Row(
            modifier = Modifier.fillMaxWidth(),
            horizontalArrangement = Arrangement.spacedBy(16.dp)
        ) {
            GrowyPillButton(
                text = "Skip for now",
                container = Olive,
                content = Color.White,
                onClick = {
                    focusManager.clearFocus()
                },
                modifier = Modifier.weight(1f)
            )

            GrowyPillButton(
                text = "Continue",
                container = Olive,
                content = Color.White,
                onClick = {
                    focusManager.clearFocus()
                },
                modifier = Modifier.weight(1f)
            )
        }

    }
}


@Composable
private fun GrowyPillButton(
    text: String,
    container: Color,
    content: Color,
    onClick: () -> Unit,
    modifier: Modifier = Modifier
) {
    Button(
        onClick = onClick,
        shape = RoundedCornerShape(14.dp),
        colors = ButtonDefaults.buttonColors(
            containerColor = container,
            contentColor = content
        ),
        contentPadding = PaddingValues(vertical = 14.dp),
        modifier = modifier
            .height(54.dp)
            .shadow(
                elevation = 10.dp,
                shape = RoundedCornerShape(14.dp),
                clip = false
            )
    ) {
        Text(
            text = text,
            fontSize = 14.sp,
            fontWeight = FontWeight.SemiBold
        )
    }
}


