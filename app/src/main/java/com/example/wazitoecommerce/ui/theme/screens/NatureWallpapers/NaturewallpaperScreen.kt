package com.example.wazitoecommerce.ui.theme.screens.NatureWallpapers

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
import androidx.compose.ui.text.font.FontFamily
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.navigation.NavHostController
import androidx.navigation.compose.rememberNavController
import com.example.wazitoecommerce.R




@Composable
fun     NatureWallPaperScreen(navController: NavHostController) {

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
            Image(painter = painterResource(id = R.drawable.dask11), contentDescription = "Download")
            Spacer(modifier = Modifier.width(35.dp))
            Image(painter = painterResource(id = R.drawable.dask30), contentDescription = "Download")
        }
        Spacer(modifier = Modifier.height(20.dp))
        Row {
            Image(painter = painterResource(id = R.drawable.desk), contentDescription = "Download")
            Spacer(modifier = Modifier.width(35.dp))
            Image(painter = painterResource(id = R.drawable.desk2), contentDescription = "Download")
        }
        Spacer(modifier = Modifier.height(20.dp))
        Row {
            Image(painter = painterResource(id = R.drawable.desk3), contentDescription = "Download")
            Spacer(modifier = Modifier.width(35.dp))
            Image(painter = painterResource(id = R.drawable.desk6), contentDescription = "Download")
        }
        Spacer(modifier = Modifier.height(20.dp))
        Row {
            Image(painter = painterResource(id = R.drawable.desk7), contentDescription = "Download")
            Spacer(modifier = Modifier.width(35.dp))
            Image(painter = painterResource(id = R.drawable.desk9), contentDescription = "Download")
        }
        Spacer(modifier = Modifier.height(20.dp))
        Row {
            Image(painter = painterResource(id = R.drawable.desk10), contentDescription = "Download")
            Spacer(modifier = Modifier.width(35.dp))
            Image(painter = painterResource(id = R.drawable.desk12), contentDescription = "Download")
        }
        Spacer(modifier = Modifier.height(20.dp))
        Row {
            Image(painter = painterResource(id = R.drawable.desk13), contentDescription = "Download")
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
fun NatureWallPaperScreenPreview() {
    NatureWallPaperScreen(rememberNavController())
}


