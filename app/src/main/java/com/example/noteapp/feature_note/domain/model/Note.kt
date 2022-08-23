package com.example.noteapp.feature_note.domain.model

import androidx.room.Entity
import androidx.room.PrimaryKey
import com.example.noteapp.ui.ui.*
import java.sql.Timestamp

@Entity
data class Note(
    val title: String,
    val content: String,
    val timestamp: Long,
    val color: Int,
    @PrimaryKey val id: Int? = null
) {
    companion object {
        val noteColors = listOf(LightBlue, Purple200, Yellow, Teal200, RedPink, RedOrange)
    }
}

class InvalidNoteException(message: String) : Exception(message)


