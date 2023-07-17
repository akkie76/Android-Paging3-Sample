package jp.co.example.pagingapp.data

import com.google.gson.annotations.SerializedName
import java.io.Serializable

data class UnsplashProfileImage(
    @field:SerializedName("large") val large: String?,
) : Serializable
