object Dependencies {

    const val insets = "com.google.accompanist:accompanist-insets:0.23.1"

    object AndroidX {
        const val coreKtx = "androidx.core:core-ktx:${Versions.coreKtx}"
        const val lifecycle = "androidx.lifecycle:lifecycle-runtime-ktx:${Versions.lifecycle}"
    }

    object Compose {
        const val activityCompose = "androidx.activity:activity-compose:${Versions.activityCompose}"
        const val composeBom = "androidx.compose:compose-bom:${Versions.composeBom}"
        const val composeUi = "androidx.compose.ui:ui"
        const val composeGraphics = "androidx.compose.ui:ui-graphics"
        const val composePreview = "androidx.compose.ui:ui-tooling-preview"
        const val composeTooling = "androidx.compose.ui:ui-tooling"
        const val composeMaterial3 = "androidx.compose.material3:material3"
        const val manifest = "androidx.compose.ui:ui-test-manifest"
        const val composeNavigation = "androidx.navigation:navigation-compose:${Versions.composeNavigation}"

        const val androidTestJunitEtx = "androidx.test.ext:junit:${Versions.testJunitEtx}"
        const val androidTestEspresso =
            "androidx.test.espresso:espresso-core:${Versions.testEspresso}"
        const val androidTestJunit4 = "androidx.compose.ui:ui-test-junit4"
        const val androidTestJupiter = "org.junit.jupiter:junit-jupiter:${Versions.testJupiter}"

        const val testJunit = "junit:junit:${Versions.testJunit}"

    }

    object Hilt {
        const val hilt = "com.google.dagger:hilt-android:${Versions.hilt}"
        const val hiltKapt = "com.google.dagger:hilt-android-compiler:${Versions.hilt}"
    }

    object Navigation {
        const val navigation = ""
    }
}