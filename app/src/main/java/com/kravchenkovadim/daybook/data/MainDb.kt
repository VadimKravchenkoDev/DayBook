package com.kravchenkovadim.daybook.data

import androidx.room.Database
import androidx.room.RoomDatabase

@Database(
    entities = [TaskListItem::class, AddTaskItem::class, TaskListItem::class],
    version = 1
)
abstract class MainDb: RoomDatabase() {
    abstract val taskListItem: TaskListItemDao

}