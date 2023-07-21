package jp.co.example.pagingapp.ui

import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import androidx.paging.cachedIn
import dagger.hilt.android.lifecycle.HiltViewModel
import jp.co.example.pagingapp.repository.UnsplashSearchRepository
import javax.inject.Inject

@HiltViewModel
class MainViewModel @Inject constructor(
    unsplashSearchRepository: UnsplashSearchRepository
): ViewModel() {

    val photos = unsplashSearchRepository.searchPhotos(QUERY).cachedIn(viewModelScope)

    companion object {
        private const val QUERY = "fruit"
    }
}