package com.example.mvvmarchitecture;

import androidx.room.Dao;
import androidx.room.Query;

@Dao
interface NoteDao {
    @Query("SELECT * FROM word_table ORDER BY word ASC")
    fun getAlphabetizedWords()



}
