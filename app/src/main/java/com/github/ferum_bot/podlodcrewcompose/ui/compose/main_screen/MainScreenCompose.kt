package com.github.ferum_bot.podlodcrewcompose.ui.compose.main_screen

import androidx.compose.foundation.layout.*
import androidx.compose.material.Button
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.github.ferum_bot.podlodcrewcompose.ui.theme.PodlodCrewComposeTheme

@Composable
fun MainContent(buttonClick: () -> Unit ) {
    Box(
        modifier = Modifier.fillMaxSize().padding(PaddingValues(16.dp, 0.dp)),
        contentAlignment = Alignment.Center
    ) {
        Button(
            onClick = buttonClick,
            modifier = Modifier.fillMaxWidth(),
        ) {
            Text(text = "ClickMe")
        }
    }
}

@Composable
fun Greeting(name: String) {
    Text(text = "Hello $name!")
}

@Preview(showBackground = true)
@Composable
fun DefaultPreview() {
    PodlodCrewComposeTheme {
        MainContent {

        }
    }
}