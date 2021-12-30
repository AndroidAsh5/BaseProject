import com.evato.o4s.dependencies.DependencyPlugin.Dependency

plugins {
    id ("com.android.application")
    id ("kotlin-android")
    id ("kotlin-kapt")
    id ("dependencies")

}

android {
    defaultConfig {
        applicationId = ("com.evato.o4s.eagle")
        testInstrumentationRunner = "androidx.test.runner.AndroidJUnitRunner"
        multiDexEnabled = true

    }
    buildTypes {
        getByName("release") {
            proguardFiles("proguard-android.txt", "proguard-rules.pro")
        }
        getByName("debug") {
        }
        compileOptions {
            sourceCompatibility = JavaVersion.VERSION_1_8
            targetCompatibility = JavaVersion.VERSION_1_8
        }
        kotlinOptions {
            jvmTarget = JavaVersion.VERSION_1_8.toString()
        }
        configurations.all {
            resolutionStrategy.force("com.google.code.findbugs:jsr305:1.3.9")
        }
    }

}

dependencies {

    implementation(fileTree(mapOf("dir" to "libs", "include" to listOf("*.jar", "*.so"))))
    implementation(project(":commons"))
    implementation(Dependency.multidex)
    implementation(Dependency.androidx_material)
    testImplementation(Dependency.testlib_junit)
    androidTestImplementation(Dependency.test_ext)
    androidTestImplementation(Dependency.testandroidx_espressocore)

}