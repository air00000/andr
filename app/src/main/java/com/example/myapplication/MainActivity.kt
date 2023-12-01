package com.example.myapplication

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.clickable
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember

import androidx.compose.runtime.setValue
import androidx.compose.ui.Modifier
import androidx.lifecycle.ViewModel


class MainActivity : ComponentActivity() {
    // val viewModel: MyViewModel1 by viewModels()
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            Screen0()
        }
    }
}


@Composable
fun Screen0() {
    var i by remember {
        mutableStateOf(0)
    }
    Text(
        text = "Клики: $i",
        modifier = Modifier.clickable(onClick = { i++ } )
    )
}


