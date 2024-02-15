package com.hashinology.todoapp.models

import androidx.room.Embedded
import androidx.room.Entity
import androidx.room.PrimaryKey
import androidx.room.Relation

@Entity
data class DataClassModelExample(
    @PrimaryKey(autoGenerate = true)
    val userID: Int? = null,
    @Embedded
    val tasksModel: TasksModel,
    @Relation(
        parentColumn = "id",
        entityColumn = "userID",
    )
)
