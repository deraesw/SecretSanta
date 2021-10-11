

object Sdk {
    const val compileSdkVersion = 30
    const val minSdkVersion = 21
    const val targetSdkVersion = 30
}

object Android {

    const val KOTLIN_VERSION = "1.5.21"
    const val CORE_KTX = "androidx.core:core-ktx:1.6.0"
    const val APPCOMPAT = "androidx.appcompat:appcompat:1.3.1"
    const val MATERIAL = "com.google.android.material:material:1.4.0"
}

object ArchitectureComponent {

    object Compose {
        const val VERSION = "1.0.1"

        const val UI = "androidx.compose.ui:ui:$VERSION"
        const val UI_TOOLING = "androidx.compose.ui:ui-tooling:$VERSION"
        const val UI_TOOLING_PREVIEW = "androidx.compose.ui:ui-tooling-preview:$VERSION"
        const val MATERIAL = "androidx.compose.material:material:$VERSION"
        const val UI_TEST_JUNIT4 = "androidx.compose.ui:ui-test-junit4:$VERSION"
        const val ACTIVITY_COMPOSE = "androidx.activity:activity-compose:1.3.0-alpha06"
    }

    object Lifecycle {
        const val RUNTIME = "androidx.lifecycle:lifecycle-runtime-ktx:2.3.1"
        const val EXTENSIONS = "androidx.lifecycle:lifecycle-extensions:2.2.0"
    }
}

object Test {

    const val JUNIT = "junit:junit:4.+"
    const val JUNIT_EXT = "androidx.test.ext:junit:1.1.2"
    const val ESPRESSO_CORE = "androidx.test.espresso:espresso-core:3.4.0"
}
