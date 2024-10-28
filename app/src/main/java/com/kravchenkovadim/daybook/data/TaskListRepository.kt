package com.kravchenkovadim.daybook.data

import kotlinx.coroutines.flow.Flow

interface TaskListRepository {
    suspend fun insertItem(item: TaskListItem)
    suspend fun deleteItem(item: TaskListItem)
    fun getAllItems(): Flow<List<TaskListItem>>
}