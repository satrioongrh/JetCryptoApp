package com.example.mycryptoapp.ui.component

import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.KeyboardArrowRight
import androidx.compose.material.icons.filled.Refresh
import androidx.compose.material3.Icon
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.mycryptoapp.ui.theme.MyCryptoAppTheme

@Composable
fun CardProfile(
    icon: ImageVector,
    name: String,
    icon2: ImageVector
){
    Row (
        modifier = Modifier
            .padding(vertical = 25.dp, horizontal = 3.dp)
            .fillMaxWidth()
            ,
        verticalAlignment = Alignment.CenterVertically
    ) {
        Icon(
            imageVector = icon,
            contentDescription = null,
            modifier = Modifier
                .size(24.dp),
            tint = Color(0xFF0063F5)
        )
        Text(
            text = name,
            style = TextStyle(
                Color.Black,
                fontSize = 17.sp,
                fontWeight = FontWeight.Medium
            ),
            modifier = Modifier.padding(start = 17.dp).weight(1f)
        )
        Icon(
            imageVector = icon2,
            contentDescription = null,
            modifier = Modifier
                .size(24.dp),
        )
    }
}

@Preview(showBackground = true)
@Composable
fun PreviewCardProfile(){
    MyCryptoAppTheme {
        CardProfile(icon = Icons.Default.Refresh, name = "History", icon2 = Icons.Default.KeyboardArrowRight)
    }
}