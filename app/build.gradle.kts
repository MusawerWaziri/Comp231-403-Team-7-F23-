plugins {
    id("com.android.application")
    id("org.jetbrains.kotlin.android")
    //Firebase setup
    id("com.google.gms.google-services")
}

android {
    namespace = "com.example.nutriguide"
    compileSdk = 34 //current max - 9DEC2023

    defaultConfig {
        applicationId = "com.example.nutriguide"
        minSdk = 21 //set minimum SDK to support
        targetSdk = 31 //same as in AndroidManifest.xml
        versionCode = 1
        versionName = "1.0"

        testInstrumentationRunner = "androidx.test.runner.AndroidJUnitRunner"
    }

    buildTypes {
        release {
            isMinifyEnabled = true
            proguardFiles(
                getDefaultProguardFile("proguard-android-optimize.txt"),
                "proguard-rules.pro"
            )
        }
    }
    compileOptions {
        sourceCompatibility = JavaVersion.VERSION_1_8
        targetCompatibility = JavaVersion.VERSION_1_8
    }
    kotlinOptions {
        jvmTarget = "1.8"
    }
}

dependencies {

    implementation("androidx.activity:activity:1.8.1")
    implementation("androidx.core:core-ktx:1.12.0")
    implementation("androidx.appcompat:appcompat:1.6.1")
    implementation("com.google.android.material:material:1.10.0")
    implementation("androidx.constraintlayout:constraintlayout:2.1.4")
    implementation("com.google.firebase:firebase-auth-ktx:22.3.0")
    testImplementation("junit:junit:4.13.2")
    androidTestImplementation("androidx.test.ext:junit:1.1.5")
    androidTestImplementation("androidx.test.espresso:espresso-core:3.5.1")
    implementation("androidx.recyclerview:recyclerview-selection:1.1.0")
    implementation("com.squareup.picasso:picasso:2.71828")

    //Firebase setup
    implementation(platform("com.google.firebase:firebase-bom:32.6.0"))
}