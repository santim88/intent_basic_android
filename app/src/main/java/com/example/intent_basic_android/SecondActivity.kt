package com.example.intent_basic_android

import android.os.Bundle
import android.os.PersistableBundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.material3.Text
import com.example.intent_basic_android.ui.theme.Intent_basic_androidTheme

class SecondActivity: ComponentActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
            setContent {
                Intent_basic_androidTheme{
                    Text(text = "SecondActivity")
            }
        }
    }
}