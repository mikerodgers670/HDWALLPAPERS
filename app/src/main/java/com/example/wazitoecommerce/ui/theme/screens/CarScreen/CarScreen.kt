package com.example.wazitoecommerce.ui.theme.screens.CarScreen

import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.width
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.navigation.NavHostController
import androidx.navigation.compose.rememberNavController
import com.example.wazitoecommerce.R

@Composable
fun GoPremiumScreen(navController: NavHostController) {

    Column(modifier = Modifier.fillMaxSize()) {
        Text(
            text = "HD WallPaper",
            fontSize = 25.sp,
            fontWeight = FontWeight.ExtraBold
        )
        Text(
            text = "Do you love cars? Get these premium Wallpapers.Make your phone screen attractive",
            fontSize = 25.sp,
            fontWeight = FontWeight.ExtraBold
        )
        Spacer(modifier = Modifier.height(30.dp))
        Row {
           Image(painter = painterResource(id = R.drawable.car100), contentDescription = "Download")
            Spacer(modifier = Modifier.width(35.dp))
            Image(painter = painterResource(id = R.drawable.bmw25), contentDescription = "Download")
        }
        Spacer(modifier = Modifier.height(20.dp))
        Row {
            Image(painter = painterResource(id = R.drawable.car21), contentDescription = "Download")
            Spacer(modifier = Modifier.width(35.dp))
            Image(painter = painterResource(id = R.drawable.car7), contentDescription = "Download")
        }
        Spacer(modifier = Modifier.height(20.dp))
        Row {
            Image(painter = painterResource(id = R.drawable.car1), contentDescription = "Download")
            Spacer(modifier = Modifier.width(35.dp))
            Image(painter = painterResource(id = R.drawable.car3), contentDescription = "Download")
        }
        Spacer(modifier = Modifier.height(20.dp))
        Row {
            Image(painter = painterResource(id = R.drawable.car4), contentDescription = "Download")
            Spacer(modifier = Modifier.width(35.dp))
            Image(painter = painterResource(id = R.drawable.car5), contentDescription = "Download")
        }
        Spacer(modifier = Modifier.height(20.dp))
        Row {
            Image(painter = painterResource(id = R.drawable.car8), contentDescription = "Download")
            Spacer(modifier = Modifier.width(35.dp))
            Image(painter = painterResource(id = R.drawable.animal20), contentDescription = "Download")
        }
        Spacer(modifier = Modifier.height(20.dp))
        Row {
            Image(painter = painterResource(id = R.drawable.animal20), contentDescription = "Download")
            Spacer(modifier = Modifier.width(35.dp))
            Image(painter = painterResource(id = R.drawable.animal20), contentDescription = "Download")
        }
        Spacer(modifier = Modifier.height(20.dp))
        Row {
            Image(painter = painterResource(id = R.drawable.animal20), contentDescription = "Download")
            Spacer(modifier = Modifier.width(35.dp))
            Image(painter = painterResource(id = R.drawable.animal20), contentDescription = "Download")
        }
        Spacer(modifier = Modifier.height(20.dp))
        Row {
            Image(painter = painterResource(id = R.drawable.animal20), contentDescription = "Download")
            Spacer(modifier = Modifier.width(35.dp))
            Image(painter = painterResource(id = R.drawable.animal20), contentDescription = "Download")
        }
        Spacer(modifier = Modifier.height(20.dp))
        Row {
            Image(painter = painterResource(id = R.drawable.animal20), contentDescription = "Download")
            Spacer(modifier = Modifier.width(35.dp))
            Image(painter = painterResource(id = R.drawable.animal20), contentDescription = "Download")
        }
        Spacer(modifier = Modifier.height(20.dp))
        Row {
            Image(painter = painterResource(id = R.drawable.animal20), contentDescription = "Download")
            Spacer(modifier = Modifier.width(35.dp))
            Image(painter = painterResource(id = R.drawable.animal20), contentDescription = "Download")
        }
        Spacer(modifier = Modifier.height(20.dp))
        Row {
            Image(painter = painterResource(id = R.drawable.animal20), contentDescription = "Download")
            Spacer(modifier = Modifier.width(35.dp))
            Image(painter = painterResource(id = R.drawable.animal20), contentDescription = "Download")
        }
        Spacer(modifier = Modifier.height(20.dp))
        Row {
            Image(painter = painterResource(id = R.drawable.animal20), contentDescription = "Download")
            Spacer(modifier = Modifier.width(35.dp))
            Image(painter = painterResource(id = R.drawable.animal20), contentDescription = "Download")
        }
        Spacer(modifier = Modifier.height(20.dp))
        Row {
            Image(painter = painterResource(id = R.drawable.animal20), contentDescription = "Download")
            Spacer(modifier = Modifier.width(35.dp))
            Image(painter = painterResource(id = R.drawable.animal20), contentDescription = "Download")
        }



    }
}
@Preview
@Composable
fun GoPremiumScreenPreview(){
    GoPremiumScreen(rememberNavController())
}
