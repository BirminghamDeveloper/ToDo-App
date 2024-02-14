package com.hashinology.todoapp.database.models

import android.content.Context
import androidx.room.Database
import androidx.room.Room
import androidx.room.RoomDatabase

@Database(
    entities = [TasksModel::class],
    version = 0,
    exportSchema = true
)
abstract class TaskDB: RoomDatabase() {
    abstract fun getDao(): TaskDao
    /*
    Single Pattern is like static function in Java and Compnion Object{}
    used to create 1 Object from Database to use not creating new multiple Object
     */
    companion object{
        private var instance: TaskDB? = null
        fun getinstance(context: Context): TaskDB{
            if (instance==null){
                instance = Room.databaseBuilder(
                    context,
                    TaskDB::class.java,
                    "taskdb"
                ).build()
            }
            return instance!!
        }
    }
}
