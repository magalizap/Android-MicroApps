package com.example.androidmicroapps.core

import androidx.compose.runtime.Composable
import androidx.navigation3.runtime.entryProvider
import androidx.navigation3.runtime.rememberNavBackStack
import androidx.navigation3.ui.NavDisplay
import com.example.androidmicroapps.features.MenuScreen
import com.example.androidmicroapps.features.dogs.DogsScreen
import com.example.androidmicroapps.features.imc.ImcScreen
import com.example.androidmicroapps.features.imc.ImcResultScreen
import com.example.androidmicroapps.features.settings.SettingsScreen

@Composable
fun AppNavigation() {

    val backStack = rememberNavBackStack(Menu)

    NavDisplay(backStack = backStack, entryProvider = entryProvider {
        entry <Menu> {
            MenuScreen(
                onImcSelected = {backStack.add(IMC)},
                onSettingsSelected = {backStack.add(Settings)},
                onDogsSelected = {backStack.add(Dogs)}
            )
        }

        entry<IMC> {
            ImcScreen(onResultSelected = {backStack.add(IMCResult(it))}, onBackSelected = {backStack.removeLastOrNull()})
        }

        entry<IMCResult> { data ->
            ImcResultScreen(data.result, onBackSelected = {backStack.removeLastOrNull()})
        }

        entry<Settings> {
            SettingsScreen(onBackSelected = {backStack.removeLastOrNull()})
        }

        entry<Dogs> {
            DogsScreen(onBackSelected = {backStack.removeLastOrNull()})
        }

    })
}