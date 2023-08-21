package com.example.mycryptoapp.ui.component

import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Card
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Brush
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextOverflow
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.mycryptoapp.R
import com.example.mycryptoapp.ui.theme.MyCryptoAppTheme

@Composable
fun NewsCard(
    image: Int,
    headline: String,
    news: String,
    modifier: Modifier = Modifier
) {
    Card(
        modifier = modifier
    ) {
        Box(
            modifier = Modifier
                .height(220.dp)
        ) {
            Image(
                painter = painterResource(id = image),
                contentDescription = null,
                contentScale = ContentScale.Crop,
                modifier = Modifier
                    .fillMaxSize()
            )
            Box(
                modifier = Modifier
                    .fillMaxSize()
                    .background(
                        brush = Brush.verticalGradient(
                            colors = listOf(
                                Color.Transparent,
                                Color.Black
                            ),
                            startY = 270f
                        )
                    )

            )
            Box(
                modifier = Modifier
                    .fillMaxSize()
                    .padding(15.dp),
                contentAlignment = Alignment.BottomStart
            ) {
                Column {
                    Text(
                        text = headline,
                        style = TextStyle(
                            Color.White,
                            fontSize = 24.sp,
                            fontWeight = FontWeight.Medium
                        )
                    )
                    Text(
                        text = news,
                        style = TextStyle(
                            Color.White,
                        ),
                        maxLines = 1,
                        overflow = TextOverflow.Ellipsis
                        )
                }

            }
        }
    }
}

@Preview
@Composable
fun PreviewNewsCard() {
    MyCryptoAppTheme {
        NewsCard(
            image = R.drawable.tesla,
            headline = "Binance",
            news = "Binance, bursa cryptocurrency terbesar di dunia, telah didakwa oleh Departemen Kehakiman AS dengan pencucian uang dan penipuan."
        )
    }
}