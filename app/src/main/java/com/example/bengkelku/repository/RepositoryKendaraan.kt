package com.example.bengkelku.repository

import com.example.bengkelku.room.Kendaraan
import com.example.bengkelku.room.KendaraanDao
import kotlinx.coroutines.flow.Flow

class RepositoryKendaraan(
    private val kendaraanDao: KendaraanDao
) {

    fun getAllKendaraan(): Flow<List<Kendaraan>> =
        kendaraanDao.getAllKendaraan()

    suspend fun insert(kendaraan: Kendaraan) {
        kendaraanDao.insert(kendaraan)
    }

    suspend fun update(kendaraan: Kendaraan) {
        kendaraanDao.update(kendaraan)
    }

    suspend fun delete(kendaraan: Kendaraan) {
        kendaraanDao.delete(kendaraan)
    }
}
