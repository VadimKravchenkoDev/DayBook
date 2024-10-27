package com.kravchenkovadim.daybook.data

import androidx.room.Dao
import androidx.room.Delete
import androidx.room.Insert
import androidx.room.OnConflictStrategy
import androidx.room.Query
import kotlinx.coroutines.flow.Flow

@Dao
interface AddTaskItemDao {
    @Insert(onConflict = OnConflictStrategy.REPLACE)
    suspend fun insertTaskItem(item: AddTaskItem)
    @Delete
    suspend fun deleteTaskItem(item: AddTaskItem)
    @Query("SELECT * FROM add_task_item WHERE listId = :listId")
    fun getAllItems(listId: Int): Flow<List<AddTaskItem>>
}