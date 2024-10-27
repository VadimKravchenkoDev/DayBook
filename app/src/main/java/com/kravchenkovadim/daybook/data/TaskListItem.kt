package com.kravchenkovadim.daybook.data

import androidx.room.Entity
import androidx.room.PrimaryKey

@Entity(tableName = "task_list_item")
data class TaskListItem(
    @PrimaryKey
    val id: Int? = null,
    val name: String,
    val time: String,
    val allItemsCount: Int,
    val allSelectedItemsCount: Int
)
