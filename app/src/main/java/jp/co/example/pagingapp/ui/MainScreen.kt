package jp.co.example.pagingapp.ui

import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.PaddingValues
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.statusBarsPadding
import androidx.compose.foundation.lazy.grid.GridCells
import androidx.compose.foundation.lazy.grid.LazyVerticalGrid
import androidx.compose.material3.CircularProgressIndicator
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.material3.TopAppBar
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.unit.dp
import androidx.paging.LoadState
import androidx.paging.compose.collectAsLazyPagingItems
import androidx.paging.compose.itemKey
import coil.compose.AsyncImage

@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun MainScreen(viewModel: MainViewModel) {
    Scaffold(
        topBar = {
            TopAppBar(
                title = {
                    Text("Paging Items")
                },
                modifier = Modifier.statusBarsPadding()
            )
        },
    ) { padding ->
        val lazyPagingItems = viewModel.photos.collectAsLazyPagingItems()

        LazyVerticalGrid(
            columns = GridCells.Adaptive(minSize = 128.dp),
            modifier = Modifier.padding(padding),
            contentPadding = PaddingValues(8.dp)
        ) {
            items(
                count = lazyPagingItems.itemCount,
                key = lazyPagingItems.itemKey()
            ) { index ->
                val photo = lazyPagingItems[index] ?: return@items
                AsyncImage(
                    model = photo.urls.thumb,
                    contentDescription = null,
                    modifier = Modifier
                        .fillMaxWidth()
                        .height(128.dp),
                    contentScale = ContentScale.FillWidth
                )
            }
        }

        when (lazyPagingItems.loadState.refresh) {
            is LoadState.Loading -> {
                Column(
                    modifier = Modifier.fillMaxSize(),
                    horizontalAlignment = Alignment.CenterHorizontally,
                    verticalArrangement = Arrangement.Center,
                ) {
                    Text(
                        modifier = Modifier.padding(8.dp),
                        text = "Loading"
                    )
                    CircularProgressIndicator(
                        modifier = Modifier.padding(top = 8.dp),
                        color = Color.LightGray
                    )
                }
            }
            else -> {}
        }
    }
}

