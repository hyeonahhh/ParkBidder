package com.example.parkbidder_v2.bid.domain

import com.example.parkbidder_v2.auction.domain.Auction
import com.example.parkbidder_v2.user.domain.User
import jakarta.persistence.*
import java.time.LocalDateTime

@Entity
class Bid(
        @Id @GeneratedValue(strategy = GenerationType.IDENTITY)
        val bidId: Long? = null,

        val bidAmount: Int,
        val bidTime: LocalDateTime = LocalDateTime.now(),

        @ManyToOne(fetch = FetchType.LAZY)
        @JoinColumn(name = "auction_id")
        val auction: Auction,

        @ManyToOne(fetch = FetchType.LAZY)
        @JoinColumn(name = "bidder_id")
        val bidder: User
)
