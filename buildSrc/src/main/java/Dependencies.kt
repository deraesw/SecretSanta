

object Sdk {
    const val compileSdkVersion = 30
    const val minSdkVersion = 21
    const val targetSdkVersion = 30
}

object ArchitectureComponent {

    object Compose {
        private const val VERSION = "1.0.1"

        const val UI = "androidx.compose.ui:ui:$VERSION"
        const val UI_TOOLING = "androidx.compose.ui:ui-tooling:$VERSION"
        const val UI_TOOLING_PREVIEW = "androidx.compose.ui:ui-tooling-preview:$VERSION"
        const val MATERIAL = "androidx.compose.material:material:$VERSION"
        const val UI_TEST_JUNIT4 = "androidx.compose.ui:ui-test-junit4:$VERSION"
    }
}
