package com.example.mycryptoapp.data

import com.example.mycryptoapp.R

data class Crypto(
    val id: Long,
    val image: Int,
    val title: String,
    val coin: String,
    val price: String,
    val percen: String
)

object dummyCrypto {
    val coinCrypto =
        listOf(
            Crypto(1, R.drawable.btc, "Bitcoin", "BTC", "$29000", "+10%"),
            Crypto(2, R.drawable.eth, "Ethereum", "ETH", "$1700", "-11%"),
            Crypto(3, R.drawable.usdt, "Bitcoin", "BTC", "$29000", "+12%"),
            Crypto(4, R.drawable.bnb, "Bitcoin", "BTC", "$29000", "-13%"),
            Crypto(5,R.drawable.op, "Bitcoin", "BTC", "$29000", "+14%"),
            Crypto(6, R.drawable.arb, "Bitcoin", "BTC", "$29000", "-15%"),
            Crypto(7, R.drawable.ada, "Bitcoin", "BTC", "$29000", "+16%"),
            Crypto(8, R.drawable.avax, "Bitcoin", "BTC", "$29000", "-17%"),
            Crypto(9, R.drawable.doge, "Bitcoin", "BTC", "$29000", "+18%"),
            Crypto(10, R.drawable.sol, "Bitcoin", "BTC", "$29000", "-19%"),
            Crypto(11, R.drawable.trx, "Bitcoin", "BTC", "$29000", "+20%"),
            Crypto(12, R.drawable.usdc, "Bitcoin", "BTC", "$29000", "-19%"),
            Crypto(13, R.drawable.xrp, "Bitcoin", "BTC", "$29000", "+18%"),
            Crypto(14, R.drawable.ltc, "Bitcoin", "BTC", "$29000", "-17%"),
            Crypto(15, R.drawable.matic, "Bitcoin", "BTC", "$29000", "+16%"),
        )
}