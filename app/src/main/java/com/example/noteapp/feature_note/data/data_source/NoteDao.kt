package com.example.noteapp.feature_note.data.data_source

import androidx.room.*
import com.example.noteapp.feature_note.domain.model.Note
import java.util.concurrent.Flow


@Dao
interface NoteDao {

    @Query("SELECT * FROM Note")
    fun getNote(): kotlinx.coroutines.flow.Flow<List<Note>>

    @Query("SELECT * FROM Note WHERE id = :id")
    suspend fun getNoteById(id : Int): Note?

    @Insert(onConflict = OnConflictStrategy.REPLACE)
    suspend fun insertNote (note : Note)

    @Delete
    suspend fun deleteNote(note : Note)

}