import com.evato.o4s.dependencies.DependencyPlugin.Dependency

plugins {
    id("com.android.library")
    id("kotlin-android")
    id("kotlin-android-extensions")
    id("kotlin-kapt")
    id("dependencies")

}


android {
    buildTypes {

    }
}
dependencies {

    api(Dependency.kotlin_jetbrains)
    api(Dependency.andoridx_appcompact)
    api(Dependency.androidx_core)
    api(Dependency.androidx_material)
    api(Dependency.androidx_lifecycle_extension)
    api(Dependency.lifecycle_viewmodel_ktx)
    api(Dependency.androidx_navigation_fragment)
    api(Dependency.androidx_navigation_ui)
    api(Dependency.androidx_constraintlayout)
    api(Dependency.glide)
    annotationProcessor(Dependency.glide_compiler)
    api(Dependency.firebase_dynamic_links)
    api(Dependency.firebase_analytics)
    implementation(Dependency.firebase_remote_configs)
    implementation(Dependency.circular_image)
    implementation(Dependency.androidx_browser)
    implementation(Dependency.kotlin_coroutines)
    implementation(Dependency.kotlin_coroutines_adapter)
    api(Dependency.gson)
    api(Dependency.room)
    kapt(Dependency.room_compiler)
    api(Dependency.zxing_core)
    api(Dependency.zxing_android) { isTransitive = false }
    api(Dependency.retrofit)
    api(Dependency.retrofit_gson_converter) // GSON Converter
    api(Dependency.dexter) // Dexter
    api(Dependency.logging_interceptor)
}