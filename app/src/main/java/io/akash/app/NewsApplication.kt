package io.akash.app

import android.app.Application
import dagger.hilt.android.HiltAndroidApp

@HiltAndroidApp
class NewsApplication: Application() {
    /*DI - Dependency Injection is a way to send dependencies or object to a class.
    * Application class, create the modules(dependencies that we want)*/
}