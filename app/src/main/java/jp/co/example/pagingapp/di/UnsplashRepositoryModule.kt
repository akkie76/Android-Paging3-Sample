package jp.co.example.pagingapp.di

import dagger.Binds
import dagger.Module
import dagger.hilt.InstallIn
import dagger.hilt.components.SingletonComponent
import jp.co.example.pagingapp.repository.UnsplashSearchRepository
import jp.co.example.pagingapp.repository.UnsplashSearchRepositoryImpl

@Module
@InstallIn(SingletonComponent::class)
abstract class UnsplashRepositoryModule {

    @Binds
    abstract fun bindUnsplashSearchRepository(
        unsplashSearchRepositoryImpl: UnsplashSearchRepositoryImpl
    ): UnsplashSearchRepository
}