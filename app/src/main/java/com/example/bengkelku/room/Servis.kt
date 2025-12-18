package com.example.bengkelku.room

import androidx.room.Entity
import androidx.room.PrimaryKey

@Entity(tableName = "servis")
data class Servis(
    @PrimaryKey(autoGenerate = true)
    val idServis: Int = 0,
    val namaServis: String,
    val harga: Int,
    val deskripsi: String? = null,
    val aktif: Boolean = true
)
