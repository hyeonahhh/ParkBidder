package com.example.parkbidder_v2.parking.domain
import jakarta.persistence.Entity
import jakarta.persistence.GeneratedValue
import jakarta.persistence.GenerationType
import jakarta.persistence.Id

@Entity
class ParkingZone (
        @Id @GeneratedValue(strategy = GenerationType.IDENTITY)
        val zoneId: Long? = null,

        val zoneName: String,
        val totalSpots: Int,
        val locationDetail: String,
        val basePrice: Int
)
