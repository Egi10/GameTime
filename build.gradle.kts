buildscript {
    repositories {
        google()
        mavenCentral()
    }
}

/*
 * IDE marks `libs` red.
 * Bug, see https://youtrack.jetbrains.com/issue/KTIJ-19369
 */
plugins {
    alias(libs.plugins.android.application) apply false
    alias(libs.plugins.kotlin.android) apply false
}