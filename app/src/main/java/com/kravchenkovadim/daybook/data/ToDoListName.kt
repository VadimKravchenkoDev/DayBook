package com.kravchenkovadim.daybook.data

import androidx.room.Entity
import androidx.room.PrimaryKey

@Entity(tableName = "to-do_list_name")
data class ToDoListName(
    @PrimaryKey
    val id: Int,
    val name: String,
    val time: String,
    val allItemsCount: Int,
    val allSelectedItemsCount: Int
)
