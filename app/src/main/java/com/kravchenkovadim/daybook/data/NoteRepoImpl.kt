package com.kravchenkovadim.daybook.data

import kotlinx.coroutines.flow.Flow

class NoteRepoImpl(
    private val dao: NoteItemDao
) : NoteRepository{
    override suspend fun insertTaskItem(item: NoteItem) {
        dao.insertItem(item)
    }

    override suspend fun deleteTaskItem(item: NoteItem) {
        dao.deleteItem(item)
    }

    override fun getAllItems(): Flow<List<NoteItem>> {
      return  dao.getAllItems()
    }

    override suspend fun getListItemById(id: Int): NoteItem {
        return dao.getListItemById(id)
    }
}