package jp.co.example.pagingapp.data

import com.google.gson.annotations.SerializedName
import java.io.Serializable

data class UnsplashUser(
    @field:SerializedName("id") val id: String,
    @field:SerializedName("name") val name: String,
    @field:SerializedName("username") val username: String,
    @field:SerializedName("bio") val bio: String?,
    @field:SerializedName("profile_image") val profileImage: UnsplashProfileImage?,
) : Serializable
