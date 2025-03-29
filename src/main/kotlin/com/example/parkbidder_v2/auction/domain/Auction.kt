package com.example.parkbidder_v2.auction.domain
import com.example.parkbidder_v2.parking.domain.ParkingSpot
import com.example.parkbidder_v2.user.domain.User
import jakarta.persistence.*
import java.time.LocalDateTime

@Entity
class Auction(
        @Id @GeneratedValue(strategy = GenerationType.IDENTITY)
        val auctionId: Long? = null,

        val startTime: LocalDateTime,
        val endTime: LocalDateTime,
        var currentHighestBid: Int = 0,
        var currentCount: Int = 0,

        @Enumerated(EnumType.STRING)
        var auctionStatus: AuctionStatus,

        val auctionPeriodCode: String,

        @ManyToOne(fetch = FetchType.LAZY)
        @JoinColumn(name = "winner_id")
        var winner: User? = null,

        @ManyToOne(fetch = FetchType.LAZY)
        @JoinColumn(name = "spot_id")
        val spot: ParkingSpot
)

enum class AuctionStatus {
    READY, IN_PROGRESS, FINISHED
}
