package jp.co.example.pagingapp.repository

import androidx.paging.Pager
import androidx.paging.PagingConfig
import androidx.paging.PagingData
import jp.co.example.pagingapp.data.UnsplashPhoto
import kotlinx.coroutines.flow.Flow
import javax.inject.Inject

class UnsplashSearchRepositoryImpl @Inject constructor(
    private val service: UnsplashService
): UnsplashSearchRepository {

    override fun searchPhotos(query: String): Flow<PagingData<UnsplashPhoto>> {
        return Pager(
            config = PagingConfig(enablePlaceholders = false, pageSize = PAGE_SIZE),
            pagingSourceFactory = { UnsplashPagingSource(service, query) }
        ).flow
    }

    companion object {
        private const val PAGE_SIZE = 25
    }
}
