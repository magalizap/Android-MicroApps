# Android Micro Apps

[![Kotlin](https://img.shields.io/badge/Kotlin-2.0.21-7F52FF?logo=kotlin&logoColor=white)](https://kotlinlang.org/)
[![Jetpack Compose](https://img.shields.io/badge/Jetpack%20Compose-UI-4285F4?logo=jetpackcompose&logoColor=white)](https://developer.android.com/jetpack/compose)
[![Android](https://img.shields.io/badge/Android-API%2026%2B-3DDC84?logo=android&logoColor=white)](https://developer.android.com/)
[![Gradle](https://img.shields.io/badge/Gradle-Kotlin%20DSL-02303A?logo=gradle&logoColor=white)](https://gradle.org/)
[![License](https://img.shields.io/badge/License-To%20be%20defined-lightgrey)](#license)

A learning-focused Android application built with Kotlin and Jetpack Compose. The project brings together several small, independent experiences in one app to practice modern Android UI development, navigation, API integration, state handling, and local preferences.

> Project status: Educational project in active development.

## Overview

Android Micro Apps provides a simple home menu from which users can access different mini-app experiences:

- BMI Calculator — calculates and displays a body mass index result.
- Dogs — loads dog content from a remote API and displays it in the app.
- Settings — provides a dedicated settings area for experimenting with preferences and app configuration.
- Compose examples — reusable examples covering common UI concepts such as buttons, text fields, lists, images, layouts, modifiers, and state.

The project is intended as a practical learning playground rather than a production-ready health or medical application.

## Features

- Modern declarative UI with Jetpack Compose
- Material 3 components and a custom application theme
- Navigation between the menu, BMI flow, settings, and dogs feature
- BMI result screen with back navigation
- Remote data loading using Retrofit and Kotlin Serialization
- Image loading with Coil
- Preferences support through Jetpack DataStore
- Separate feature packages to keep the code easy to explore and extend

## Tech Stack

| Category | Technology |
| --- | --- |
| Language | Kotlin |
| UI | Jetpack Compose, Material 3 |
| Navigation | AndroidX Navigation 3 |
| Networking | Retrofit |
| Serialization | Kotlinx Serialization |
| Image loading | Coil |
| Local preferences | Jetpack DataStore Preferences |
| Build system | Gradle Kotlin DSL, Version Catalog |
| Minimum Android version | API 26 |
| Compile SDK | API 37 |
| Java compatibility | Java 11 |

## Project Structure

```text
Android-MicroApps/
├── app/
│   ├── src/
│   │   ├── main/
│   │   │   ├── java/com/example/androidmicroapps/
│   │   │   │   ├── composables/            # Reusable Jetpack Compose examples
│   │   │   │   ├── core/                   # Navigation and routes
│   │   │   │   │   ├── AppNavigation.kt
│   │   │   │   │   └── Routes.kt
│   │   │   │   ├── features/               # Feature screens
│   │   │   │   │   ├── dogs/               # Dogs feature and API integration
│   │   │   │   │   ├── imc/                # BMI calculator flow
│   │   │   │   │   └── settings/           # Settings feature
│   │   │   │   ├

