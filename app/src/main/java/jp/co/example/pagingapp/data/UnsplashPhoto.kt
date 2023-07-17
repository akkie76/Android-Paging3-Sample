package jp.co.example.pagingapp.data

import com.google.gson.annotations.SerializedName
import java.io.Serializable

data class UnsplashPhoto(
    @field:SerializedName("id") val id: String,
    @field:SerializedName("urls") val urls: UnsplashPhotoUrls,
    @field:SerializedName("user") val user: UnsplashUser
) : Serializable