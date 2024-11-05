package com.example.androidroomwithaview

import android.app.Application

class WordApplication : Application() {
    val database by lazy { WordRoomDatabase.getDataBase(this) }
    val repository by lazy { WordRepository(database.WordDao()) }
}