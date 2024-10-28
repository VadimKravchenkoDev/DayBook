package com.kravchenkovadim.daybook.data

import kotlinx.coroutines.flow.Flow

interface AddTaskItemRepository {
    suspend fun insertTaskItem(item: AddTaskItem)
    suspend fun deleteTaskItem(item: AddTaskItem)
    fun getAllItems(listId: Int): Flow<List<AddTaskItem>>
    suspend fun getListItemById(listId: Int): TaskListItem
    suspend fun insertItem(item: TaskListItem)
}