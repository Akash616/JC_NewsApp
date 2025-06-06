package io.akash.app

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Box
import androidx.compose.material3.MaterialTheme
import androidx.compose.ui.Modifier
import androidx.core.splashscreen.SplashScreen.Companion.installSplashScreen
import androidx.core.view.WindowCompat
import io.akash.app.presentation.onboarding.OnBoardingScreen
import io.akash.app.ui.theme.JCNewsAppTheme

/*Clean Architecture: is a way to structure the project and to make it more
* maintainable(fix a bug or fix an issue in your project, if your project is too big
* and it has so many classes its going to be hard to find where is that bug but when
* we use Clean Architecture we basically put everything in its own place) and
* scalable(means that we can implement new features in our project without needing to
* modify on the code)
* And Clean Architecture also makes our project testable so we can test the project
* easily.
* We can do this splitting the project into 3 layers:
* Presentation Layer, Data Layer and Domain Layer*/

class MainActivity : ComponentActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        WindowCompat.setDecorFitsSystemWindows(window, false)
        installSplashScreen()
        setContent {
            JCNewsAppTheme {
                Box(
                    modifier = Modifier
                        .background(color = MaterialTheme.colorScheme.background)
                ) {
                    OnBoardingScreen()
                }
            }
        }
    }
}