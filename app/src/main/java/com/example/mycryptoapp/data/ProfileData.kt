package com.example.mycryptoapp.data

import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Home
import androidx.compose.material.icons.filled.Info
import androidx.compose.material.icons.filled.KeyboardArrowRight
import androidx.compose.material.icons.filled.Lock
import androidx.compose.material.icons.filled.Notifications
import androidx.compose.material.icons.filled.Refresh
import androidx.compose.material.icons.filled.Warning
import androidx.compose.ui.graphics.vector.ImageVector

data class ProfileData (
    val icon: ImageVector,
    val name: String,
    val icon2: ImageVector
)

object dummyProfile {
    val listDataProfile = listOf(
        ProfileData(Icons.Default.Refresh, "History", Icons.Default.KeyboardArrowRight),
        ProfileData(Icons.Default.Home, "Bank Details", Icons.Default.KeyboardArrowRight),
        ProfileData(Icons.Default.Notifications, "Notifications", Icons.Default.KeyboardArrowRight),
        ProfileData(Icons.Default.Lock, "Security", Icons.Default.KeyboardArrowRight),
        ProfileData(Icons.Default.Info, "Help and Support", Icons.Default.KeyboardArrowRight),
        ProfileData(Icons.Default.Warning, "Terms and Conditions", Icons.Default.KeyboardArrowRight),
    )
}