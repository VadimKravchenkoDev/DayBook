package com.kravchenkovadim.daybook.data

import androidx.room.Dao
import androidx.room.Delete
import androidx.room.Insert
import androidx.room.OnConflictStrategy
import androidx.room.Query
import kotlinx.coroutines.flow.Flow

@Dao
interface TaskListItemDao {
    @Insert(onConflict = OnConflictStrategy.REPLACE)
    suspend fun insertItem(item: TaskListItem)
    @Delete
    suspend fun deleteItem(item: TaskListItem)
    @Query("SELECT * FROM task_list_item_table")
    fun getAllItems(): Flow<List<TaskListItem>>

}