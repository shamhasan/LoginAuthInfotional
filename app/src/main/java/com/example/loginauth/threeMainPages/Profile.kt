package com.example.LoginAuth.threeMainPages

import android.annotation.SuppressLint
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
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.Scaffold
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.draw.scale
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.navigation.NavHostController
import com.example.loginauth.BottomNavigationBar
import com.example.loginauth.R
import com.example.loginauth.ui.theme.Blue
import com.example.loginauth.ui.theme.Yellow

//@Preview
@SuppressLint("UnusedMaterialScaffoldPaddingParameter")
@Composable
fun Profile(
    navController: NavHostController,
) {
    val namaUser = "Brandon Geraldo"

    Scaffold(
        bottomBar = { BottomNavigationBar(navController = navController, 2) }
    ) {
        //box putih background display
        Box(
            modifier = Modifier
                .fillMaxSize()
                .background(color = Color.White)
        )
        // box biru background bagian atas
        Box(
            Modifier
                .fillMaxWidth()
                .height(120.dp)
                .background(color = Blue)
        )

        Box(
            Modifier
                .fillMaxWidth()
                .height(60.dp)
                .background(Color.Transparent)
        ) {
            Box(
                modifier = Modifier
                    .align(Alignment.CenterStart)
                    .padding(start = 12.dp)
                    .size(24.dp, 24.dp)
                    .background(Color.Transparent, RoundedCornerShape(24f))
                    .clickable { }
            ) {
                Image(
                    painterResource(id = R.drawable.panah),
                    contentDescription = null
                )
            }
        }


        Column(
            Modifier
                .background(Color.Transparent),
            Arrangement.Center,
            Alignment.CenterHorizontally
        ) {
            // box profile picture sama username background transparan
            Box(
                Modifier
                    .fillMaxWidth()
                    .padding(top = 60.dp)
                    .background(Color.Transparent),
                Alignment.Center,
            ) {
                Column(
                    Modifier
                        .background(Color.Transparent),
                    Arrangement.Center,
                    Alignment.CenterHorizontally
                ) {
                    Image(
                        painterResource(id = R.drawable.tesimageprofile),
                        contentDescription = null,
                        modifier = Modifier
                            .size(100.dp)
                            .clip(CircleShape)
                            .border(4.dp, Yellow, CircleShape)
                            .clickable { }
                    )
                    Text(
                        text = "Nama Orang",
                        fontSize = 22.sp,
                        fontWeight = FontWeight.SemiBold,
                        color = Color.Black,
                        modifier = Modifier.padding(top = 8.dp, bottom = 24.dp)
                    )
                }
            }
            Text(
                text = "Profile",
                fontSize = 16.sp,
                fontWeight = FontWeight.SemiBold,
                color = Color.LightGray,
                modifier = Modifier
                    .align(Alignment.Start)
                    .padding(start = 24.dp)
            )
            Box(
                Modifier
                    .padding(top = 12.dp, start = 24.dp, end = 24.dp)
                    .size(height = 56.dp, width = 1280.dp)
                    .background(Blue, RoundedCornerShape(16.dp))
                    .clickable { },
            ) {
                Row {
                    Image(
                        painterResource(id = R.drawable.icon_editprofile),
                        contentDescription = null,
                        modifier = Modifier
                            .scale(0.7f)
                    )
                    Text(
                        text = "Edit Profile",
                        fontSize = 18.sp,
                        fontWeight = FontWeight.Normal,
                        color = Color.White,
                        modifier = Modifier
                            .padding(start = 4.dp)
                            .align(Alignment.CenterVertically)
                    )
                }
            }
            Box(
                Modifier
                    .padding(top = 12.dp, start = 24.dp, end = 24.dp)
                    .size(height = 56.dp, width = 1280.dp)
                    .background(Blue, RoundedCornerShape(16.dp))
                    .clickable { },
            ) {
                Row {
                    Image(
                        painterResource(id = R.drawable.icon_bookmark),
                        contentDescription = null,
                        modifier = Modifier
                            .scale(0.7f)
                    )
                    Text(
                        text = "Bookmark",
                        fontSize = 18.sp,
                        fontWeight = FontWeight.Normal,
                        color = Color.White,
                        modifier = Modifier
                            .padding(start = 4.dp)
                            .align(Alignment.CenterVertically)
                    )
                }
            }
            Box(
                Modifier
                    .padding(top = 12.dp, start = 24.dp, end = 24.dp)
                    .size(height = 56.dp, width = 1280.dp)
                    .background(Blue, RoundedCornerShape(16.dp))
                    .clickable { },
            ) {
                Row {
                    Image(
                        painterResource(id = R.drawable.icon_history),
                        contentDescription = null,
                        modifier = Modifier
                            .scale(0.7f)
                    )
                    Text(
                        text = "History",
                        fontSize = 18.sp,
                        fontWeight = FontWeight.Normal,
                        color = Color.White,
                        modifier = Modifier
                            .padding(start = 4.dp)
                            .align(Alignment.CenterVertically)
                    )
                }
            }
            Text(
                text = "Application",
                fontSize = 16.sp,
                fontWeight = FontWeight.SemiBold,
                color = Color.LightGray,
                modifier = Modifier
                    .align(Alignment.Start)
                    .padding(top = 24.dp, start = 24.dp)
            )
            Box(
                Modifier
                    .padding(top = 12.dp, start = 24.dp, end = 24.dp)
                    .size(height = 56.dp, width = 1280.dp)
                    .background(Blue, RoundedCornerShape(16.dp))
                    .clickable { },
            ) {
                Row {
                    Image(
                        painterResource(id = R.drawable.icon_about),
                        contentDescription = null,
                        modifier = Modifier
                            .scale(0.7f)
                    )
                    Text(
                        text = "About",
                        fontSize = 18.sp,
                        fontWeight = FontWeight.Normal,
                        color = Color.White,
                        modifier = Modifier
                            .padding(start = 4.dp)
                            .align(Alignment.CenterVertically)
                    )
                }
            }
            Box(
                Modifier
                    .padding(top = 12.dp, start = 24.dp, end = 24.dp)
                    .size(height = 56.dp, width = 1280.dp)
                    .background(Blue, RoundedCornerShape(16.dp))
                    .clickable { },
            ) {
                Row {
                    Image(
                        painterResource(id = R.drawable.icon_rating),
                        contentDescription = null,
                        modifier = Modifier
                            .scale(0.7f)
                    )
                    Text(
                        text = "Rate this app",
                        fontSize = 18.sp,
                        fontWeight = FontWeight.Normal,
                        color = Color.White,
                        modifier = Modifier
                            .padding(start = 4.dp)
                            .align(Alignment.CenterVertically)
                    )
                }
            }
            Box(
                Modifier
                    .padding(top = 12.dp, start = 24.dp, end = 24.dp)
                    .size(height = 56.dp, width = 1280.dp)
                    .background(Blue, RoundedCornerShape(16.dp))
                    .clickable { },
            ) {
                Row {
                    Image(
                        painterResource(id = R.drawable.icon_kritiksaran),
                        contentDescription = null,
                        modifier = Modifier
                            .scale(0.7f)
                    )
                    Text(
                        text = "Suggestion",
                        fontSize = 18.sp,
                        fontWeight = FontWeight.Normal,
                        color = Color.White,
                        modifier = Modifier
                            .padding(start = 4.dp)
                            .align(Alignment.CenterVertically)
                    )
                }
            }
            Box(
                Modifier
                    .padding(top = 12.dp, start = 24.dp, end = 24.dp)
                    .size(height = 56.dp, width = 1280.dp)
                    .background(Color(0xFFE3E3E3), RoundedCornerShape(16.dp))
                    .border(2.dp, Yellow, RoundedCornerShape(16.dp))
                    .clickable { }
            ) {
                Row {
                    Image(
                        painterResource(id = R.drawable.icon_keluar),
                        contentDescription = null,
                        modifier = Modifier
                            .scale(0.7f)
                    )
                    Text(
                        text = "Logout",
                        fontSize = 18.sp,
                        fontWeight = FontWeight.Normal,
                        color = Color.Red,
                        modifier = Modifier
                            .padding(start = 4.dp)
                            .align(Alignment.CenterVertically)
                    )
                }
            }
        }
    }
}

