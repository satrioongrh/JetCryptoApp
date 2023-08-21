package com.example.mycryptoapp.data

import com.example.mycryptoapp.R

data class News (
    val image: Int,
    val headline: String,
    val news: String,
)

object dummyNews {
    val newsData = listOf(
        News(
            R.drawable.binance,
            "Binance",
            "Binance, bursa cryptocurrency terbesar di dunia, telah didakwa oleh Departemen Kehakiman AS dengan pencucian uang dan penipuan."
        ),
        News(
            R.drawable.tesla,
            "Tesla",
            "Tesla, produsen mobil listrik, telah menghentikan pembelian cryptocurrency Bitcoin."
        ),
        News(
            R.drawable.arkm,
            "Arkham",
            "Arkham Intelligence, perusahaan intelijen blockchain, telah merilis laporan yang menemukan bahwa pasar cryptocurrency telah dilanda pencucian uang dan penipuan."
        ),
        News(
            R.drawable.luna,
            "Luna",
            "Luna, stablecoin algoritmik yang didukung oleh Terra, telah runtuh, menyebabkan kerugian miliaran dolar."
        ),
        News(
            R.drawable.ftx,
            "Ftx",
            "FTX, bursa cryptocurrency yang berbasis di AS, telah mengakuisisi perusahaan perdagangan cryptocurrency LedgerX."
        ),
        News(
            R.drawable.a16z,
            "A16Z",
            "A16z, perusahaan modal ventura terkemuka, telah meluncurkan dana cryptocurrency senilai \$4,5 miliar."
        ),
        News(
            R.drawable.base,
            "Base",
            "Base, perusahaan perbankan digital, telah meluncurkan layanan yang memungkinkan pengguna membeli dan menjual cryptocurrency.."
        ),
        News(
            R.drawable.argnt,
            "Argent",
            "Lens, protokol oracle, telah meluncurkan fitur baru yang memungkinkan pengguna meminjam cryptocurrency yang didukung oleh aset dunia nyata."
        ),
        News(
            R.drawable.lens,
            "Lens",
            "Lens, protokol oracle, telah meluncurkan fitur baru yang memungkinkan pengguna meminjam cryptocurrency yang didukung oleh aset dunia nyata."
        ),
    )
}