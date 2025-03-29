package com.example.parkbidder_v2.parking.domain
import jakarta.persistence.*

@Entity
class ParkingSpot(
        @Id @GeneratedValue(strategy = GenerationType.IDENTITY)
        val spotId: Long? = null,

        @Enumerated(EnumType.STRING)
        val status: SpotStatus,

        @ManyToOne(fetch = FetchType.LAZY)
        @JoinColumn(name = "zone_id")
        val zone: ParkingZone
)

enum class SpotStatus {
    AVAILABLE, OCCUPIED, MAINTENANCE
}
