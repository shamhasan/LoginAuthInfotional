@file:OptIn(ExperimentalMaterial3Api::class, ExperimentalMaterial3Api::class)

package com.example.LoginAuth.threeMainPages

import android.annotation.SuppressLint
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.items
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Search
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.Icon
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Scaffold
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
import androidx.compose.ui.text.font.FontStyle
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextOverflow
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.navigation.NavHostController
import com.example.loginauth.BottomNavigationBar
import com.example.loginauth.ui.theme.Blue
import com.example.loginauth.ui.theme.LilDarkBlue
import com.example.loginauth.ui.theme.Yellow

//@Preview
@SuppressLint("UnusedMaterial3ScaffoldPaddingParameter")
@Composable
fun CariMentor(navController: NavHostController) {

    Scaffold (
        bottomBar = { BottomNavigationBar(navController = navController, 1) }
    ) {
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
                        text = "Cari Mentor",
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
                    .background(Color.LightGray)
            ) {
                var state by remember { mutableStateOf(0) }
                val titles = listOf("Mentor", "Riwayat Chat")
                Column {
                    SecondaryTabRow(selectedTabIndex = state) {
                        titles.forEachIndexed { index, title ->
                            Tab(
                                selected = state == index,
                                onClick = { state = index },
                                text = {
                                    Text(
                                        text = title,
                                        maxLines = 2,
                                        overflow = TextOverflow.Ellipsis,
                                        style = TextStyle(
                                            color = if (state == index) Color.Yellow else Color.White
                                        )
                                    )
                                },
                                modifier = Modifier.background(LilDarkBlue)
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
                                text = "Cari Mentor",
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
                    .background(Color.LightGray)
            ) {
                var state by remember { mutableStateOf(0) }
                val titles = listOf("Terkait", "Terfavorit")
                Column {
                    SecondaryTabRow(selectedTabIndex = state) {
                        titles.forEachIndexed { index, title ->
                            Tab(
                                selected = state == index,
                                onClick = { state = index },
                                text = {
                                    Text(
                                        text = title,
                                        maxLines = 2,
                                        overflow = TextOverflow.Ellipsis,
                                        style = TextStyle(
                                            color = if (state == index) Color.Yellow else Color.White
                                        )
                                    )
                                },
                                modifier = Modifier.background(LilDarkBlue)
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
                "Daffi Laksamana",
                "Jeanne Laurensie",
                "Reinanda Pradana",
                "Ki Broto",
                "Ibrahim Mufiq",
                "Aqueela Faradis",
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
                            .background(Blue, RoundedCornerShape(20.dp))
                    ) {
                        Row {
                            Box(
                                Modifier
                                    .padding(18.dp)
                                    .size(100.dp, 180.dp)
                                    .background(LilDarkBlue, RoundedCornerShape(12.dp))
                            ) {

                            }
                            Column {
                                Text(
                                    text = item,
                                    color = Color.White,
                                    fontSize = 18.sp,
                                    fontWeight = FontWeight.Bold,
                                    modifier = Modifier
                                        .padding(top = 18.dp)
                                )
                                Text(
                                    text = "Magister Ilmu Komputer",
                                    color = Color.White,
                                    fontStyle = FontStyle.Italic,
                                    fontSize = 12.sp,
                                    modifier = Modifier
                                        .padding()
                                )
                                Text(
                                    text = "Universitas Brawijaya",
                                    color = Color.White,
                                    fontSize = 12.sp,
                                    modifier = Modifier
                                        .padding()
                                )
                                Text(
                                    text = "Rp. 40.000",
                                    color = Color.White,
                                    fontSize = 20.sp,
                                    fontWeight = FontWeight.Bold,
                                    modifier = Modifier
                                        .padding()
                                )
                                Box(
                                    Modifier
                                        .padding(top = 8.dp)
                                        .size(220.dp, 30.dp)
                                        .background(Yellow, RoundedCornerShape(30.dp))
                                ) {
                                    Text(text = "Kirim Pesan",
                                        fontWeight = FontWeight.SemiBold,
                                        color = Color.White,
                                        modifier = Modifier.align(Alignment.Center))
                                }
                            }
                        }
                    }
                }
            }
        }
    }
}




