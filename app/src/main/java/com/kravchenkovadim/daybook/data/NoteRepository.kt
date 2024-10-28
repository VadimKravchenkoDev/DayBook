package com.kravchenkovadim.daybook.data

import kotlinx.coroutines.flow.Flow

interface NoteRepository {
    suspend fun insertTaskItem(item: NoteItem)
    suspend fun deleteTaskItem(item: NoteItem)
    fun getAllItems(): Flow<List<NoteItem>>
    suspend fun getListItemById(id: Int): NoteItem
}