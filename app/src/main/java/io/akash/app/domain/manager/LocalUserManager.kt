package io.akash.app.domain.manager

import kotlinx.coroutines.flow.Flow

/*In this interface we want to save the app entry when the user clicks on Get Started
* in the last OnBoarding Screen.
* ----------------------------------------------------------
* Now we want to implement this manager inside the Data Layer and we do this because
* now this repository is testable because we just can actually fake this(LocalUserManager)
* and create a fake repository form this one and that's why we create interface inside
* the domain layer*/

interface LocalUserManager {

    suspend fun saveAppEntry()

    fun readAppEntry(): Flow<Boolean>
}