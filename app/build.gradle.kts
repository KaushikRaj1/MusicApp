plugins {
    alias(libs.plugins.android.application)
    alias(libs.plugins.kotlin.android)
}

android {
    namespace = "com.kaushik1.musicapp"
    compileSdk = 35

    defaultConfig {
        applicationId = "com.kaushik1.musicapp"
        minSdk = 24
        targetSdk = 35
        versionCode = 1
        versionName = "1.0"

        testInstrumentationRunner = "androidx.test.runner.AndroidJUnitRunner"
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
        sourceCompatibility = JavaVersion.VERSION_1_8
        targetCompatibility = JavaVersion.VERSION_1_8
    }
    kotlinOptions {
        jvmTarget = "1.8"
    }
}

dependencies {

    implementation(libs.androidx.core.ktx)
    implementation(libs.androidx.appcompat)
    implementation(libs.material)
    implementation(libs.androidx.activity)
    implementation(libs.androidx.constraintlayout)
    testImplementation(libs.junit)
    androidTestImplementation(libs.androidx.junit)
    androidTestImplementation(libs.androidx.espresso.core)

    // retrofit dependencies
    //implementation("com.squareup.retrofit2:retrofit:2.11.0") from new implementation technique
    implementation(libs.retrofit)

    // gson converter
    //implementation("com.squareup.retrofit2:converter-gson:2.11.0") from new implementation technique
    implementation(libs.converter.gson)

    // picaaso for converting image link in API
    //implementation ("com.squareup.picasso:picasso:2.8")
    implementation (libs.picasso)

}