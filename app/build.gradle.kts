plugins {
    id("com.android.application")
    kotlin("android")
    kotlin("kapt")
    id("kotlin-parcelize")
    id("androidx.navigation.safeargs.kotlin")
    kotlin("plugin.serialization") version "1.9.10"
//    id("com.google.gms.google-services")
//    id("com.google.firebase.crashlytics")
}

android {
    namespace = "com.dode.dopaminedetox"
    compileSdk = sdkCompileVersion

    defaultConfig {
        applicationId = "com.dode.dopaminedetox"
        minSdk = sdkMinVersion
        targetSdk = sdkTargetVersion
        versionCode = 1
        versionName = "1.0"

        testInstrumentationRunner = "androidx.test.runner.AndroidJUnitRunner"
        vectorDrawables {
            useSupportLibrary = true
        }
    }

    buildTypes {
        release {
            isMinifyEnabled = false
            proguardFiles(
                getDefaultProguardFile("proguard-android-optimize.txt"),
                "proguard-rules.pro"
            )
        }
    }
    compileOptions {
        sourceCompatibility = JavaVersion.VERSION_17
        targetCompatibility = JavaVersion.VERSION_17
    }
    kotlinOptions {
        jvmTarget = "17"
    }
    buildFeatures {
        compose = true
    }
    composeOptions {
        kotlinCompilerExtensionVersion = compose_compiler_version
    }
    packaging {
        resources {
            excludes += "/META-INF/{AL2.0,LGPL2.1}"
        }
    }
}

dependencies {
    implementation(Dependency.KTX.CORE)
    implementation(Dependency.KTX.LIFECYCLE)
    implementation(platform(Dependency.AndroidX.COMPOSE_BOM))
    implementation(Dependency.AndroidX.APP_COMPAT)
    implementation(Dependency.AndroidX.ACTIVITY_COMPOSE)
    implementation(Dependency.AndroidX.COMPOSE_UI)
    implementation(Dependency.AndroidX.COMPOSE_UI_GRAPHICS)
    implementation(Dependency.AndroidX.COMPOSE_UI_TOOLING)
    implementation(Dependency.AndroidX.COMPOSE_UI_TOOLING_PREVIEW)
    implementation(Dependency.AndroidX.COMPOSE_MATERIAL3)

    implementation(Dependency.Serialization.kotlinxSerialization)
    implementation(Dependency.Serialization.kotlinxSerializationConverter)


    // Test
    testImplementation(Dependency.Test.JUNIT)
    androidTestImplementation(Dependency.AndroidTest.TEST_RUNNER)
    androidTestImplementation(Dependency.AndroidTest.ESPRESSO_CORE)
    androidTestImplementation(platform(Dependency.AndroidX.COMPOSE_BOM))
    androidTestImplementation(Dependency.AndroidX.COMPOSE_UI_TEST_JUNIT4)
    debugImplementation(Dependency.AndroidX.COMPOSE_UI_TOOLING)
    debugImplementation(Dependency.AndroidX.COMPOSE_UI_TEST_MANIFEST)
}