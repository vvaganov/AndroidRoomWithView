package com.example.androidroomwithaview

import kotlinx.coroutines.flow.Flow

class WordRepository(private val wordDao: WordDao) {
    val getAllWords:Flow<List<Word>> = wordDao.getAlphabetizedWords()

    suspend fun insert(word: Word){
        wordDao.insert(word)
    }

}