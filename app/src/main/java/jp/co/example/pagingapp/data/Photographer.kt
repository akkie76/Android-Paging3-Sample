package jp.co.example.pagingapp.data

import java.io.Serializable

data class Photographer(
    val userId: String,
    val name: String,
    val username: String,
    val bio: String?,
    val regularImage: String?,
    val thumbImage: String?,
    val profileImage: String?,
) : Serializable
