package com.example.mycryptoapp.ui.screen

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Search
import androidx.compose.material3.Divider
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.Icon
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.SpanStyle
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.text.buildAnnotatedString
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.withStyle
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.mycryptoapp.data.dummyCrypto

@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun MarketScreen(
    modifier: Modifier = Modifier,
    percen: String,
) {
    val color = when {
        percen.startsWith("+") -> Color.Green
        percen.startsWith("-") -> Color.Red
        else -> Color.Black
    }
    val text = when {
        percen.startsWith("+") -> "up"
        percen.startsWith("-") -> "down"
        else -> ""
    }
    var expanded by remember {
        mutableStateOf(false)
    }
    val market = arrayOf("USD", "IDR", "INR")
    var selectedText by remember { mutableStateOf(market[0]) }
    Column(
        modifier = modifier
            .fillMaxSize()
            .background(color = Color(0xFFF8F9FA))
            .padding(horizontal = 16.dp, vertical = 56.dp)
    ) {
        Row(modifier = modifier.padding(bottom = 2.dp)) {
            Text(
                text = buildAnnotatedString {
                    append("Market is $text")
                    withStyle(
                        style = SpanStyle(
                            color = color,
                            fontSize = 20.sp

                        )
                    ) {
                        append(" -11.77%")
                    }
                },
                style = TextStyle(
                    fontSize = 20.sp,
                    fontWeight = FontWeight.Medium
                ),
                modifier = modifier.weight(1f)
            )
            Icon(imageVector = Icons.Default.Search, contentDescription = null)
        }
        Text(
            text = "In the past 24 hours",
            style = TextStyle(
                Color.Gray,
                fontSize = 12.sp,
            )
        )
        Row {
            Text(
                text = "Coins",
                style = TextStyle(
                    Color.Black,
                    fontSize = 18.sp,
                    fontWeight = FontWeight.Bold
                ),
                modifier = modifier
                    .padding(top = 31.dp)
            )
        }
        Row (
            horizontalArrangement = Arrangement.SpaceAround,
            modifier = modifier
                .fillMaxWidth()
                .padding(top = 24.dp)
        ) {
            Text(text = "All", fontSize = 14.sp)
            Text(text = "Gainer", fontSize = 14.sp)
            Text(text = "Loser", fontSize = 14.sp)
            Text(text = "Favourites", fontSize = 14.sp)
        }
        Divider(modifier = Modifier
            .fillMaxWidth()
            .padding(top = 4.dp), thickness = 1.dp)
        Spacer(modifier = modifier.height(28.dp))
        ListCrytoCoin(coins = dummyCrypto.coinCrypto)
    }


}

@Preview
@Composable
fun PreviewMarket() {
}