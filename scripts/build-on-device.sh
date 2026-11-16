<<<SEARCH
#!/bin/bash
echo "Setting up Termux build environment..."
pkg update -y
pkg install -y openjdk-17 gradle

echo "Building debug APK..."
gradle assembleDebug --stacktrace --info

echo "APK location:"
find app/build/outputs/apk/debug/ -name "*.apk"
===
#!/bin/bash
set -e  # Exit on error

echo "Setting up Termux build environment..."
pkg update -y && pkg install -y openjdk-17 gradle

echo "Building debug APK..."
./gradlew assembleDebug --stacktrace --info --no-daemon

echo "APK built successfully at:"
find app/build/outputs/apk/debug/ -name "*.apk" -exec ls -lh {} \;
>>>REPLACE
