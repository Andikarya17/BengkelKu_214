package com.example.bengkelku.room

import androidx.room.Dao
import androidx.room.Delete
import androidx.room.Insert
import androidx.room.Query
import androidx.room.Update

import kotlinx.coroutines.flow.Flow

@Dao
interface BookingDao {

    @Insert
    suspend fun insert(booking: Booking)

    @Update
    suspend fun update(booking: Booking)

    @Delete
    suspend fun delete(booking: Booking)

    @Query("SELECT * FROM booking ORDER BY tanggalServis DESC, jamServis DESC")
    fun getAllBooking(): Flow<List<Booking>>

    @Query("""
        SELECT * FROM booking 
        WHERE status != 'Diambil'
        ORDER BY tanggalServis ASC, jamServis ASC
    """)
    fun getBookingAktif(): Flow<List<Booking>>

    @Query("""
        SELECT * FROM booking 
        WHERE status = 'Selesai' OR status = 'Diambil'
        ORDER BY tanggalServis DESC
    """)
    fun getRiwayatBooking(): Flow<List<Booking>>
}
