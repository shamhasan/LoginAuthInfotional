@file:OptIn(ExperimentalMaterial3Api::class)

package com.example.loginauth.fitur

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Search
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.Icon
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
import com.example.loginauth.ui.theme.Blue
import com.example.loginauth.ui.theme.LilDarkBlue

@Preview
@Composable
fun Beasiswa() {


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
                    text = "Beasiswa",
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
                    leadingIcon = { Icon(Icons.Default.Search, contentDescription = null, tint = Color.LightGray)},
                    modifier = Modifier
                        .height(36.dp)
                        .padding(top = 3.dp, start = 28.dp, end = 28.dp)
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

        }
    }
}