package com.example.androidmicroapps.features.settings

import android.content.Context
import androidx.datastore.preferences.core.booleanPreferencesKey
import androidx.datastore.preferences.core.edit
import androidx.datastore.preferences.core.stringPreferencesKey
import com.example.androidmicroapps.features.settings.PreferenceKey.NOTIFICATIONS
import com.example.androidmicroapps.features.settings.PreferenceKey.SOUNDS
import com.example.androidmicroapps.features.settings.PreferenceKey.VIBRATIONS
import com.example.androidmicroapps.features.settings.PreferenceKey.USERNAME
import androidx.datastore.preferences.preferencesDataStore
import kotlinx.coroutines.flow.Flow
import kotlinx.coroutines.flow.map

val Context.datastore by preferencesDataStore("settings")

private object PreferenceKey {
    val NOTIFICATIONS = booleanPreferencesKey("notifications")
    val SOUNDS = booleanPreferencesKey("sounds")
    val VIBRATIONS = booleanPreferencesKey("vibrations")
    val USERNAME = stringPreferencesKey("username")
}

class SettingsDataStore(private val context: Context){
    val getNotificationEnabled: Flow<Boolean> = context.datastore.data.map { preferences ->
        preferences[NOTIFICATIONS]?: true
    }

    suspend fun setNotificationsEnable(enabled: Boolean){
        context.datastore.edit { preferences ->
            preferences[NOTIFICATIONS] = enabled
        }
    }

    val getSoundsEnable: Flow<Boolean> = context.datastore.data.map { preferences ->
        preferences[SOUNDS] ?: true
    }

    suspend fun setSoundsEnable(enabled: Boolean){
        context.datastore.edit { preferences ->
            preferences[SOUNDS] = enabled
        }
    }

    val getVibrationsEnabled: Flow<Boolean> = context.datastore.data.map { preferences ->
        preferences[VIBRATIONS] ?: true
    }

    suspend fun setVibrationsEnable(enabled: Boolean){
        context.datastore.edit {  preferences ->
            preferences[VIBRATIONS] = enabled
        }
    }

    val getUsername: Flow<String> = context.datastore.data.map {  preferences ->
        preferences[USERNAME] ?: ""
    }

    suspend fun setUsername(username:String){
        context.datastore.edit { preferences ->
            preferences[USERNAME] = username
        }
    }

    suspend fun resetSettings() {
        context.datastore.edit { preferences ->
            preferences.clear()
        }
    }
}