package com.example.bengkelku.repository

import com.example.bengkelku.room.Booking
import com.example.bengkelku.room.BookingDao
import kotlinx.coroutines.flow.Flow

class RepositoryBooking(
    private val bookingDao: BookingDao
) {

    suspend fun insert(booking: Booking) {
        bookingDao.insert(booking)
    }

    suspend fun update(booking: Booking) {
        bookingDao.update(booking)
    }

    suspend fun delete(booking: Booking) {
        bookingDao.delete(booking)
    }

    // Admin
    fun getAllBooking(): Flow<List<Booking>> =
        bookingDao.getAllBooking()

    // Customer & Admin (status aktif)
    fun getBookingAktif(): Flow<List<Booking>> =
        bookingDao.getBookingAktif()

    // Customer (riwayat)
    fun getRiwayatBooking(): Flow<List<Booking>> =
        bookingDao.getRiwayatBooking()
}
