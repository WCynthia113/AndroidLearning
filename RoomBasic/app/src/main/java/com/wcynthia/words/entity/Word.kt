package com.wcynthia.words.entity

import androidx.room.ColumnInfo
import androidx.room.Entity
import androidx.room.PrimaryKey

@Entity
data class Word(
    @ColumnInfo(name = "english_word")
    var word: String,
    @ColumnInfo(name = "chinese_meaning")
    var meaning: String,
    @ColumnInfo(name = "chinese_invisible")
    var chineseInvisible:Boolean = false
){
    @PrimaryKey(autoGenerate = true)
    var id: Int = 0
}

