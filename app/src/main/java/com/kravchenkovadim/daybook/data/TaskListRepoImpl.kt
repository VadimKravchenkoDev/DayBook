package com.kravchenkovadim.daybook.data

import kotlinx.coroutines.flow.Flow

class TaskListRepoImpl(
    private val dao: TaskListItemDao
) : TaskListRepository {
    override suspend fun insertItem(item: TaskListItem) {
        dao.insertItem(item)
    }

    override suspend fun deleteItem(item: TaskListItem) {
        dao.deleteItem(item)
    }

    override fun getAllItems(): Flow<List<TaskListItem>> {
        return dao.getAllItems()
    }
}