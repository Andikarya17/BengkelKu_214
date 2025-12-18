package com.example.bengkelku.room

import androidx.room.Dao
import androidx.room.Delete
import androidx.room.Insert
import androidx.room.Query
import androidx.room.Update

import kotlinx.coroutines.flow.Flow

@Dao
interface ServisDao {

    @Insert
    suspend fun insert(servis: Servis)

    @Update
    suspend fun update(servis: Servis)

    @Delete
    suspend fun delete(servis: Servis)

    @Query("SELECT * FROM servis WHERE aktif = 1 ORDER BY namaServis ASC")
    fun getServisAktif(): Flow<List<Servis>>

    @Query("SELECT * FROM servis ORDER BY namaServis ASC")
    fun getAllServis(): Flow<List<Servis>>
}
