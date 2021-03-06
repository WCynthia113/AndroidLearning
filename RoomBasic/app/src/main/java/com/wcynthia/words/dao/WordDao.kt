package com.wcynthia.words.dao

import androidx.lifecycle.LiveData
import androidx.room.*
import com.wcynthia.words.entity.Word
import java.util.regex.Pattern

@Dao //Database Access Object
interface WordDao {
    @Insert
    fun insertWords(list:MutableList<Word>)
    @Update
    fun updateWords(list: MutableList<Word>)
    @Delete
    fun deleteWords(list: MutableList<Word>)
    @Query("DELETE FROM WORD")
    fun deleteAllWords()
    @Query("SELECT * FROM WORD ORDER BY ID DESC")
    fun getAllWords():LiveData<MutableList<Word>>
    @Query("SELECT * FROM WORD WHERE english_word LIKE :pattern ORDER BY ID DESC")
    fun findWordsWithPattern(pattern: String):LiveData<MutableList<Word>>
}