package com.example.mycryptoapp.ui.screen

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.LazyRow
import androidx.compose.foundation.lazy.items
import androidx.compose.material3.Divider
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.mycryptoapp.data.dummyNews
import com.example.mycryptoapp.ui.component.NewsCard
import com.example.mycryptoapp.ui.theme.MyCryptoAppTheme

@Composable
fun NewsScreen() {
    Column(
        modifier = Modifier
            .fillMaxSize()
            .background(color = Color(0xFFF8F9FA))
            .padding(horizontal = 16.dp, vertical = 56.dp)
    ) {
        Text(
            text = "Trending News",
            style = TextStyle(
                Color.Black,
                fontSize = 20.sp,
                fontWeight = FontWeight.Medium
            ),
            modifier = Modifier.padding(bottom = 6.dp)
        )
        LazyRow (modifier = Modifier.padding(bottom = 15.dp)) {
            items(dummyNews.newsData) {
                NewsCard(image = it.image, headline = it.headline, news = it.news, modifier = Modifier.width(200.dp))
                Divider(modifier = Modifier.width(5.dp))
            }
        }
        Text(
            text = "Latest News",
            style = TextStyle(
                Color.Black,
                fontSize = 20.sp,
                fontWeight = FontWeight.Medium
            ),
            modifier = Modifier.padding(bottom = 6.dp)
        )
        LazyColumn{
            items(dummyNews.newsData){
                NewsCard(image = it.image, headline = it.headline, news = it.news)
                Spacer(modifier = Modifier.height(5.dp))
            }
        }
    }
}


@Preview
@Composable
fun PreviewScreen() {
    MyCryptoAppTheme {
        NewsScreen()
    }
}