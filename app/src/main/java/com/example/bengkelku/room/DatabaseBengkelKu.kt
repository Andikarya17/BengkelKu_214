package com.example.bengkelku.room

import android.content.Context
import androidx.room.Database
import androidx.room.Room
import androidx.room.RoomDatabase

@Database(
    entities = [Kendaraan::class],
    version = 1,
    exportSchema = false
)
abstract class DatabaseBengkelKu : RoomDatabase() {

    abstract fun kendaraanDao(): KendaraanDao

    companion object {
        @Volatile
        private var INSTANCE: DatabaseBengkelKu? = null

        fun getDatabase(context: Context): DatabaseBengkelKu {
            return INSTANCE ?: synchronized(this) {
                Room.databaseBuilder(
                    context.applicationContext,
                    DatabaseBengkelKu::class.java,
                    "bengkelku_database"
                ).build().also { INSTANCE = it }
            }
        }
    }
}