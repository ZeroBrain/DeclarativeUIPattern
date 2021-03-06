object Base {

    const val buildToolVersion = "30.0.2"
}

object Kotlin {

    const val version = "1.4.10"
    const val stdLib = "org.jetbrains.kotlin:kotlin-stdlib:$version"
}

object Compose {

    const val version = "1.0.0-alpha07"
    const val ui = "androidx.compose.ui:ui:$version"
    const val runtime = "androidx.compose.runtime:runtime:$version"
    const val livedata = "androidx.compose.runtime:runtime-livedata:$version"
    const val material = "androidx.compose.material:material:$version"
    const val uiTooling = "androidx.ui:ui-tooling:$version"
}

object AndroidX {

    const val coreKtx = "androidx.core:core-ktx:1.3.2"
    const val appCompat = "androidx.appcompat:appcompat:1.2.0"
    const val lifeCycleRuntimeKtx = "androidx.lifecycle:lifecycle-runtime-ktx:2.3.0-alpha06"
}

object Google {

    const val material = "com.google.android.material:material:1.2.1"
}

object Test {

    const val junit = "junit:junit:4.13.1"
}

object AndroidTest {

    const val junit = "androidx.test.ext:junit:1.1.2"
    const val espresso = "androidx.test.espresso:espresso-core:3.3.0"
}

object Dagger2 {

    const val version = "2.29.1"
    const val hiltVersion = "$version-alpha"
    const val hiltGradle = "com.google.dagger:hilt-android-gradle-plugin:$hiltVersion"
    const val hiltRuntime = "com.google.dagger:hilt-android:$hiltVersion"
    const val hiltCompiler = "com.google.dagger:hilt-android-compiler:$hiltVersion"

    const val javaxInject = "javax.inject:javax.inject:1"
}

object RxJava {

    const val version = "3.0.7"
    const val androidVersion = "3.0.0"
    const val runtime = "io.reactivex.rxjava3:rxjava:$version"
    const val android = "io.reactivex.rxjava3:rxandroid:$androidVersion"
}