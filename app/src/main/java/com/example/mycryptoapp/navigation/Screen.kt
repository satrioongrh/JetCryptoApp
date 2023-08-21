package com.example.mycryptoapp.navigation

sealed class Screen (val route: String) {
    object Home : Screen("Home")
    object Market : Screen("Market")
    object News : Screen("News")
    object Portofolio : Screen("Portofolio")
    object Profile : Screen("Profile")
    object DetailCoin : Screen("Home/{coinId}"){
        fun createRoute(coinId: Long) = "Home/$coinId"
    }
}
