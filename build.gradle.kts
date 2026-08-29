plugins {
    id("com.android.application")
    id("org.jetbrains.kotlin.android")
}

android {
    namespace = "com.memoryenglish.app"
    compileSdk = 35

    defaultConfig {
        applicationId = "com.memoryenglish.app"
        minSdk = 26
        targetSdk = 35
        versionCode = 2
        versionName = "0.2.0"
    }

    buildFeatures {
        buildConfig = true
    }
}

dependencies {
    // Android framework APIs only. No third-party runtime libraries.
}
