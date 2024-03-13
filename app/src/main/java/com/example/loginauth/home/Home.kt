package com.example.loginauth.home

import android.annotation.SuppressLint
import androidx.compose.foundation.ExperimentalFoundationApi
import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.border
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.wrapContentHeight
import androidx.compose.foundation.pager.HorizontalPager
import androidx.compose.foundation.pager.rememberPagerState
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Icon
import androidx.compose.material3.IconButton
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.alpha
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.tooling.preview.PreviewParameter
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.navigation.NavHostController
import com.example.loginauth.BottomNavigationBar
import com.example.loginauth.R
import com.example.loginauth.ui.theme.Blue
import com.example.loginauth.ui.theme.Yellow


@SuppressLint("UnusedMaterial3ScaffoldPaddingParameter")
@OptIn(ExperimentalFoundationApi::class)
@Composable
fun Home(navController: NavHostController) {
    val namaUser = "Moh Hatta"



    Scaffold(
        bottomBar = { BottomNavigationBar(navController = navController) }
    ) {
        Box(
            modifier = Modifier
                .fillMaxSize()
                .background(color = Color.White)
        )
        Column(
            Modifier
                .background(Color.Transparent)
        ) {
            Box(
                modifier = Modifier
                    .fillMaxWidth()
                    .height(94.dp)
                    .background(
                        Color.LightGray,
                        shape = RoundedCornerShape(bottomStart = 28.dp, bottomEnd = 28.dp)
                    )
            ) {
                Box(
                    modifier = Modifier
                        .fillMaxWidth()
                        .height(90.dp)
                        .background(
                            Blue,
                            shape = RoundedCornerShape(bottomStart = 30.dp, bottomEnd = 30.dp)
                        )
                ) {
                    Image(
                        painterResource(id = R.drawable.backgroundtopdashboard),
                        contentDescription = null,
                        contentScale = ContentScale.FillHeight,
                        modifier = Modifier
                            .alpha(0.3f)
                    )
                    Row(
                        modifier = Modifier
                            .fillMaxWidth()
                            .align(Alignment.CenterStart)
                    ) {
                        Image(
                            painterResource(id = R.drawable.tesimageprofile),
                            contentDescription = null,
                            modifier = Modifier
                                .padding(start = 24.dp, top = 18.dp, bottom = 18.dp, end = 12.dp)
                                .clip(CircleShape)
                                .border(3.dp, Yellow, CircleShape)
                        )
                        Text(
                            text = "$namaUser",
                            fontSize = 20.sp,
                            color = Color.White,
                            fontWeight = FontWeight.Bold,
                            modifier = Modifier
                                .align(Alignment.CenterVertically)
                                .padding()
                        )
                    }
//                Image(
//                    painterResource(id = R.drawable.icon_tambahevent),
//                    contentDescription = null,
//                    modifier = Modifier
//                        .padding(28.dp)
//                        .align(Alignment.CenterEnd)
//                        .clickable {
//
//                        }
//                )
                    IconButton(onClick = { /*TODO*/ },
                        modifier = Modifier
                            .padding(28.dp)
                            .align(Alignment.CenterEnd)
                    ) {
                        Icon(
                            painterResource(id = R.drawable.icon_tambahevent), contentDescription = null,
                            tint = Yellow,
                            modifier = Modifier
                                .padding(3.dp)
                                .size(30.dp)
                        )
                    }
                }
            }

            // Display 10 items
            val pagerState = rememberPagerState(pageCount = {
                10
            })
            HorizontalPager(state = pagerState) { page ->
                Column(
                    Modifier
                        .padding(top = 12.dp)
                ) {
                    Image(painterResource(
                        id = R.drawable.tespagedashboard),
                        contentDescription = null,
                        Modifier
                            .fillMaxWidth()
                    )
                }
            }
            Row(
                Modifier.run {
                    wrapContentHeight()
                        .fillMaxWidth()
                        .padding(bottom = 8.dp)
                },
                horizontalArrangement = Arrangement.Center
            ) {
                repeat(pagerState.pageCount) { iteration ->
                    val color = if (pagerState.currentPage == iteration)
                        Blue
                    else
                        Color.LightGray
                    if (pagerState.currentPage == iteration)
                        Box(
                            modifier = Modifier
                                .padding(top = 6.dp, start = 2.dp, end = 2.dp, bottom = 2.dp)
                                .clip(CircleShape)
                                .background(color)
                                .size(18.dp, 9.dp)
                                .align(Alignment.CenterVertically)
                        )
                    else
                        Box(
                            modifier = Modifier
                                .padding(top = 6.dp, start = 2.dp, end = 2.dp, bottom = 2.dp)
                                .clip(CircleShape)
                                .background(color)
                                .size(6.dp, 6.dp)
                                .align(Alignment.CenterVertically)
                        )
                }
            }


            Text(
                text = "Kategori",
                fontSize = 18.sp,
                fontWeight = FontWeight.SemiBold,
                color = Color.Black,
                modifier = Modifier
                    .align(Alignment.Start)
                    .padding(start = 24.dp)
            )
            Row(
                Modifier
                    .fillMaxWidth()
                    .background(Color.Transparent),
                Arrangement.Center
            ) {
                Column(
                    Modifier
                        .background(Color.Transparent),
                    Arrangement.Center
                ) {
                    Box(
                        Modifier
                            .padding(top = 12.dp, start = 12.dp, end = 12.dp)
                            .size(100.dp, 50.dp)
                            .background(Yellow, shape = RoundedCornerShape(30f))
                            .clickable { }
                    )
                    Text(
                        text = "Seminar",
                        fontSize = 13.sp,
                        color = Color.Black,
                        modifier = Modifier
                            .align(Alignment.CenterHorizontally)
                    )
                    Box(
                        Modifier
                            .padding(top = 12.dp, start = 12.dp, end = 12.dp)
                            .size(100.dp, 50.dp)
                            .background(Yellow, shape = RoundedCornerShape(30f))
                            .clickable { }
                    )
                    Text(
                        text = "Exchange",
                        fontSize = 13.sp,
                        color = Color.Black,
                        modifier = Modifier
                            .align(Alignment.CenterHorizontally)
                    )
                }
                Column(
                    Modifier
                        .background(Color.Transparent),
                    Arrangement.Center
                ) {
                    Box(
                        Modifier
                            .padding(top = 12.dp, start = 12.dp, end = 12.dp)
                            .size(100.dp, 50.dp)
                            .background(Yellow, shape = RoundedCornerShape(30f))
                            .clickable { }
                    )
                    Text(
                        text = "Lomba",
                        fontSize = 13.sp,
                        color = Color.Black,
                        modifier = Modifier
                            .align(Alignment.CenterHorizontally)
                    )
                    Box(
                        Modifier
                            .padding(top = 12.dp, start = 12.dp, end = 12.dp)
                            .size(100.dp, 50.dp)
                            .background(Yellow, shape = RoundedCornerShape(30f))
                            .clickable { }
                    )
                    Text(
                        text = "Bootcamp",
                        fontSize = 13.sp,
                        color = Color.Black,
                        modifier = Modifier
                            .align(Alignment.CenterHorizontally)
                    )
                }
                Column(
                    Modifier
                        .background(Color.Transparent),
                    Arrangement.Center
                ) {
                    Box(
                        Modifier
                            .padding(top = 12.dp, start = 12.dp, end = 12.dp)
                            .size(100.dp, 50.dp)
                            .background(Yellow, shape = RoundedCornerShape(30f))
                            .clickable { }
                    )
                    Text(
                        text = "Beasiswa",
                        fontSize = 13.sp,
                        color = Color.Black,
                        modifier = Modifier
                            .align(Alignment.CenterHorizontally)
                    )
                    Box(
                        Modifier
                            .padding(top = 12.dp, start = 12.dp, end = 12.dp)
                            .size(100.dp, 50.dp)
                            .background(Yellow, shape = RoundedCornerShape(30f))
                            .clickable { }
                    )
                    Text(
                        text = "Komunitas",
                        fontSize = 13.sp,
                        color = Color.Black,
                        modifier = Modifier
                            .align(Alignment.CenterHorizontally)
                    )
                }
            }
        }
    }
}

//@Preview
//@Composable
//fun prevHome() {
//    Home(onNavToHomePage = { /*TODO*/ }, onNavToSignUpPage = { /*TODO*/ }) {
//
//    }
//
//}




