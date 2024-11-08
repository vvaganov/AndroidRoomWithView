package com.example.androidroomwithaview

import androidx.room.ColumnInfo
import androidx.room.Entity
import androidx.room.PrimaryKey

@Entity(tableName = "word_table")
class Word(
    @PrimaryKey val id:Int,
    @ColumnInfo(name = "word") val word: String
)