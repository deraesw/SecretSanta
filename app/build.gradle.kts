plugins {
    id("com.android.application")
    id("kotlin-android")
}

android {
    compileSdk = Sdk.compileSdkVersion

    defaultConfig {
        applicationId = "com.deraesw.secretsanta"
        minSdk = Sdk.minSdkVersion
        targetSdk = Sdk.targetSdkVersion
        versionCode = 1
        versionName = "1.0"

        testInstrumentationRunner = "androidx.test.runner.AndroidJUnitRunner"
        vectorDrawables {
            useSupportLibrary = true
        }
    }

    buildTypes {
        getByName("release") {
            isMinifyEnabled = false
            proguardFiles(getDefaultProguardFile("proguard-android-optimize.txt"), "proguard-rules.pro")
        }
    }
    compileOptions {
        sourceCompatibility = JavaVersion.VERSION_1_8
        targetCompatibility = JavaVersion.VERSION_1_8
    }
    kotlinOptions {
        jvmTarget = "1.8"
        useIR = true
    }
    buildFeatures {
        compose = true
    }
    composeOptions {
        kotlinCompilerExtensionVersion = ArchitectureComponent.Compose.VERSION
        kotlinCompilerVersion = Android.KOTLIN_VERSION
    }
    packagingOptions {
        resources {
            excludes += "/META-INF/{AL2.0,LGPL2.1}"
        }
    }
}

dependencies {
    implementation(fileTree(mapOf("dir" to "libs", "include" to listOf("*.jar"))))

    implementation(Android.CORE_KTX)
    implementation(Android.APPCOMPAT)
    implementation(Android.MATERIAL)

    //Compose
    implementation(ArchitectureComponent.Compose.UI)
    implementation(ArchitectureComponent.Compose.MATERIAL)
    implementation(ArchitectureComponent.Compose.UI_TOOLING_PREVIEW)
    androidTestImplementation(ArchitectureComponent.Compose.UI_TEST_JUNIT4)
    debugImplementation(ArchitectureComponent.Compose.UI_TOOLING)
    implementation(ArchitectureComponent.Compose.ACTIVITY_COMPOSE)

    //Lifecycle
    implementation(ArchitectureComponent.Lifecycle.RUNTIME)

    //Test
    testImplementation(Test.JUNIT)
    androidTestImplementation(Test.JUNIT_EXT)
    androidTestImplementation(Test.ESPRESSO_CORE)
}