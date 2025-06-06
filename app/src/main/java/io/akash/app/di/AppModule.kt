package io.akash.app.di

import android.app.Application
import dagger.Module
import dagger.Provides
import dagger.hilt.InstallIn
import dagger.hilt.components.SingletonComponent
import io.akash.app.data.manager.LocalUserManagerImpl
import io.akash.app.domain.manager.LocalUserManager
import io.akash.app.domain.usecases.AppEntryUseCases
import io.akash.app.domain.usecases.ReadAppEntry
import io.akash.app.domain.usecases.SaveAppEntry
import javax.inject.Singleton

@Module
@InstallIn(SingletonComponent::class) //they live as long as application is alive
object AppModule {

    @Provides
    @Singleton
    fun provideLocalUserManager(
        application: Application //we already give dagger hilt access to our application
    ): LocalUserManager = LocalUserManagerImpl(application)

    @Provides
    @Singleton
    fun provideAppEntryUseCases(
        localUserManager: LocalUserManager
    ) = AppEntryUseCases(
        readAppEntry = ReadAppEntry(localUserManager),
        saveAppEntry = SaveAppEntry(localUserManager)
    )

}