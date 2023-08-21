package com.example.mycryptoapp.ui.screen

import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.items
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Divider
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.mycryptoapp.R
import com.example.mycryptoapp.data.dummyProfile
import com.example.mycryptoapp.ui.component.CardProfile
import com.example.mycryptoapp.ui.theme.MyCryptoAppTheme

@Composable
fun ProfileScreen() {
    Column(
        modifier = Modifier
            .fillMaxSize()
            .background(color = Color(0xFFF8F9FA))
            .padding(horizontal = 16.dp, vertical = 56.dp)
    ) {
        Column(
            modifier = Modifier
                .fillMaxWidth()
                .background(
                    color = Color(0xFF0063F5),
                    shape = RoundedCornerShape(size = 12.dp)
                ),
            horizontalAlignment = Alignment.CenterHorizontally
        ) {
            Image(
                painter = painterResource(id = R.drawable.btc),
                contentDescription = null,
                contentScale = ContentScale.FillBounds,
                modifier = Modifier
                    .padding(top = 24.dp)
                    .size(88.dp)

            )
            Text(
                text = "Satriyo Nugroho",
                style = TextStyle(
                    Color.White,
                    fontSize = 20.sp,
                    fontWeight = FontWeight.Bold
                ),
                modifier = Modifier
                    .padding(top = 12.dp)
            )
            Text(
                text = "satriyonugroho@gmail.com",
                style = TextStyle(
                    Color.White,
                    fontSize = 12.sp,
                ),
                modifier = Modifier.padding(top = 8.dp)
            )
            Text(
                text = "+62 123456789",
                style = TextStyle(
                    Color.White,
                    fontSize = 12.sp,
                ),
                modifier = Modifier
                    .padding(top = 4.dp, bottom = 18.dp)
            )
        }
        LazyColumn(
            modifier = Modifier
                .fillMaxWidth()
        ){
            items(dummyProfile.listDataProfile){ item ->
                Column {
                    CardProfile(icon = item.icon, name = item.name, icon2 = item.icon2)
                    Divider(thickness = 1.dp, color = Color.Black)
                }
            }
        }
    }
}

@Preview
@Composable
fun PreviewProfileScreen() {
    MyCryptoAppTheme {
        ProfileScreen()
    }
}