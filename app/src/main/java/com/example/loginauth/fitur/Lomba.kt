@file:OptIn(ExperimentalMaterial3Api::class, ExperimentalMaterial3Api::class)

package com.example.loginauth.fitur

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.items
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Search
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.Icon
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.SearchBar
import androidx.compose.material3.SecondaryTabRow
import androidx.compose.material3.Tab
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.saveable.rememberSaveable
import androidx.compose.runtime.setValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextOverflow
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.loginauth.ui.theme.Blue
import com.example.loginauth.ui.theme.LilDarkBlue


@Preview
@Composable
fun Lomba() {


    Box(
        modifier = Modifier
            .fillMaxSize()
            .background(color = Color.White)
    ) {

    }
    Column {
        Box(
            Modifier
                .height(90.dp)
                .fillMaxWidth()
                .background(Blue)
        ) {
            Column(
                modifier = Modifier
                    .align(Alignment.Center),
                verticalArrangement = Arrangement.Center,
                horizontalAlignment = Alignment.CenterHorizontally
            ) {
                Text(
                    text = "Lomba",
                    fontSize = 18.sp,
                    fontWeight = FontWeight.SemiBold,
                    color = Color.White,
                    modifier = Modifier
                        .padding(top = 18.dp)
                )
            }
        }
        Box(
            Modifier
                .height(48.dp)
                .fillMaxWidth()
                .background(LilDarkBlue)
        ) {
            Column(
                Modifier
                    .align(Alignment.TopCenter),
                Arrangement.Center,
                Alignment.CenterHorizontally,
            ) {

                var text by rememberSaveable { mutableStateOf("") }
                var active by rememberSaveable { mutableStateOf(false) }

                SearchBar(
                    query = text,
                    onQueryChange = {text = it},
                    onSearch = {active = false},
                    active = active,
                    onActiveChange = {active = it},
                    leadingIcon = {
                        Icon(
                            (Icons.Default.Search),
                            contentDescription = null,
                            tint = Color.Gray
                        )
                        Text(
                            text = "Cari Lomba",
                            fontSize = 12.sp,
                            fontWeight = FontWeight.Normal,
                            color = Color.Gray,
                            modifier = Modifier
                                .padding(start = 28.dp)
                        )},
                    modifier = Modifier
                        .height(36.dp)
                ) {

                }
            }

        }
        Box(
            Modifier
                .height(28.dp)
                .fillMaxWidth()
                .background(Blue)
        ) {
            var state by remember { mutableStateOf(0) }
            val titles = listOf("Terkait", "Terbaru", "Terdekat")
            Column {
                SecondaryTabRow(selectedTabIndex = state) {
                    titles.forEachIndexed { index, title ->
                        Tab(
                            selected = state == index,
                            onClick = { state = index },
                            text = { Text(text = title, maxLines = 2, overflow = TextOverflow.Ellipsis, style = TextStyle(
                                color = if (state == index) Color.Yellow else Color.White
                            )
                            ) },
                            modifier = Modifier.background(Blue)
                        )
                    }
                }
                Text(
                    modifier = Modifier.align(Alignment.CenterHorizontally),
                    text = "Secondary tab ${state + 1} selected",
                    style = MaterialTheme.typography.bodyLarge
                )
            }
        }
        val items = listOf(
            "Item 1",
            "Item 2",
            "Item 3",
            "Item 4",
            "Item 5",
            "Item 6",
            "Item 7",
            "Item 8",
            "Item 9",
            "Item 10"
        )

        LazyColumn {
            items(items, key = { it }) { item ->
                Box(
                    modifier = Modifier
                        .height(200.dp)
                        .fillMaxWidth()
                        .padding(18.dp)
                        .background(Color.LightGray, RoundedCornerShape(20.dp))
                ) {
                    Text(
                        text = item,
                        modifier = Modifier
                            .align(Alignment.Center)
                            .padding(16.dp)
                            .padding(8.dp)
                    )
                }
            }
        }
    }
}




