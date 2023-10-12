plugins {
    id("com.android.application")
    id("org.jetbrains.kotlin.android")

    kotlin("kapt")
    id("com.google.dagger.hilt.android")
}

android {
    namespace = "com.mmrbd.hellocompose"
    compileSdk = 34

    defaultConfig {
        applicationId = "com.mmrbd.hellocompose"
        minSdk = 24
        targetSdk = 34
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
        kotlinCompilerExtensionVersion = "1.4.3"
    }
    packaging {
        resources {
            excludes += "/META-INF/{AL2.0,LGPL2.1}"
        }
    }
    kapt {
        correctErrorTypes = true
    }

    buildFeatures {
        buildConfig = true
    }

    packaging {
        resources {
            excludes += "META-INF/DEPENDENCIES"
            excludes += "META-INF/LICENSE"
            excludes += "META-INF/LICENSE.txt"
            excludes += "META-INF/license.txt"
            excludes += "META-INF/NOTICE"
            excludes += "META-INF/NOTICE.txt"
            excludes += "META-INF/notice.txt"
            excludes += "META-INF/ASL2.0"
            excludes += "META-INF/*.kotlin_module"
            excludes += "META-INF/LICENSE.md"
            excludes += "META-INF/LICENSE-notice.md"
        }
    }
}

dependencies {
    implementation(Dependencies.AndroidX.coreKtx)
    implementation(Dependencies.AndroidX.lifecycle)

    implementation(Dependencies.Compose.activityCompose)
    implementation(platform(Dependencies.Compose.composeBom))
    implementation(Dependencies.Compose.composeUi)
    implementation(Dependencies.Compose.composeGraphics)
    implementation(Dependencies.Compose.composePreview)
    implementation(Dependencies.Compose.composeMaterial3)

    debugImplementation(Dependencies.Compose.composeTooling)
    debugImplementation(Dependencies.Compose.manifest)

    androidTestImplementation(Dependencies.Compose.androidTestJunitEtx)
    androidTestImplementation(Dependencies.Compose.androidTestEspresso)
    androidTestImplementation(platform(Dependencies.Compose.composeBom))
    androidTestImplementation(Dependencies.Compose.androidTestJunit4)
    androidTestImplementation(Dependencies.Compose.androidTestJupiter)

    testImplementation(Dependencies.Compose.testJunit)


    implementation(Dependencies.Hilt.hilt)
    kapt(Dependencies.Hilt.hiltKapt)


    implementation(Dependencies.Compose.composeNavigation)
    implementation(Dependencies.insets)
}