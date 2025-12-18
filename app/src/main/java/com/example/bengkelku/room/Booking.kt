package com.example.bengkelku.room

import androidx.room.Entity
import androidx.room.ForeignKey
import androidx.room.Index
import androidx.room.PrimaryKey

@Entity(
    tableName = "booking",
    foreignKeys = [
        ForeignKey(
            entity = Kendaraan::class,
            parentColumns = ["id"],
            childColumns = ["kendaraanId"],
            onDelete = ForeignKey.CASCADE
        ),
        ForeignKey(
            entity = Servis::class,
            parentColumns = ["idServis"],
            childColumns = ["servisId"],
            onDelete = ForeignKey.CASCADE
        )
    ],
    indices = [
        Index("kendaraanId"),
        Index("servisId")
    ]
)
data class Booking(
    @PrimaryKey(autoGenerate = true)
    val idBooking: Int = 0,

    val kendaraanId: Int,
    val servisId: Int,

    val tanggalServis: String,   // yyyy-MM-dd
    val jamServis: String,       // HH:mm

    val nomorAntrian: String,

    val status: String = "Menunggu",
    val totalBiaya: Int
)
