package com.example.androidmicroapps.composables

import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Button
import androidx.compose.material3.Text
import androidx.compose.material3.TextField
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableIntStateOf
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.saveable.rememberSaveable
import androidx.compose.runtime.setValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp

@Composable
fun CounterScreen(modifier: Modifier) {
    var counter by rememberSaveable() { mutableIntStateOf(23) }
    var counter2 by rememberSaveable() { mutableIntStateOf(24) }

    var name by rememberSaveable() { mutableStateOf("") }

    Column(modifier) {
        Counter( counter = counter, onIncrement = {counter++})
        Counter( counter = counter2, onIncrement = {counter2++})
        TextFieldCounter(name = name, onValueChange = {name = it})
    }

}

@Composable
fun Counter(
    modifier: Modifier = Modifier,
    counter: Int,
    onIncrement:() -> Unit
) {
    Column(modifier = modifier.padding(30.dp)) {
        Text("Pulsaciones: $counter")
        Button(onClick = {onIncrement()}) {
            Text("Sumar")
        }
    }
}

@Composable
fun TextFieldCounter(
    modifier: Modifier = Modifier,
    name: String,
    onValueChange: (String) -> Unit
) {
    Box(modifier = modifier, contentAlignment = Alignment.Center){
        TextField(
            value = name,
            onValueChange = { onValueChange(it) },
            label = { Text("Example") }
        )
    }
}