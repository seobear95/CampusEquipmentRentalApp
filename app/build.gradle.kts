plugins {
    alias(libs.plugins.android.application)

    id("com.google.devtools.ksp")
}

android {
    namespace = "com.example.campusequipmentrentalapp"
    compileSdk {
        version = release(37)
    }

    defaultConfig {
        applicationId = "com.example.campusequipmentrentalapp"
        minSdk = 24
        targetSdk = 37
        versionCode = 1
        versionName = "1.0"

        testInstrumentationRunner = "androidx.test.runner.AndroidJUnitRunner"
    }

    buildTypes {
        release {
            optimization {
                enable = false
            }
        }
    }
    compileOptions {
        sourceCompatibility = JavaVersion.VERSION_11
        targetCompatibility = JavaVersion.VERSION_11
    }

    buildFeatures {
        viewBinding = true
    }
}

dependencies {
    implementation("androidx.core:core-ktx:1.15.0")
    implementation("androidx.appcompat:appcompat:1.7.0")
    implementation("com.google.android.material:material:1.12.0")
    implementation("androidx.fragment:fragment-ktx:1.8.5")
    implementation("androidx.navigation:navigation-fragment-ktx:2.8.9")
    implementation("androidx.navigation:navigation-ui-ktx:2.8.9")
    implementation("androidx.recyclerview:recyclerview:1.4.0")

    testImplementation("junit:junit:4.13.2")
    androidTestImplementation("androidx.test.ext:junit:1.2.1")
    androidTestImplementation("androidx.test.espresso:espresso-core:3.6.1")

    // -------------------------
// Room Database
// -------------------------

    val roomVersion = "2.8.5"

    implementation(
        "androidx.room:room-runtime:$roomVersion"
    )

    implementation(
        "androidx.room:room-ktx:$roomVersion"
    )

    ksp(
        "androidx.room:room-compiler:$roomVersion"
    )


// lifecycleScope 사용
    implementation(
        "androidx.lifecycle:lifecycle-runtime-ktx:2.11.0"
    )
}