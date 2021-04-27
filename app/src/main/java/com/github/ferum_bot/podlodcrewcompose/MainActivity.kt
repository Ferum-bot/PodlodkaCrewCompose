package com.github.ferum_bot.podlodcrewcompose

import android.os.Bundle
import android.widget.Toast
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.layout.*
import androidx.compose.material.Button
import androidx.compose.material.MaterialTheme
import androidx.compose.material.Surface
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.github.ferum_bot.podlodcrewcompose.ui.theme.PodlodCrewComposeTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            PodlodCrewComposeTheme {
                MainContent {
                    showToast("Hello Matvey")
                }
            }
        }
    }

    private fun showToast(text: String) {
        Toast.makeText(applicationContext, text, Toast.LENGTH_SHORT).show()
    }
}

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