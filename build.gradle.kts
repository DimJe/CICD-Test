plugins {
    alias(libs.plugins.androidApplication) apply false
    alias(libs.plugins.jetbrainsKotlinAndroid) apply false
    id("org.jlleitschuh.gradle.ktlint") version "12.1.0"
}
