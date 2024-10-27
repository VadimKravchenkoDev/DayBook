package com.kravchenkovadim.daybook.data

import androidx.room.Dao
import androidx.room.Delete
import androidx.room.Insert
import androidx.room.OnConflictStrategy
import androidx.room.Query
import kotlinx.coroutines.flow.Flow

@Dao
interface NoteItemDao {
    @Insert(onConflict = OnConflictStrategy.REPLACE)
    suspend fun insertTaskItem(item: NoteItem)
    @Delete
    suspend fun deleteTaskItem(item: NoteItem)
    @Query("SELECT * FROM note_table")
    fun getAllItems(): Flow<List<NoteItem>>
    @Query("SELECT * FROM note_table WHERE id = :id")
    suspend fun getListItemById(id: Int): NoteItem

}