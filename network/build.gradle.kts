import com.evato.o4s.dependencies.DependencyPlugin.Dependency

plugins {
    id("com.android.library")
    id("kotlin-android")
    id("kotlin-android-extensions")
    id("dependencies")

}
android {

    buildTypes {
        getByName("debug") {
            val defaultURL = "https://stag.o4s.io"
            buildConfigField("String", "BASE_URL", "\"${System.getenv("BASE_URL") ?: defaultURL }\"")
        }
        getByName("release") {
            buildConfigField("String", "BASE_URL", "\"https://prod.o4s.io\"")
        }

    }

}

dependencies {
    implementation(fileTree(mapOf("dir" to "libs", "include" to listOf("*.jar"))))
    implementation(Dependency.retrofit_moshi_covertor)
    implementation(Dependency.moshi_kotlin)
    implementation(Dependency.kotlin_coroutines_adapter)
    implementation(Dependency.logging_interceptor)
}
