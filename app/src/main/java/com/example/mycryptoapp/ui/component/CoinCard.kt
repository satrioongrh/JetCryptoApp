package com.example.mycryptoapp.ui.component

import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.width
import androidx.compose.material3.Card
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.shadow
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.mycryptoapp.R
import com.example.mycryptoapp.ui.theme.MyCryptoAppTheme

@Composable
fun CoinCard(
    image: Int,
    title: String,
    coin: String,
    price: String,
    percen: String,
    modifier: Modifier = Modifier,
) {
    val color = when {
        percen.startsWith("+") -> Color.Green
        percen.startsWith("-") -> Color.Red
        else -> Color.Black
    }

    val chartColor: Int = when {
        percen.startsWith("+") -> R.drawable.up
        percen.startsWith("-") -> R.drawable.down
        else -> {
            R.drawable.btc
        }
    }
    Card(
        modifier = modifier
            .shadow(
                elevation = 4.dp,
                spotColor = Color(0x13000000),
                ambientColor = Color(0x13000000)
            )
            .padding(bottom = 5.dp)

    ) {
        Row(
            modifier = modifier
                .fillMaxWidth()
                .background(Color(0xFFFFFFFF))
                .height(72.dp)
                .padding(13.dp),
            verticalAlignment = Alignment.CenterVertically,
        ) {
            Image(
                painter = painterResource(id = image),
                contentDescription = null,
                contentScale = ContentScale.Crop,
                modifier = Modifier
                    .size(40.dp)
            )
            Spacer(modifier = Modifier.width(10.dp))
            Column(
                modifier = Modifier.weight(1f)
            ) {
                Text(
                    text = title,
                    style = TextStyle(
                        Color.Black,
                        fontWeight = FontWeight.Medium,
                        fontSize = 16.sp
                    )
                )
                Text(
                    text = coin,
                    style = TextStyle(
                        Color.Gray,
                        fontSize = 12.sp,

                        ),
                )
            }
            Image(
                painter = painterResource(id = chartColor),
                contentDescription = null,
                contentScale = ContentScale.Crop,
                modifier = Modifier
                    .width(50.dp)
                    .height(25.dp)
            )
            Spacer(modifier = Modifier.width(20.dp))
            Column(
                horizontalAlignment = Alignment.End
            ) {
                Text(
                    text = price,
                    style = TextStyle(
                        Color.Black,
                        fontSize = 16.sp,
                        FontWeight.Medium
                    )
                )
                Text(
                    text = percen,
                    style = TextStyle(
                        color = color,
                    )
                )
            }


        }
    }

}

@Preview
@Composable
fun CoinCardPreview() {
    MyCryptoAppTheme {
        CoinCard(
            image = R.drawable.btc,
            title = "bitcoin",
            coin = "BTC",
            price = "$29000",
            percen = "-10%"
        )
    }
}