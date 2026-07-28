plugins {
    id 'com.android.application'
    id 'org.jetbrains.kotlin.android' version '1.9.22'
}

android {
    namespace 'com.test.camera'
    compileSdk 35

    defaultConfig {
        applicationId "com.test.camera"
        minSdk 21
        targetSdk 35
        versionCode 1
        versionName "1.0"

        compileOptions {
            sourceCompatibility JavaVersion.VERSION_17
            targetCompatibility JavaVersion.VERSION_17
        }
        kotlinOptions {
            jvmTarget = "17"
        }
    }

    buildTypes {
        release {
            minifyEnabled false
            proguardFiles getDefaultProguardFile('proguard-android-optimize.txt'), 'proguard-rules.pro'
        }
        debug {
        }
    }
}

dependencies {
    implementation "org.jetbrains.kotlin:kotlin-stdlib:1.9.22"
}