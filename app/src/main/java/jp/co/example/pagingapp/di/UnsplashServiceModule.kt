package jp.co.example.pagingapp.di

import dagger.Module
import dagger.Provides
import dagger.hilt.InstallIn
import dagger.hilt.components.SingletonComponent
import jp.co.example.pagingapp.repository.UnsplashService

@Module
@InstallIn(SingletonComponent::class)
object UnsplashServiceModule {

    @Provides
    fun provideUnsplashService(): UnsplashService {
        return UnsplashService.create()
    }
}