package com.hashinology.todoapp.database.models

import androidx.room.ColumnInfo
import androidx.room.Entity
import androidx.room.Index
import androidx.room.PrimaryKey

@Entity(tableName = "task_table")
data class TasksModel (
    @PrimaryKey(autoGenerate = true)
    @ColumnInfo("ID")
    val id: Int,
    @ColumnInfo()

    var title: String? = null,
    @ColumnInfo()
    var description: String? = null,
    @ColumnInfo()
    var isDone: Boolean = false,
    @ColumnInfo()
    var dateTime: String? = null
)