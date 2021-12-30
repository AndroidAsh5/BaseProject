import com.evato.o4s.dependencies.DependencyPlugin.Dependency

plugins {
    id("com.android.library")
    id("kotlin-android")
    id("kotlin-android-extensions")
    id("dependencies")

}
android {
    buildTypes {

    }

}
dependencies {
    implementation(fileTree(mapOf("dir" to "libs", "include" to listOf("*.jar"))))
    implementation(Dependency.androidx_core)

}
