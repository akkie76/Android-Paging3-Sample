package jp.co.example.pagingapp.data

import com.google.gson.annotations.SerializedName
import java.io.Serializable

data class UnsplashPhotoUrls(
    @field:SerializedName("small") val small: String?,
    @field:SerializedName("regular") val regular: String?,
    @field:SerializedName("thumb") val thumb: String?,
) : Serializable
