package com.example.foody.models

import com.google.gson.annotations.SerializedName

data class Trivia (
    @SerializedName("text")
    val text: String
)