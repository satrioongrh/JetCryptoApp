package com.example.mycryptoapp.ui.screen

import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.items
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Button
import androidx.compose.material3.ButtonDefaults
import androidx.compose.material3.Card
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.mycryptoapp.R
import com.example.mycryptoapp.data.Crypto
import com.example.mycryptoapp.data.dummyCrypto
import com.example.mycryptoapp.ui.component.CoinCard
import com.example.mycryptoapp.ui.theme.MyCryptoAppTheme


@Composable
fun HomeScreen(
    modifier: Modifier = Modifier
        .fillMaxSize()
        .background(Color(0xFFF8F9FA))
        .padding(10.dp),
) {
    Column(
        modifier = modifier
            .padding(13.dp)
    ) {
        BoxHomeScreen(name = "satrio")
        Spacer(modifier = Modifier.height(32.dp))
        Text(
            text = "Trending Coins",
            style = TextStyle(
                color = Color.Black,
                fontWeight = FontWeight.Bold,
                fontSize = 20.sp
            )
        )
        ListCrytoCoin(coins = dummyCrypto.coinCrypto)
    }
}

@Composable
fun ListCrytoCoin(
    coins: List<Crypto>,
){
    LazyColumn {
        items(coins){coin ->
            CoinCard(
                image = coin.image,
                title = coin.title,
                coin = coin.coin,
                price = coin.price,
                percen = coin.percen,
            )
        }
    }
}

@Composable
fun BoxHomeScreen(
    name: String,
    modifier: Modifier = Modifier
) {
    Card(
        modifier = modifier
            .fillMaxWidth()
            .height(141.dp),

        ) {
        Column(
            modifier = modifier
                .background(color = Color(0xFF0063F5))
                .fillMaxSize()
                .padding(20.dp)
        ) {
            Text(
                text = "Welcome $name",
                style = TextStyle(
                    Color.White,
                    fontSize = 12.sp
                )
            )
            Text(
                text = "Make Your Investment Today",
                style = TextStyle(
                    Color.White,
                    fontSize = 18.sp,
                    fontWeight = FontWeight.Bold
                ),
                modifier = modifier
                    .padding(top = 8.dp)
            )
            Spacer(modifier = modifier.height(20.dp))
            Button(
                onClick = { },
                colors = ButtonDefaults.buttonColors(containerColor = Color.White),
                modifier = modifier
            )
            {
                Text(text = "Portofolio", color = Color(0xFF0063F5))
            }
        }
    }
}

@Composable
fun DetailCoins(
    id: Long,
    image: Int,
    title: String,
    coin: String,
    price: String,
    percen: String,
    modifier: Modifier = Modifier
){
    Column (
        modifier = Modifier
            .fillMaxSize()
            .background(Color(0xFFF8F9FA))
            .padding(10.dp),
        horizontalAlignment = Alignment.CenterHorizontally
    ) {
        Image(
            painter = painterResource(image),
            contentDescription = null,
            contentScale = ContentScale.Crop,
            modifier = modifier
                .height(400.dp)
                .fillMaxWidth()
                .clip(RoundedCornerShape(bottomStart = 20.dp, bottomEnd = 20.dp))
        )
        Text(
            text = title,
            style = TextStyle(
                Color.Black,
                fontSize = 25.sp,
                fontWeight = FontWeight.Bold
            )
        )
        Text(
            text = coin,
            style = TextStyle(
                Color.Black,
                fontSize = 25.sp,
                fontWeight = FontWeight.Bold
            )
        )
    }
}

@Preview
@Composable
fun HomeScreenPreview() {
    MyCryptoAppTheme {
        DetailCoins(id = 1, image = R.drawable.btc, title = "BTC", coin = "Bitcoin", price = "$29000", percen = "+10%")
    }
}