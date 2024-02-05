const val sdkCompileVersion = 34
const val sdkTargetVersion = 34
const val sdkMinVersion = 21

//kotlin
const val kotlinVersion = "1.9.10"

//compose
const val compose_compiler_version = "1.5.3"

object Dependency {
    object Kotlin {
        const val SDK = "org.jetbrains.kotlin:kotlin-stdlib-jdk8:1.5.21"
    }

    object AndroidX {
        const val APP_COMPAT = "androidx.appcompat:appcompat:1.6.1"

        const val ACTIVITY_COMPOSE = "androidx.activity:activity-compose:1.8.2"
        const val COMPOSE_UI = "androidx.compose.ui:ui"
        const val COMPOSE_UI_GRAPHICS = "androidx.compose.ui:ui-graphics"
        const val COMPOSE_UI_TOOLING = "androidx.compose.ui:ui-tooling"
        const val COMPOSE_UI_TOOLING_PREVIEW = "androidx.compose.ui:ui-tooling-preview"
        const val COMPOSE_MATERIAL3 = "androidx.compose.material3:material3"
        const val COMPOSE_BOM = "androidx.compose:compose-bom:2023.03.00"

        const val COMPOSE_UI_TEST_JUNIT4 = "androidx.compose.ui:ui-test-junit4"
        const val COMPOSE_UI_TEST_MANIFEST = "androidx.compose.ui:ui-test-manifest"
    }

    object Serialization {
        const val kotlinxSerialization = "org.jetbrains.kotlinx:kotlinx-serialization-json:1.3.2"
        const val kotlinxSerializationConverter =
            "com.jakewharton.retrofit:retrofit2-kotlinx-serialization-converter:0.8.0"
    }

    object KTX {
        const val CORE = "androidx.core:core-ktx:1.12.0"
        const val LIFECYCLE = "androidx.lifecycle:lifecycle-runtime-ktx:2.7.0"
    }

    object Test {
        const val JUNIT = "junit:junit:4.13.2"
        const val ANDROID_JUNIT_RUNNER = "AndroidJUnitRunner"
    }

    object AndroidTest {
        const val TEST_RUNNER = "androidx.test.ext:junit:1.1.5"
        const val ESPRESSO_CORE = "androidx.test.espresso:espresso-core:3.5.1"
    }
}