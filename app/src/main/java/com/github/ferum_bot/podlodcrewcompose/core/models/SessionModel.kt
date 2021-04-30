package com.github.ferum_bot.podlodcrewcompose.core.models

import com.squareup.moshi.Json


data class SessionModel(
    @Json(name = "id")
    val id: Int,

    @Json(name = "date")
    val date: String,

    @Json(name = "description")
    val description: String,

    @Json(name = "imageUrl")
    val imageUrl: String,

    @Json(name = "speaker")
    val speaker: String,

    @Json(name = "timeInterval")
    val timeInterval: String,
)
