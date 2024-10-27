package com.kravchenkovadim.daybook.data

import androidx.room.Database
import androidx.room.RoomDatabase

@Database(
    entities = [TaskListItem::class, AddTaskItem::class, NoteItem::class],
    version = 1
)
abstract class MainDb: RoomDatabase() {
    abstract val taskListItemDao: TaskListItemDao
    abstract val addTaskItemDao : AddTaskItemDao
    abstract val noteItemDao : NoteItemDao
}