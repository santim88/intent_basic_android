package com.example.intent_basic_android

import android.content.ActivityNotFoundException
import android.content.Intent
import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material3.Button
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import com.example.intent_basic_android.ui.theme.Intent_basic_androidTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            Intent_basic_androidTheme {
                Column(
                    modifier = Modifier.fillMaxSize(),
                    verticalArrangement = Arrangement.Center,
                    horizontalAlignment = Alignment.CenterHorizontally
                ) {
                    Button(onClick = {
                      /*  Intent(applicationContext, SecondActivity::class.java).also {
                            startActivity(it)
                        }*/
                        /*Intent(Intent.ACTION_MAIN).also {
                            it.`package` = "com.google.android.youtube"
                            try {
                                startActivity(it)
                            }catch (e: ActivityNotFoundException
                            ){
                                e.printStackTrace()
                            }
                        }*/
                        Intent(Intent.ACTION_MAIN).apply {
                            type = "text/plain"
                            putExtra(Intent.EXTRA_EMAIL, arrayListOf("test@test.com"))
                            putExtra(Intent.EXTRA_SUBJECT, "this is my subject")
                            putExtra(Intent.EXTRA_TEXT, "this is the content")
                        }
                    }) {
                        Text(text = "Click me")
                    }
                }
            }
        }
    }
}

@Composable
fun Greeting(name: String, modifier: Modifier = Modifier) {
    Text(
        text = "Hello $name!",
        modifier = modifier
    )
}

@Preview(showBackground = true)
@Composable
fun GreetingPreview() {
    Intent_basic_androidTheme {
        Greeting("Android")
    }
}