package com.hashinology.todoapp.database.models

import androidx.room.Dao
import androidx.room.Delete
import androidx.room.Insert
import androidx.room.Query
import androidx.room.Update
import com.hashinology.todoapp.models.TasksModel


@Dao
interface TaskDao {
    @Insert
    fun upsert(task: TasksModel)
    @Update
    fun update(task: TasksModel)
    @Delete
    fun delete(task: TasksModel)
    @Query("Select * from task_table")
    fun getAlltasks(): List<TasksModel>
    @Query("Select * from task_table Where dateTime= :dateTime")
    fun getTasksByDate(dateTime: Long): List<TasksModel>
}