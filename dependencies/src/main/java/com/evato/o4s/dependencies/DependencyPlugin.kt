package com.evato.o4s.dependencies

import org.gradle.api.JavaVersion
import org.gradle.api.Plugin
import org.gradle.api.Project

class DependencyPlugin : Plugin<Project> {

    override fun apply(project: Project) {
        // Possibly common function or can stay empty
    }

    object Config {
        const val minSdk = 16
        const val compileSdk = 31
        const val targetSdk = 31
        val javaVersion = JavaVersion.VERSION_1_8
        const val buildTools = "28.0.3"
        const val versionName = "1.0"
        const val versionCode = 1
    }

    object Versions {
        // <editor-fold desc="google">
        const val androidx_core = "1.3.1"
        const val androidx_recyclerview = "1.0.0"
        const val androidx_navigation = "2.3.0"
        const val androidx_navigation_safeargs = "1.0.0"
        const val androidx_constraintLayout = "1.1.3"
        const val androidx_lifecycle_extension = "2.2.0"

        //TODO: update to 1.1.0
        const val androidx_appcompat = "1.2.0"
        const val androidx_browser = "1.2.0"

        const val material = "1.4.0"
        const val kotlin = "1.3.72"
        const val kotlin_coroutines = "1.3.0"
        const val kotlin_coroutines_adapter = "0.9.2"
        // </editor-fold>

        const val retrofit = "2.0.2"
        const val moshi_kotlin = "1.8.0"
        const val logging_interceptor = "3.9.1"

        // <editor-fold desc="testing">
        const val junit = "4.12"
        const val androidx_espresso = "3.2.0"
        const val androidx_testing = "1.1.1"
        //</editor-fold>

        // <editor-fold desc="tools">
        const val gradleandroid = "3.5.2"
        const val gradleversions = "0.21.0"
        // </editor-fold>

        const val ciruclar_image = "3.0.1"

        const val firebase_auth = "19.2.0"
        const val google_services = "4.3.2"
        const val firebase_remote_config = "19.1.1"
        const val firebase_analytics = "17.2.1"
        const val firebase_dynamic_links = "19.0.0"
        const val firebase_messaging = "20.1.5"

        const val glide = "4.10.0"

        const val zxing = "3.6.0"
        const val zxing_core = "3.3.0"

        const val circular_progress = "1.0.0"
        const val gson = "2.8.6"
        const val fabric_gradle = "1.31.2"
        const val fabric_crashlytics = "2.10.1"


        const val country_code_picker = "2.3.7"

        const val multidex = "2.0.1"
        const val tooltip = "2.0.4"
        const val work_manager_ktx = "2.4.0-rc01"
        const val dexter = "4.2.0"
        const val play_service_gcm = "17.0.0"
        const val retrofit_gson_converter = "2.0.2"
        const val lifecycle_viewmodel_ktx = "2.3.0-alpha06"
        const val legacy_support = "1.0.0"
        const val test_ext = "1.1.1"
        const val number_picker = "2.4.6"
        const val activity_ktx = "1.2.0-alpha07"
        const val socket = "4.2.3"
        const val androidx_fragment_ktx = "1.3.0-alpha06"
        const val room = "2.2.5"
        const val phone_number_lib = "8.12.5"
        const val calligraphy = "3.1.1"
        const val viewpump = "2.0.3"
        const val number_progressbar = "1.4@aar"
        const val okhttp = "3.9.1"
        const val spotlight = "1.3.3"
        const val guava = "24.1-android"
        const val firebase_crashlytics = "17.3.0"
        const val  floating_action_button = "1.10.1"
        const val listenablefuture = "9999.0-empty-to-avoid-conflict-with-guava"
        const val socket_io_android = "0.6.0"
        const val ccp = "2.3.8"
    }

    companion object Dependency {
        const val androidx_core = "androidx.core:core-ktx:${Versions.androidx_core}"
        const val androidx_constraintlayout = "androidx.constraintlayout:constraintlayout:${Versions.androidx_constraintLayout}"
        const val androidx_material = "com.google.android.material:material:${Versions.material}"
        const val androidx_navigation_fragment = "androidx.navigation:navigation-fragment-ktx:${Versions.androidx_navigation}"
        const val androidx_navigation_ui = "androidx.navigation:navigation-ui-ktx:${Versions.androidx_navigation}"
        const val androidx_navigation_safeargs = "android.arch.navigation:navigation-safe-args-gradle-plugin:${Versions.androidx_navigation_safeargs}"
        const val androidx_recyclerview = "androidx.recyclerview:recyclerview:${Versions.androidx_recyclerview}"
        const val androidx_lifecycle_extension = "androidx.lifecycle:lifecycle-extensions:${Versions.androidx_lifecycle_extension}"
        const val jetbrains_annotaions = "org.jetbrains:annotations:16.0.1"
        const val andoridx_appcompact = "androidx.appcompat:appcompat:${Versions.androidx_appcompat}"
        const val androidx_browser = "androidx.browser:browser:${Versions.androidx_browser}"
        const val testlib_junit = "junit:junit:${Versions.junit}"

        const val testandroidx_rules = "androidx.test:rules:${Versions.androidx_testing}"
        const val testandroidx_runner = "androidx.test:runner:${Versions.androidx_testing}"
        const val testandroidx_espressocore = "androidx.test.espresso:espresso-core:${Versions.androidx_espresso}"

        const val tools_gradleandroid = "com.android.tools.build:gradle:${Versions.gradleandroid}"
        const val tools_gradleversions = "com.github.ben-manes:gradle-versions-plugin:${Versions.gradleversions}"

        const val work_manager_ktx = "androidx.work:work-runtime-ktx:${Versions.work_manager_ktx}"
        const val tools_kotlin = "org.jetbrains.kotlin:kotlin-gradle-plugin:${Versions.kotlin}"
        const val kotlin_jetbrains = "org.jetbrains.kotlin:kotlin-stdlib-jdk7:${Versions.kotlin}"
        const val kotlin_coroutines = "org.jetbrains.kotlinx:kotlinx-coroutines-android:${Versions.kotlin_coroutines}"
        const val kotlin_coroutines_adapter = "com.jakewharton.retrofit:retrofit2-kotlin-coroutines-adapter:${Versions.kotlin_coroutines_adapter}"

        const val circular_image = "de.hdodenhof:circleimageview:${Versions.ciruclar_image}"

        const val firebase_auth= "com.google.firebase:firebase-auth:${Versions.firebase_auth}"
        const val google_services = "com.google.gms:google-services:${Versions.google_services}"
        const val retrofit = "com.squareup.retrofit2:retrofit:${Versions.retrofit}"
        const val retrofit_moshi_covertor = "com.squareup.retrofit2:converter-moshi:${Versions.retrofit}"
        const val moshi_kotlin = "com.squareup.moshi:moshi-kotlin:${Versions.moshi_kotlin}"
        const val logging_interceptor = "com.squareup.okhttp3:logging-interceptor:${Versions.logging_interceptor}"

        const val glide = "com.github.bumptech.glide:glide:${Versions.glide}"
        const val glide_compiler = "com.github.bumptech.glide:compiler:${Versions.glide}"

        const val zxing_android = "com.journeyapps:zxing-android-embedded:${Versions.zxing}"
        const val zxing_core = "com.google.zxing:core:${Versions.zxing_core}"


        const val gson = "com.google.code.gson:gson:${Versions.gson}"
        const val fabric_gradle = "io.fabric.tools:gradle:${Versions.fabric_gradle}"
        const val firebase_analytics = "com.google.firebase:firebase-analytics:${Versions.firebase_analytics}"
        const val fabric_crashlytics = "com.crashlytics.sdk.android:crashlytics:${Versions.fabric_crashlytics}"
        const val firebase_dynamic_links = "com.google.firebase:firebase-dynamic-links:${Versions.firebase_dynamic_links}"
        const val firebase_remote_configs = "com.google.firebase:firebase-config-ktx:${Versions.firebase_remote_config}"
        const val firebase_messaging = "com.google.firebase:firebase-messaging:${Versions.firebase_messaging}"
        const val firebase_auth_ui = "com.firebaseui:firebase-ui-auth:6.2.0"

        const val country_code_picker = "com.hbb20:ccp:${Versions.country_code_picker}"

        const val multidex = "androidx.multidex:multidex:${Versions.multidex}"
        const val tooltip = "com.github.sephiroth74:android-target-tooltip:${Versions.tooltip}"
        const val dexter = "com.karumi:dexter:${Versions.dexter}"
        const val play_service_gcm = "com.google.android.gms:play-services-gcm:${Versions.play_service_gcm}"
        const val retrofit_gson_converter = "com.squareup.retrofit2:converter-gson:${Versions.retrofit_gson_converter}"
        const val lifecycle_viewmodel_ktx = "androidx.lifecycle:lifecycle-viewmodel-ktx:${Versions.lifecycle_viewmodel_ktx}"
        const val legacy_support = "androidx.legacy:legacy-support-v4:${Versions.legacy_support}"
        const val test_ext = "androidx.test.ext:junit:${Versions.test_ext}"
        const val number_picker = "com.shawnlin:number-picker:${Versions.number_picker}"
        const val activity_ktx = "androidx.activity:activity-ktx:${Versions.activity_ktx}"
        const val socket = "com.tonystark.android:socket:${Versions.socket}"
        const val androidx_fragment_ktx = "androidx.fragment:fragment-ktx:${Versions.androidx_fragment_ktx}"
        const val room = "androidx.room:room-runtime:${Versions.room}"
        const val room_ktx = "androidx.room:room-ktx:${Versions.room}"
        const val room_compiler = "androidx.room:room-compiler:${Versions.room}"
        const val phone_number_lib = "io.michaelrocks:libphonenumber-android:${Versions.phone_number_lib}"
        const val calligraphy = "io.github.inflationx:calligraphy3:${Versions.calligraphy}"
        const val viewpump = "io.github.inflationx:viewpump:${Versions.viewpump}"
        const val number_progressbar = "com.daimajia.numberprogressbar:library:${Versions.number_progressbar}"
        const val okhttp = "com.squareup.okhttp3:okhttp:${Versions.okhttp}"
        const val spotlight = "com.github.takusemba:spotlight:${Versions.spotlight}"
        const val guava = "com.google.guava:guava:${Versions.guava}"
        const val firebase_crashlytics = "com.google.firebase:firebase-crashlytics:${Versions.firebase_crashlytics}"
        const val floating_action_button = "com.getbase:floatingactionbutton:${Versions.floating_action_button}"
        const val listenablefuture = "com.google.guava:listenablefuture:${Versions.listenablefuture}"

    }

   }
