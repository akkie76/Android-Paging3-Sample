package jp.co.example.pagingapp.repository

import androidx.paging.PagingData
import jp.co.example.pagingapp.data.UnsplashPhoto
import kotlinx.coroutines.flow.Flow

interface UnsplashSearchRepository {

    fun searchPhotos(query: String): Flow<PagingData<UnsplashPhoto>>
}