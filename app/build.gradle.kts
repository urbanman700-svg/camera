plugins {
    id("com.android.application")
    id("org.jetbrains.kotlin.android") version "1.9.0"
}

android {
    namespace = "com.test.camera"
    compileSdk = 34

    defaultConfig {
        applicationId = "com.test.camera"
        minSdk = 21
        targetSdk = 34
        versionCode = 1
        versionName = "1.0"
    }

    compileOptions {
        sourceCompatibility = JavaVersion.VERSION_17
        targetCompatibility = JavaVersion.VERSION_17
    }

    kotlinOptions {
        jvmTarget = "17"
    }
}

dependencies {
    implementation("org.jetbrains.kotlin:kotlin-stdlib:1.9.0")
}