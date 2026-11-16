<<<SEARCH
tasks.register("assembleDebugOnDevice") {
    doLast {
        println("""
        To build APK on Android device:
        1. Install Termux from F-Droid
        2. Run these commands:
           pkg update -y
           pkg install -y openjdk-17 gradle
           gradle assembleDebug --stacktrace --info
        3. APK will be in app/build/outputs/apk/debug/
        """.trimIndent())
    }
}
===
tasks.register("assembleDebugOnDevice") {
    doLast {
        println("""
        To build APK on Android device:
        1. Install Termux from F-Droid
        2. Run these commands:
           pkg update -y && pkg install -y openjdk-17 gradle
           ./gradlew assembleDebug --stacktrace --info --no-daemon
        3. APK will be in app/build/outputs/apk/debug/
        """.trimIndent())
    }
}
>>>REPLACE
