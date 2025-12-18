package com.example.bengkelku.room

import androidx.room.Entity
import androidx.room.PrimaryKey


@Entity(tableName = "kendaraan")
data class Kendaraan(
    @PrimaryKey(autoGenerate = true)
    val id: Int = 0,
    val merk: String,
    val model: String,
    val nomorPlat: String,
    val tahun: Int? = null
)
