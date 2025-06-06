package io.akash.app.domain.usecases

import io.akash.app.domain.manager.LocalUserManager
import kotlinx.coroutines.flow.Flow

class ReadAppEntry(
    private val localUserManager: LocalUserManager
) {

    suspend operator fun invoke(): Flow<Boolean> {
        return localUserManager.readAppEntry()
    }
}