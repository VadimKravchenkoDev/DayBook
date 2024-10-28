package com.kravchenkovadim.daybook.data

import kotlinx.coroutines.flow.Flow

class AddTaskItemRepoImpl(
    private val dao: AddTaskItemDao
) : AddTaskItemRepository {
    override suspend fun insertTaskItem(item: AddTaskItem) {
        dao.insertTaskItem(item)
    }

    override suspend fun deleteTaskItem(item: AddTaskItem) {
        dao.deleteTaskItem(item)
    }

    override fun getAllItems(listId: Int): Flow<List<AddTaskItem>> {
        return dao.getAllItems(listId)
    }

    override suspend fun getListItemById(listId: Int): TaskListItem {
        return dao.getListItemById(listId)
    }

    override suspend fun insertItem(item: TaskListItem) {
        dao.insertItem(item)
    }
}