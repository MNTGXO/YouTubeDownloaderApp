plugins {
    id("com.android.application") version "8.4.0" apply false
    id("org.jetbrains.kotlin.android") version "1.9.22" apply false
    id("org.jetbrains.kotlin.plugin.compose") version "1.9.22" apply false
}

allprojects {
    repositories {
        google()
        mavenCentral()
    }
}

allprojects {
    repositories {
        google()
        mavenCentral()
    }
}

tasks.register("assembleDebugOnDevice") {
    doLast {
        println("""
        To build APK on Android device:
        1. Install Termux from F-Droid
        2. Run these commands:
           pkg update
           pkg install openjdk-17 gradle
           gradle assembleDebug
        3. APK will be in app/build/outputs/apk/debug/
        """.trimIndent())
    }
}

tasks.register("assembleDebugOnDevice") {
    doLast {
        println("""
        To build APK on Android device:
        1. Install Termux from F-Droid
        2. Run these commands:
           pkg update
           pkg install openjdk-17 gradle
           gradle assembleDebug
        3. APK will be in app/build/outputs/apk/debug/
        """.trimIndent())
    }
}

tasks.register("assembleDebugOnDevice") {
    doLast {
        println("""
        To build APK on Android device:
        1. Install Termux from F-Droid
        2. Run these commands:
           pkg update
           pkg install openjdk-17 gradle
           gradle assembleDebug
        3. APK will be in app/build/outputs/apk/debug/
        """.trimIndent())
    }
}

tasks.register("assembleDebugOnDevice") {
    doLast {
        println("""
        To build APK on Android device:
        1. Install Termux from F-Droid
        2. Run these commands:
           pkg update
           pkg install openjdk-17 gradle
           gradle assembleDebug
        3. APK will be in app/build/outputs/apk/debug/
        """.trimIndent())
    }
}

tasks.register("assembleDebugOnDevice") {
    doLast {
        println("""
        To build APK on Android device:
        1. Install Termux from F-Droid
        2. Run these commands:
           pkg update
           pkg install openjdk-17 gradle
           gradle assembleDebug
        3. APK will be in app/build/outputs/apk/debug/
        """.trimIndent())
    }
}
