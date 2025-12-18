package com.example.bengkelku.room

import androidx.room.Dao
import androidx.room.Delete
import androidx.room.Insert
import androidx.room.Query
import androidx.room.Update
import kotlinx.coroutines.flow.Flow

@Dao
interface KendaraanDao {

    @Insert
    suspend fun insert(kendaraan: Kendaraan)

    @Update
    suspend fun update(kendaraan: Kendaraan)

    @Delete
    suspend fun delete(kendaraan: Kendaraan)

    @Query("SELECT * FROM kendaraan ORDER BY merk ASC")
    fun getAllKendaraan(): Flow<List<Kendaraan>>
}