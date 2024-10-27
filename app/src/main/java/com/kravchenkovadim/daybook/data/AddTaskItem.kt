package com.kravchenkovadim.daybook.data

import androidx.room.Entity
import androidx.room.PrimaryKey

@Entity(tableName = "add_task_item_table")
data class AddTaskItem(
    @PrimaryKey
    val id: Int? = null,
    val name: String,
    val isCheck: Boolean,
    val listId: Int
)
