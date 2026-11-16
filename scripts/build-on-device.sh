#!/bin/bash
echo "Setting up Termux build environment..."
pkg update -y
pkg install -y openjdk-17 gradle

echo "Building debug APK..."
gradle assembleDebug --stacktrace --info

echo "APK location:"
find app/build/outputs/apk/debug/ -name "*.apk"
