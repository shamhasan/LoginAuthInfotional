package com.example.loginauth.threeMainPages.MentorDetail

import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.Button
import androidx.compose.material.RadioButton
import androidx.compose.material.RadioButtonDefaults
import androidx.compose.material.Text
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.ArrowBack
import androidx.compose.material3.ButtonDefaults
import androidx.compose.material3.MaterialTheme
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.scale
import androidx.compose.ui.draw.shadow
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.ColorFilter
import androidx.compose.ui.graphics.DefaultShadowColor
import androidx.compose.ui.modifier.modifierLocalConsumer
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.SpanStyle
import androidx.compose.ui.text.buildAnnotatedString
import androidx.compose.ui.text.font.FontStyle
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.text.withStyle
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.navigation.NavController
import androidx.navigation.NavGraphBuilder
import androidx.navigation.NavHost
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.rememberNavController
import com.example.loginauth.R


@Composable
fun DetailMentor(navController: NavController = rememberNavController()) {
    val biru = 0xFF0069B0
    val kuning = 0xFFFFC529




    Box(
        modifier = Modifier
            .fillMaxSize()
            .background(Color.White)
    ) {
        Image(painter = painterResource(id = R.drawable.bgmentor),
            contentDescription = null,
            modifier = Modifier
                .fillMaxSize())
        Column {
            Box(
                modifier = Modifier
                    .fillMaxWidth()
                    .height(92.dp)
                    .background(Color(0xFF0069B0)),
            ) {
                Row(
                    verticalAlignment = Alignment.CenterVertically,
                    modifier = Modifier
                        .fillMaxWidth()
                        .height(92.dp)
                        .padding(horizontal = 16.dp)
                ) {
                    Image(imageVector = Icons.Filled.ArrowBack,
                        contentDescription = null,
                        modifier = Modifier
                            .clickable { /*todo*/ }
                            .size(22.dp),
                        colorFilter = ColorFilter.tint(Color.White)
                    )

                    Text(
                        text = "Pembayaran",
                        fontSize = 18.sp,
                        textAlign = TextAlign.Center,
                        modifier = Modifier
                            .fillMaxWidth()
                            .padding(end = 22.dp),
                        color = Color.White
                    )
                }
            }
        }

        Column(modifier = Modifier
            .padding(top = 92.dp),
            horizontalAlignment = Alignment.CenterHorizontally
        ){
            Box(modifier = Modifier
                .width(380.dp)
                .height(200.dp)
                .padding(24.dp, 32.dp)
                .background(Color(0xFF0069B0), shape = RoundedCornerShape(10.dp))
                ){
                Box(modifier = Modifier
                    .width(52.dp)
                    .height(20.dp)
                    .background(Color(kuning), shape = RoundedCornerShape(0.dp, 10.dp, 0.dp, 10.dp))
                    .align(Alignment.TopEnd),
                    ){
                    Text(text = "PM",
                        textAlign = TextAlign.Center,
                        modifier = Modifier
                            .align(Alignment.Center),
                        fontWeight = FontWeight.Medium,
                        fontStyle = FontStyle.Italic,
                        color = Color(biru)
                    )
                }
                Row(
                    verticalAlignment = Alignment.CenterVertically,
                    modifier = Modifier
                        .fillMaxSize()
                        .clickable { /*TODO*/ }
                ) {
                    Image(painter = painterResource(id = R.drawable.fotomentor),
                        contentDescription = null,
                        modifier = Modifier
                            .padding(top = 16.dp, bottom = 16.dp, start = 16.dp, end = 16.dp)
                            .size(width = 90.dp, height = 120.dp))

                    Column(
                        verticalArrangement = Arrangement.Top,
                        modifier = Modifier
                            .fillMaxSize()
                            .padding(vertical = 16.dp)
                    ) {
                        Text(text = "Nimah Aqueela",
                            fontSize = 20.sp,
                            color = Color.White,
                            fontWeight = FontWeight.Medium
                        )
                        Spacer(modifier = Modifier
                            .size(2.dp))
                        Text(text = "Doktor Ilmu Komputer",
                            fontStyle = FontStyle.Italic,
                            color = Color.White)
                        Spacer(modifier = Modifier
                            .size(3.dp))

                        Row {
                            Image(painter = painterResource(id = R.drawable.kantor),
                                 contentDescription = null,
                                modifier = Modifier
                                    .size(16.dp))
                            Spacer(modifier = Modifier
                                .size(15.dp))
                            Text(text = "PT. CIMB",
                                fontSize = 12.sp,
                                fontStyle = FontStyle.Italic,
                                color = Color(kuning),
                                fontWeight = FontWeight.Light
                            )
                        }
                        Spacer(modifier = Modifier.size(3.dp))
                        Row {
                            Image(painter = painterResource(id = R.drawable.lamanya),
                                contentDescription = null,
                                modifier = Modifier
                                    .size(16.dp))
                            Spacer(modifier = Modifier
                                .size(15.dp))
                            Text(text = "12 Tahun",
                                fontSize = 12.sp,
                                fontStyle = FontStyle.Italic,
                                color = Color(kuning),
                                fontWeight = FontWeight.Light
                            )
                        }

                    }
                }
            }
            Row(
                horizontalArrangement = Arrangement.Start,
                verticalAlignment = Alignment.CenterVertically,
                modifier = Modifier
                    .padding(horizontal = 40.dp)
                    .fillMaxWidth()
                    .clickable { navController.navigate("MetodeBayar") }

            ) {
                Image(painter = painterResource(id = R.drawable.kartu),
                    contentDescription = null,
                    modifier = Modifier
                        .size(30.dp)
                    )
                Spacer(modifier = Modifier
                    .size(20.dp))
                Text(text = "Metode pembayaran",
                    modifier = Modifier,
                    fontSize = 14.sp,
                    fontWeight = FontWeight.Medium)
                Spacer(modifier = Modifier.size(width = 120.dp, height = 25.dp))
                Text(text = ">",
                    color = Color(biru),
                    modifier = Modifier
                        .padding(horizontal = 5.dp),
                )
            }
            Spacer(modifier = Modifier.size(5.dp))
            Box(modifier = Modifier
                .height(2.dp)
                .background(Color.Gray)
                .padding(horizontal = 16.dp)
                .width(290.dp))
            Spacer(modifier = Modifier.size(20.dp))
            Row(
                horizontalArrangement = Arrangement.Start,
                verticalAlignment = Alignment.CenterVertically,
                modifier = Modifier
                    .padding(horizontal = 40.dp)
                    .fillMaxWidth()
            ) {
                Image(painter = painterResource(id = R.drawable.detail_pembelian),
                    contentDescription = null,
                    modifier = Modifier
                        .size(30.dp)
                    )
                Spacer(modifier =Modifier.size(20.dp))
                Text(text = "Detail pembelian",
                    modifier = Modifier,
                    fontSize = 14.sp,
                    fontWeight = FontWeight.Medium)

            }
                Row(modifier = Modifier
                    .padding(start = 40.dp, end = 40.dp, top = 16.dp)
                    .fillMaxWidth(),
                    horizontalArrangement = Arrangement.SpaceBetween) {
                        Text(text = "Harga",
                            modifier = Modifier,
                            fontSize = 14.sp,
                            fontWeight = FontWeight.Medium)

                    Text(text = "Rp 150.000",
                        modifier = Modifier,
                        fontSize = 14.sp,
                        fontWeight = FontWeight.Normal,
                        color = Color.Gray
                    )
                }
            Row(modifier = Modifier
                .padding(start = 40.dp, end = 40.dp, top = 16.dp)
                .fillMaxWidth(),
                horizontalArrangement = Arrangement.SpaceBetween) {
                Text(text = "Diskon",
                    modifier = Modifier,
                    fontSize = 14.sp,
                    fontWeight = FontWeight.Medium)

                Text(text = "-Rp 105.000",
                    modifier = Modifier,
                    fontSize = 14.sp,
                    fontWeight = FontWeight.Normal,
                    color = Color.Gray
                )
            }
            Row(modifier = Modifier
                .padding(start = 40.dp, end = 40.dp, top = 16.dp)
                .fillMaxWidth(),
                horizontalArrangement = Arrangement.SpaceBetween) {
                Text(text = "Biaya layanan",
                    modifier = Modifier,
                    fontSize = 14.sp,
                    fontWeight = FontWeight.Medium)

                Text(text = "Rp 1.000",
                    modifier = Modifier,
                    fontSize = 14.sp,
                    fontWeight = FontWeight.Normal,
                    color = Color.Gray
                )

            }
        }
        Box(modifier = Modifier
            .height(118.dp)
            .fillMaxWidth()
            .background(Color(biru))
            .align(Alignment.BottomCenter)
        ){
            Column {
                Row(
                    modifier = Modifier
                        .padding(start = 24.dp, end = 24.dp, top = 16.dp, bottom = 8.dp)
                        .fillMaxWidth(),
                    horizontalArrangement = Arrangement.SpaceBetween

                ) {
                    Text(
                        text = "Total Pembayaran",
                        modifier = Modifier,
                        fontSize = 18.sp,
                        fontWeight = FontWeight.Medium,
                        color = Color.White
                    )
                    Text(
                        text = "Rp 46.000",
                        modifier = Modifier,
                        fontSize = 18.sp,
                        fontWeight = FontWeight.Medium,
                        color = Color.White
                    )
                }
                androidx.compose.material3.Button(
                    onClick = { /*TODO*/ },
                    modifier = Modifier
                        .fillMaxWidth()
                        .padding(horizontal = 24.dp),
                    colors = ButtonDefaults.buttonColors(Color(kuning))
                ) {
                    androidx.compose.material3.Text(
                        text = "Bayar",
                        fontSize = 16.sp
                    )
                }
            }
        }

    }
    
}

@Composable
fun MetodePembayaran(navController: NavController = rememberNavController()) {
    val biru = 0xFF0069B0
    val kuning = 0xFFFFC529
    val radioOptions = listOf("qris","gopay","dana","ovo","spay")
    var selectedOption by remember { mutableStateOf(radioOptions[0]) }

    Box(
        modifier = Modifier
            .fillMaxSize()
            .background(Color.White)
    ) {
        Image(
            painter = painterResource(id = R.drawable.bgmentor),
            contentDescription = null,
            modifier = Modifier
                .fillMaxSize()
        )

        Box(
            modifier = Modifier
                .fillMaxWidth()
                .height(92.dp)
                .background(Color(0xFF0069B0)),
        ) {
            Row(
                verticalAlignment = Alignment.CenterVertically,
                modifier = Modifier
                    .fillMaxWidth()
                    .height(92.dp)
                    .padding(horizontal = 16.dp)
            ) {
                Image(imageVector = Icons.Filled.ArrowBack,
                    contentDescription = null,
                    modifier = Modifier
                        .clickable { /*todo*/ }
                        .size(22.dp),
                    colorFilter = ColorFilter.tint(Color.White)
                )

                Text(
                    text = "Pembayaran",
                    fontSize = 18.sp,
                    textAlign = TextAlign.Center,
                    modifier = Modifier
                        .fillMaxWidth()
                        .padding(end = 22.dp),
                    color = Color.White
                )
            }

        }
        Column(modifier = Modifier
            .padding(top = 92.dp)
            .fillMaxWidth()) {
            Text(text = "Total Pembayaran",
                modifier = Modifier.padding(start = 24.dp, end = 24.dp, top = 18.dp, bottom = 8.dp),
                fontSize = 18.sp,
                fontWeight = FontWeight.SemiBold)
            Text(text = "Rp 46.000",
                modifier = Modifier.padding(horizontal = 24.dp),
                fontSize = 24.sp,
                fontWeight = FontWeight.SemiBold,
                color = Color(biru)
            )
                Row(
                    modifier = Modifier
                        .padding(horizontal = 24.dp, vertical = 8.dp)
                        .fillMaxWidth()
                        .background(Color.White)
                        .shadow(elevation = 1.dp, ambientColor = Color.Black),
                    horizontalArrangement = Arrangement.SpaceBetween,
                    verticalAlignment = Alignment.CenterVertically
                ) {
                    Column {
                        Text(
                            text = "Kartu Debit/Kredit",
                            modifier = Modifier.padding(horizontal = 20.dp, vertical = 8.dp),
                            fontSize = 16.sp,
                            fontWeight = FontWeight.SemiBold,
                            color = Color(biru)
                        )
                        Row(
                            modifier = Modifier
                                .padding(start = 20.dp, bottom = 8.dp),
                            verticalAlignment = Alignment.CenterVertically
                        ) {
                            Image(
                                painter = painterResource(id = R.drawable.visa),
                                contentDescription = null,
                                modifier = Modifier
                                    .height(12.dp)
                                    .padding(end = 5.dp)
                            )
                            Image(
                                painter = painterResource(id = R.drawable.mastercard),
                                contentDescription = null,
                                modifier = Modifier
                                    .height(14.dp)
                                    .padding(end = 5.dp)
                            )
                            Image(
                                painter = painterResource(id = R.drawable.jcb),
                                contentDescription = null,
                                modifier = Modifier.height(15.dp)
                            )
                        }
                    }
                    Text(
                        text = "v",
                        modifier = Modifier.padding(end = 24.dp),
                        fontWeight = FontWeight.Medium,
                        color = Color(biru),
                        fontSize = 18.sp
                    )
                }


            Row(modifier = Modifier
                .padding(horizontal = 24.dp, vertical = 8.dp)
                .fillMaxWidth()
                .background(Color.White)
                .shadow(1.dp, spotColor = Color.Black),
                horizontalArrangement = Arrangement.SpaceBetween,
                verticalAlignment = Alignment.CenterVertically
            ){
                Column {
                    Text(
                        text = "ATM/Bank Transfer",
                        modifier = Modifier.padding(horizontal = 20.dp, vertical = 8.dp),
                        fontSize = 16.sp,
                        fontWeight = FontWeight.SemiBold,
                        color = Color(biru)
                    )
                    Row(
                        modifier = Modifier
                            .padding(start = 20.dp, bottom = 8.dp),
                        verticalAlignment = Alignment.CenterVertically
                    ) {
                        Image(painter = painterResource(id = R.drawable.bca),
                            contentDescription = null,
                            modifier = Modifier
                                .height(12.dp)
                                .padding(end = 5.dp))
                        Image(painter = painterResource(id = R.drawable.bni),
                            contentDescription = null,
                            modifier = Modifier
                                .height(12.dp)
                                .padding(end = 5.dp))
                        Image(painter = painterResource(id = R.drawable.bri),
                            contentDescription = null,
                            modifier = Modifier
                                .height(12.dp)
                                .padding(end = 5.dp))
                        Image(painter = painterResource(id = R.drawable.mandiri),
                            contentDescription = null,
                            modifier = Modifier
                                .height(13.dp)
                                .padding(end = 5.dp))
                        Image(painter = painterResource(id = R.drawable.permata),
                            contentDescription = null,
                            modifier = Modifier
                                .height(15.dp)
                                .padding(end = 5.dp))

                    }
                }
                Text(text = "v",
                    modifier = Modifier.padding(end = 24.dp),
                    fontWeight = FontWeight.Medium,
                    color = Color(biru),
                    fontSize = 18.sp
                )
            }

            Row(modifier = Modifier
                .padding(horizontal = 24.dp, vertical = 8.dp)
                .fillMaxWidth()
                .background(Color.White)
                .shadow(1.dp, spotColor = Color.Black),
                horizontalArrangement = Arrangement.SpaceBetween,
                verticalAlignment = Alignment.CenterVertically
            ){
                Column() {
                    Text(
                        text = "E-Money",
                        modifier = Modifier.padding(horizontal = 20.dp, vertical = 16.dp),
                        fontSize = 16.sp,
                        fontWeight = FontWeight.SemiBold,
                        color = Color(biru)
                    )
                    Box(modifier = Modifier
                        .height(1.dp)
                        .fillMaxWidth()
                        .background(Color.Gray)
                    )
                    Column() {
                        Row {
                            Box(
                                modifier = Modifier
                                    .height(180.dp)
                                    .width(50.dp)
                            )
                            Box(modifier = Modifier
                                .width(250.dp)
                                .height(170.dp)
                                .background(Color.White)) {
                                Column {
                                    Row(
                                        modifier = Modifier
                                            .padding(8.dp)
                                            .width(90.dp),
                                        verticalAlignment = Alignment.CenterVertically,
                                        horizontalArrangement = Arrangement.SpaceBetween
                                    ) {
                                        Image(
                                            painter = painterResource(id = R.drawable.qris),
                                            contentDescription = null,
                                            modifier = Modifier
                                                .height(11.dp)
                                        )
                                        Text(text = "QRIS")

                                    }
                                    Box(
                                        modifier = Modifier
                                            .height(1.dp)
                                            .fillMaxWidth()
                                            .background(Color.Gray)
                                    )
                                    Row(
                                        modifier = Modifier
                                            .padding(8.dp)
                                            .width(100.dp),
                                        verticalAlignment = Alignment.CenterVertically,
                                        horizontalArrangement = Arrangement.SpaceBetween
                                    ) {
                                        Image(
                                            painter = painterResource(id = R.drawable.gopay),
                                            contentDescription = null,
                                            modifier = Modifier
                                                .height(11.dp)
                                        )
                                        Text(text = "Gopay")
                                    }
                                    Box(
                                        modifier = Modifier
                                            .height(1.dp)
                                            .fillMaxWidth()
                                            .background(Color.Gray)
                                    )
                                    Row(
                                        modifier = Modifier
                                            .padding(8.dp)
                                            .width(93.dp),
                                        verticalAlignment = Alignment.CenterVertically,
                                        horizontalArrangement = Arrangement.SpaceBetween
                                    ) {
                                        Image(
                                            painter = painterResource(id = R.drawable.dana),
                                            contentDescription = null,
                                            modifier = Modifier
                                                .height(11.dp)
                                        )
                                        Text(text = "Dana")
                                    }
                                    Box(
                                        modifier = Modifier
                                            .height(1.dp)
                                            .fillMaxWidth()
                                            .background(Color.Gray)
                                    )
                                    Row(
                                        modifier = Modifier
                                            .padding(8.dp)
                                            .width(90.dp),
                                        verticalAlignment = Alignment.CenterVertically,
                                        horizontalArrangement = Arrangement.SpaceBetween
                                    ) {
                                        Image(
                                            painter = painterResource(id = R.drawable.ovo),
                                            contentDescription = null,
                                            modifier = Modifier
                                                .height(11.dp)
                                        )
                                        Text(text = "OVO")
                                    }
                                    Box(
                                        modifier = Modifier
                                            .height(1.dp)
                                            .fillMaxWidth()
                                            .background(Color.Gray)
                                    )
                                    Row(
                                        modifier = Modifier
                                            .padding(8.dp)
                                            .width(120.dp),
                                        verticalAlignment = Alignment.CenterVertically,
                                        horizontalArrangement = Arrangement.SpaceBetween
                                    ) {
                                        Image(
                                            painter = painterResource(id = R.drawable.spay),
                                            contentDescription = null,
                                            modifier = Modifier
                                                .height(16.dp)
                                        )
                                        Text(text = "ShoppePay")
                                    }
                                }
                            }
                            Column(
                            ) {
                                radioOptions.forEach { option ->
                                    Row(
                                        Modifier.fillMaxWidth(),
                                        verticalAlignment = Alignment.CenterVertically,
                                        horizontalArrangement = Arrangement.Center
                                    ) {
                                        RadioButton(
                                            modifier = Modifier
                                                .height(33.dp)
                                                .scale(0.7f),
                                            selected = (option == selectedOption),
                                            onClick = { selectedOption = option },
                                            colors = RadioButtonDefaults.colors(
                                                selectedColor = Color(biru),
                                                unselectedColor = Color.Gray
                                            ),
                                        )
                                        Spacer(modifier = Modifier.size(5.dp))
                                        Box(modifier = Modifier
                                            .height(10.dp)
                                            .fillMaxWidth()
                                            .background(Color.Black))
                                    }
                                }
                            }



                        }


                    }

                }

            }

        }

        Box(
            modifier = Modifier
                .height(118.dp)
                .fillMaxWidth()
                .background(Color(biru))
                .align(Alignment.BottomCenter)
        ) {
            Column {
                Row(
                    modifier = Modifier
                        .padding(start = 24.dp, end = 24.dp, top = 16.dp, bottom = 8.dp)
                        .fillMaxWidth(),
                    horizontalArrangement = Arrangement.SpaceBetween

                ) {
                    Text(
                        text = "Total Pembayaran",
                        modifier = Modifier,
                        fontSize = 18.sp,
                        fontWeight = FontWeight.Medium,
                        color = Color.White
                    )
                    Text(
                        text = "Rp 46.000",
                        modifier = Modifier,
                        fontSize = 18.sp,
                        fontWeight = FontWeight.Medium,
                        color = Color.White
                    )
                }
                androidx.compose.material3.Button(
                    onClick = { navController.navigate("DetailMentor") },
                    modifier = Modifier
                        .fillMaxWidth()
                        .padding(horizontal = 24.dp),
                    colors = ButtonDefaults.buttonColors(Color(kuning))
                ) {
                    androidx.compose.material3.Text(
                        text = "Oke",
                        fontSize = 16.sp
                    )
                }
            }
        }
    }
}



