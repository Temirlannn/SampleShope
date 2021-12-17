package com.itacademy.myapplication

import com.itacademy.myapplication.models.Cotegory
import com.itacademy.myapplication.models.Video

class Constants {
    companion object {
        val categories = arrayListOf(
            Cotegory(Categories.Action.ordinal, R.string.action),
            Cotegory(Categories.Anime.ordinal, R.string.anime),
            Cotegory(Categories.Cartoon.ordinal, R.string.cartoon),
            Cotegory(Categories.Comedy.ordinal, R.string.comedy),
            Cotegory(Categories.Drama.ordinal, R.string.drama),
            Cotegory(Categories.Melodrama.ordinal, R.string.melodrama),
            Cotegory(Categories.Horror.ordinal, R.string.horror),
            Cotegory(Categories.Fantasy.ordinal, R.string.fantasy)
        )
        val videos = arrayListOf(
            Video(Categories.Action.ordinal,"Описание","Название","url"),
            Video(Categories.Action.ordinal,"Описание","Название","url"),
            Video(Categories.Action.ordinal,"Описание","Название","url"),


            Video(Categories.Anime.ordinal,"Описание","Название","url"),
            Video(Categories.Anime.ordinal,"Описание","Название","url"),
            Video(Categories.Anime.ordinal,"Описание","Название","url"),


            Video(Categories.Cartoon.ordinal,"Описание","Название","url"),
            Video(Categories.Cartoon.ordinal,"Описание","Название","url"),
            Video(Categories.Cartoon.ordinal,"Описание","Название","url"),


            Video(Categories.Horror.ordinal,"Описание","Название","url"),
            Video(Categories.Horror.ordinal,"Описание","Название","url"),
            Video(Categories.Horror.ordinal,"Описание","Название","url"),



            Video(Categories.Comedy.ordinal,"Описание","Название","url"),
            Video(Categories.Comedy.ordinal,"Описание","Название","url"),
            Video(Categories.Comedy.ordinal,"Описание","Название","url"),


            Video(Categories.Drama.ordinal,"Описание","Название","url"),
            Video(Categories.Drama.ordinal,"Описание","Название","url"),
            Video(Categories.Drama.ordinal,"Описание","Название","url")

        )
    }
}
enum class Categories(value: Int){
    Comedy(1),
    Anime(2),
    Drama(3),
    Melodrama(4),
    Action(5),
    Horror(6),
    Fantasy(7),
    Cartoon(8)
}