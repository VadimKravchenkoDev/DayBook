package com.kravchenkovadim.daybook.data

import androidx.room.Entity
import androidx.room.PrimaryKey

@Entity(tableName = "task_list_name")
data class TaskListName(
    @PrimaryKey
    val id: Int? = null,
    val name: String,
    val time: String,
    val allItemsCount: Int,
    val allSelectedItemsCount: Int
)
