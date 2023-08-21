package com.example.mycryptoapp.ui.screen

import androidx.compose.foundation.BorderStroke
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Card
import androidx.compose.material3.CardDefaults
import androidx.compose.material3.Divider
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.mycryptoapp.data.dummyCrypto
import com.example.mycryptoapp.ui.theme.MyCryptoAppTheme

@Composable
fun PortofolioScreen() {
    Column(
        modifier = Modifier
            .fillMaxSize()
            .background(color = Color(0xFFF8F9FA))
            .padding(horizontal = 16.dp, vertical = 56.dp),

    ) {
        BoxProfileScreen()
        Row(
            modifier = Modifier
                .padding(top = 12.dp)
                .fillMaxWidth(),
            horizontalArrangement = Arrangement.SpaceBetween
        ) {
            Card(
                modifier = Modifier
                    .width(164.dp)
                    .height(48.dp),
                colors = CardDefaults.cardColors(
                    containerColor = Color(0xFF0063F5),
                ),
                shape = RoundedCornerShape(4.dp)
            ) {
                Text(
                    text = "Deposit USD",
                    style = TextStyle(
                        Color.White,
                        fontSize = 14.sp
                    ),
                    modifier = Modifier
                        .fillMaxSize()
                        .padding(vertical = 14.dp, horizontal = 40.dp)
                )
            }
            Card(
                modifier = Modifier
                    .width(164.dp)
                    .height(48.dp),
                colors = CardDefaults.cardColors(
                    containerColor = Color.White,
                ),
                shape = RoundedCornerShape(4.dp),
                border = BorderStroke(1.dp, color = Color(0xFF0063F5))
            ) {
                Text(
                    text = "Withdraw USD",
                    style = TextStyle(
                        Color(0xFF0063F5),
                        fontSize = 14.sp
                    ),
                    modifier = Modifier
                        .fillMaxSize()
                        .padding(vertical = 14.dp, horizontal = 35.dp)
                )
            }
        }
        Text(
            text = "Your Coin",
            style = TextStyle(
                Color.Black,
                fontSize = 20.sp,
                fontWeight = FontWeight.ExtraBold
            ),
            modifier = Modifier.padding(top = 40.dp)
        )
        ListCrytoCoin(coins = dummyCrypto.coinCrypto)
    }
}

@Composable
fun BoxProfileScreen(
    modifier: Modifier = Modifier
) {
    Card(
        modifier = modifier
            .fillMaxWidth()
            .height(196.dp)
    ) {
        Column(
            modifier = modifier
                .background(color = Color(0xFF0063F5))
                .fillMaxSize()
                .padding(horizontal = 24.dp, vertical = 20.dp)
        ) {
            Text(
                text = "Portfolio",
                style = TextStyle(
                    Color.White,
                    fontSize = 20.sp,
                    fontWeight = FontWeight.Bold
                )
            )
            Text(
                text = "Holding Value",
                style = TextStyle(
                    Color.White,
                    fontSize = 10.sp,
                ),
                modifier = Modifier
                    .padding(top = 15.dp)
            )
            Row(
                verticalAlignment = Alignment.Bottom
            ) {
                Text(
                    text = "$2.430",
                    style = TextStyle(
                        Color.White,
                        fontSize = 28.sp
                    )
                )
                Text(
                    text = "+9.77%",
                    style = TextStyle(
                        Color(0xADFFFFFF),
                        fontSize = 14.sp
                    ),
                    modifier = Modifier.padding(bottom = 6.dp, start = 6.dp)
                )
            }
            Row(
                modifier = Modifier
                    .padding(top = 21.dp)
                    .fillMaxWidth()
            ) {
                Column {
                    Text(
                        text = "invested value",
                        style = TextStyle(
                            Color.White,
                            fontSize = 10.sp,
                        ),

                        )
                    Text(
                        text = "$2.000",
                        style = TextStyle(
                            Color.White,
                            fontSize = 18.sp,
                            fontWeight = FontWeight.Medium
                        )
                    )
                }
                Spacer(modifier = Modifier.width(30.dp))
                Divider(
                    color = Color.White,
                    thickness = 1.dp,
                    modifier = Modifier
                        .height(height = 38.dp)
                        .width(width = 1.dp)
                )
                Column(modifier = Modifier.padding(start = 18.dp)) {
                    Text(
                        text = "Available USD",
                        style = TextStyle(
                            Color.White,
                            fontSize = 10.sp
                        ),
                    )
                    Text(
                        text = "$430",
                        style = TextStyle(
                            Color.White,
                            fontSize = 18.sp,
                            fontWeight = FontWeight.Medium
                        )
                    )
                }
            }
        }
    }

}

@Preview
@Composable
fun Preview() {
    MyCryptoAppTheme {
//        PortofolioScreen()
    }
}