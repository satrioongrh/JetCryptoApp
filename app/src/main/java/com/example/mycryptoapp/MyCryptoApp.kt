package com.example.mycryptoapp

import android.annotation.SuppressLint
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.Scaffold
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.navigation.NavHostController
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.rememberNavController
import com.example.mycryptoapp.navigation.Screen
import com.example.mycryptoapp.ui.screen.HomeScreen
import com.example.mycryptoapp.ui.screen.MarketScreen
import com.example.mycryptoapp.ui.screen.NewsScreen
import com.example.mycryptoapp.ui.screen.PortofolioScreen
import com.example.mycryptoapp.ui.screen.ProfileScreen

@OptIn(ExperimentalMaterial3Api::class)
@SuppressLint("UnusedMaterial3ScaffoldPaddingParameter")
@Composable
fun MyCryptoApp(
    modifier: Modifier = Modifier,
    navController: NavHostController = rememberNavController(),
) {
    Scaffold(
        bottomBar = {
            BottomBar(navController)
        },
        modifier = modifier
    ) { innerPadding ->
        NavHost(
            navController = navController,
            startDestination = Screen.Home.route,
            modifier = Modifier.padding(innerPadding)
        ) {
            composable(Screen.Home.route){
                HomeScreen()
            }
            composable(Screen.Portofolio.route){
                PortofolioScreen()
            }
            composable(Screen.News.route){
                NewsScreen()
            }
            composable(Screen.Market.route){
                MarketScreen(percen = "+10%")
            }
            composable(Screen.Profile.route){
                ProfileScreen()
            }
        }
    }
}