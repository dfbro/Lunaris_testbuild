plugins {
    alias(libs.plugins.android.application)
}

android {
    namespace = "com.zenostrap.rbx" // shit’s renamed, don’t forget the manifest
    compileSdk = 35

    defaultConfig {
        applicationId = "com.zenostrap.rbx" // idk just keep this in sync
        minSdk = 24
        targetSdk = 35
        versionCode = 2 // bumped it, don’t ship 1.0 twice
        versionName = "2.0" // yeah

        testInstrumentationRunner = "androidx.test.runner.AndroidJUnitRunner"
    }

    buildTypes {
        release {
            isMinifyEnabled = true // shrink that fat release build
            proguardFiles(
                getDefaultProguardFile("proguard-android-optimize.txt"),
                "proguard-rules.pro"
            )
        }
        debug {
            isMinifyEnabled = false // no one’s debugging obfuscated bs
        }
    }

    compileOptions {
        sourceCompatibility = JavaVersion.VERSION_11 // don't touch unless u know wtf you're doing
        targetCompatibility = JavaVersion.VERSION_11
    }

    buildFeatures {
        viewBinding = true // godsend, don't disable this unless ur high
    }
}

dependencies {
    implementation(libs.appcompat)
    implementation(libs.material)
    testImplementation(libs.junit)
    androidTestImplementation(libs.ext.junit)
    androidTestImplementation(libs.espresso.core)
}
