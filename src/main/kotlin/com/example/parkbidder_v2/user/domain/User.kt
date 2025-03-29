package com.example.parkbidder_v2.user.domain
import com.example.parkbidder_v2.parking.domain.ParkingSpot
import jakarta.persistence.*

@Entity
@Table(name = "users")
class User(
        @Id @GeneratedValue(strategy = GenerationType.IDENTITY)
        val userId: Long? = null,

        val password: String,
        val name: String,
        val position: String,

        @Enumerated(EnumType.STRING)
        val department: Department,

        var points: Long,

        @OneToOne(fetch = FetchType.LAZY)
        @JoinColumn(name = "current_spot_id")
        var currentSpot: ParkingSpot? = null
)

enum class Department {
    DEV, DESIGN, HR, SALES, OTHER
}