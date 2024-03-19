@file:OptIn(ExperimentalMaterial3Api::class)

package com.example.LoginAuth.threeMainPages

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.Scaffold
import androidx.compose.material3.SearchBar
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.saveable.rememberSaveable
import androidx.compose.runtime.setValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.navigation.NavController
import com.example.loginauth.BottomNavigationBar
import com.example.loginauth.ui.theme.Blue


@Composable
fun CariMentor(
    navController: NavController
) {
    Scaffold (
        bottomBar = { BottomNavigationBar(navController = navController, 1) }
    ){
        Box(
            modifier = Modifier
                .fillMaxSize()
                .background(color = Color.White)
                .padding(it)
        ) {
//        Column(
//            modifier = Modifier
//                .fillMaxSize()
//                .align(Alignment.Center),
//            verticalArrangement = Arrangement.Center,
//            horizontalAlignment = Alignment.CenterHorizontally
//        ) {
//            Text(
//                text = "Cari Mentor",
//                fontWeight = FontWeight.ExtraBold,
//                fontSize = 50.sp,
//                color = Color.Black
//            )
//        }
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

            }
            Box(
                Modifier
                    .height(48.dp)
                    .fillMaxWidth()
                    .background(Color.Gray)
            ) {
                Column(
                    Modifier
                        .align(Alignment.Center),
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
                        onActiveChange = {active = it}

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

            }
        }
    }

}




