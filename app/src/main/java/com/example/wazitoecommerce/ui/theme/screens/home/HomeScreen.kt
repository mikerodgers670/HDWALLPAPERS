package com.example.wazitoecommerce.ui.theme.screens.home

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.height
import androidx.compose.material3.Button
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.paint
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.sp
import androidx.compose.ui.unit.dp
import androidx.navigation.NavHostController
import androidx.navigation.compose.rememberNavController
import com.example.wazitoecommerce.R
import com.example.wazitoecommerce.navigation.ANIMAL_WALLPAPER_URL
import com.example.wazitoecommerce.navigation.CAR_SCREEN_URL
import com.example.wazitoecommerce.navigation.GO_PREMIUM_URL
import com.example.wazitoecommerce.navigation.LIVE_WALLPAPERS_URL
import com.example.wazitoecommerce.navigation.NATURE_WALLPAPERS_URL

@Composable
fun HomeScreen(navController: NavHostController){
    Text(
        text = "HD WallPaper",
        fontSize = 135.sp,
        fontWeight = FontWeight.ExtraBold,
        color = Color.White
    )
    Spacer(modifier = Modifier.height(200.dp))

    Column (
        modifier = Modifier
            .paint(painterResource(id = R.drawable.premium5), contentScale = ContentScale.FillBounds)

            .fillMaxSize(),

        horizontalAlignment = Alignment.CenterHorizontally
    ){

        Spacer(modifier = Modifier.height(70.dp))

        Button(onClick = {
            navController.navigate(LIVE_WALLPAPERS_URL)

        }) {
            Text(text = "Live WALLPAPERS")
        }
        Spacer(modifier = Modifier.height(70.dp))

        Button(onClick = {
            navController.navigate(NATURE_WALLPAPERS_URL)
        }) {
            Text(text = "NATURE WALLPAPERS")
        }
        Spacer(modifier = Modifier.height(70.dp))
        Button(onClick = {
            navController.navigate(ANIMAL_WALLPAPER_URL)
        }) {
            Text(text = "ANIMAL WALLPAPERS")
        }
        Spacer(modifier = Modifier.height(70.dp))
        Button(onClick = {
            navController.navigate(GO_PREMIUM_URL)
        }) {
            Text(text = "GO PREMIUM")
        }
        Spacer(modifier = Modifier.height(70.dp))
        Button(onClick = {
            navController.navigate(CAR_SCREEN_URL)
        }) {
            Text(text = "CAR WALLPAPERS")
        }
    }
}

@Preview
@Composable
fun HomeScreenScreenPreview(){
    HomeScreen(rememberNavController())
}

