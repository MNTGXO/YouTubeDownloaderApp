tasks.register("assembleDebugOnDevice") {
    doLast {
        println("""
        📱 To build APK on Android device:
        1. Install Termux from F-Droid
        2. Run these commands:
           pkg update -y && pkg install -y openjdk-17 gradle
           ./gradlew assembleDebug --stacktrace --info --no-daemon --warning-mode all
        3. Find APK in: app/build/outputs/apk/debug/
        """.trimIndent())
    }
}
=======
tasks.register("assembleDebugOnDevice") {
    doLast {
        println("""
        📱 To build APK on Android device:
        1. Install Termux from F-Droid
        2. Run these commands:
           pkg update -y && pkg install -y openjdk-17 gradle
           ./gradlew assembleDebug --stacktrace --info --no-daemon --warning-mode all
        3. Find APK in: app/build/outputs/apk/debug/
        """.trimIndent())
    }
}
===
tasks.register("assembleDebugOnDevice") {
    doLast {
        println("""
        📱 To build APK on Android device:
        1. Install Termux from F-Droid
        2. Run these commands:
           pkg update -y && pkg install -y openjdk-17 gradle
           ./gradlew assembleDebug --stacktrace --info --no-daemon --warning-mode all
        3. Find APK in: app/build/outputs/apk/debug/
        """.trimIndent())
    }
}
>>>REPLACE
