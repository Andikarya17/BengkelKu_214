package com.example.bengkelku.repository

import com.example.bengkelku.room.Servis
import com.example.bengkelku.room.ServisDao
import kotlinx.coroutines.flow.Flow

class RepositoryServis(
    private val servisDao: ServisDao
) {

    // Untuk Customer (hanya servis aktif)
    fun getServisAktif(): Flow<List<Servis>> =
        servisDao.getServisAktif()

    // Untuk Admin
    fun getAllServis(): Flow<List<Servis>> =
        servisDao.getAllServis()

    suspend fun insert(servis: Servis) {
        servisDao.insert(servis)
    }

    suspend fun update(servis: Servis) {
        servisDao.update(servis)
    }

    suspend fun delete(servis: Servis) {
        servisDao.delete(servis)
    }
}
