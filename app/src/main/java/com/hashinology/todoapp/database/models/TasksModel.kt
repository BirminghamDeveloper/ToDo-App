package com.hashinology.todoapp.database.models

import android.graphics.Bitmap
import androidx.room.ColumnInfo
import androidx.room.Entity
import androidx.room.Ignore
import androidx.room.Index
import androidx.room.PrimaryKey

@Entity(
    tableName = "task_table",
    // to search by title and isDone
    indices = [Index(value = ["title", "isDone"])]
)
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
    var dateTime: String? = null,
    // to ignore attribute and save it in the Cache not Database
//    @Ignore val pics: Bitmap?
)