package com.itacademy.myapplication.models


//Модель Видео
data class Video(
    var categoryId: Int,
    var description: String,
    var name: String,
    var url: String
)