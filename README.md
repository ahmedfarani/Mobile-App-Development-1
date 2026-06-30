<div align="center">

# 📲 Mobile App Development I - Course Projects

**A collection of 10 standalone Android apps built while learning core Android development concepts, from "Hello World" to a multi-screen ordering app.**

![Java](https://img.shields.io/badge/Java-007396?logo=java&logoColor=white)
![Android](https://img.shields.io/badge/Android-3DDC84?logo=android&logoColor=white)
![Gradle](https://img.shields.io/badge/Build-Gradle-02303A?logo=gradle&logoColor=white)

</div>

---

## 📖 Overview

This repository gathers the practical projects completed during an introductory **Mobile App Development** course. Each folder is a **fully independent, runnable Android Studio / Gradle project**, each isolating one core Android concept - UI events, intents, persistence, lists, fragments, and dialogs - culminating in **DroidCafe**, a small multi-screen ordering app that combines everything learned.

## 📁 Projects

| Project | Concept |
|---|---|
| **`FirstProject`** / **`HelloToast`** | Basic Activity setup, button click events, `Toast` messages, view binding |
| **`ScrollingText`** | Scrollable text layouts |
| **`Explicitlntent`** | Explicit Intents between two activities, `startActivityForResult`, full Activity lifecycle logging (`onCreate` → `onDestroy`), and state restoration via `onSaveInstanceState` |
| **`ImplicitTntent`** | Implicit Intents - opening a URL (`ACTION_VIEW`), opening a map location (`geo:` URI), and sharing text via the system share sheet (`ShareCompat`) |
| **`SharedPrefs`** | Persisting a click counter and a selected background color across app restarts using `SharedPreferences` |
| **`RecyclerView`** | A `RecyclerView` + custom `Adapter`/`ViewHolder` rendering a list of words, with per-item click handling |
| **`DroidCafe1` → `DroidCafe3`** | A progressively-built dessert ordering app - combining Intents, Spinners, CheckBox-gated buttons, `AlertDialog` confirmation, and (by `DroidCafe3`) a `DatePickerFragment` for delivery date selection |

## 🛠️ Tech Stack

- **Java** - application logic for every project
- **Android SDK** - `View Binding`, `EdgeToEdge` display, AndroidX (`AppCompat`, `RecyclerView`, `ConstraintLayout`)
- **Gradle (Kotlin DSL)** - each sub-project has its own independent `build.gradle.kts` and Gradle wrapper

## 🚀 Getting Started

```bash
git clone https://github.com/ahmedfarani/Mobile-App-Development-1.git
cd Mobile-App-Development-1
```

Each subfolder (e.g. `DroidCafe3/`, `RecyclerView/`) is a **separate Android Studio project**. Open the one you want to run directly in Android Studio, let Gradle sync, and run on an emulator or device - there is no shared parent build file.

## 📁 Project Structure

```
Mobile-App-Development-1/
├── FirstProject/        # Each folder below is an independent Gradle project
├── HelloToast/
├── ScrollingText/
├── Explicitlntent/
├── ImplicitTntent/
├── SharedPrefs/
├── RecyclerView/
├── DroidCafe1/
├── DroidCafe2/
└── DroidCafe3/             # Final, most feature-complete version
```

## 📜 License

This project is open source and available for personal or educational use.

---

<div align="center">

Coursework by **Ahmed Farani**

</div>
