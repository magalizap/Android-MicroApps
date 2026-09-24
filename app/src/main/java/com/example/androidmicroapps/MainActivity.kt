package com.example.androidmicroapps

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.sp
import com.example.androidmicroapps.composables.ButtonExample
import com.example.androidmicroapps.composables.CounterScreen
import com.example.androidmicroapps.composables.ImageExample
import com.example.androidmicroapps.composables.ListExample
import com.example.androidmicroapps.composables.ProfileScreen
import com.example.androidmicroapps.composables.TextExample
import com.example.androidmicroapps.composables.TextFieldExample
import com.example.androidmicroapps.core.AppNavigation
import com.example.androidmicroapps.features.MenuScreen
import com.example.androidmicroapps.ui.theme.AndroidMicroAppsTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContent {
            AndroidMicroAppsTheme(dynamicColor = false) {
                AppNavigation()
            }
        }
    }
}

@Preview(showBackground = true)
@Composable
fun Example() {
    Text(text = "Hola, esto es un test", fontSize = 40.sp)
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
    AndroidMicroAppsTheme {
        Greeting("Android")
    }
}