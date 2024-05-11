package com.example.wazitoecommerce.ui.theme.screens.home


import android.annotation.SuppressLint
import androidx.compose.foundation.BorderStroke
import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxHeight
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.rememberScrollState
import androidx.compose.foundation.shape.CutCornerShape
import androidx.compose.foundation.verticalScroll
import androidx.compose.material.icons.Icons

import androidx.compose.ui.res.painterResource

import androidx.compose.material.icons.filled.Add
import androidx.compose.material.icons.filled.Build
import androidx.compose.material.icons.filled.DateRange
import androidx.compose.material.icons.filled.Face
import androidx.compose.material.icons.filled.Home
import androidx.compose.material.icons.filled.Info
import androidx.compose.material.icons.filled.Person
import androidx.compose.material.icons.outlined.Build
import androidx.compose.material.icons.outlined.DateRange
import androidx.compose.material.icons.outlined.Face
import androidx.compose.material.icons.outlined.Home
import androidx.compose.material.icons.outlined.Info
import androidx.compose.material.icons.outlined.Person
import androidx.compose.material3.Badge
import androidx.compose.material3.BadgedBox
import androidx.compose.material3.Card
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.FloatingActionButton
import androidx.compose.material3.Icon
import androidx.compose.material3.IconButton
import androidx.compose.material3.Scaffold
import androidx.compose.material3.NavigationBar
import androidx.compose.material3.NavigationBarItem
import androidx.compose.material3.Text
import androidx.compose.material3.TopAppBar
import androidx.compose.material3.TopAppBarDefaults
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableIntStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.paint
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.navigation.NavHostController
import androidx.navigation.compose.rememberNavController
import com.example.wazitoecommerce.R
import com.example.wazitoecommerce.navigation.ADD_PRODUCTS_URL
import com.example.wazitoecommerce.ui.theme.WazitoECommerceTheme
import com.example.wazitoecommerce.ui.theme.lBLUE

@SuppressLint("UnusedMaterial3ScaffoldPaddingParameter")
@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun HomeScreen(navController:NavHostController){
    Column(
        modifier = Modifier.fillMaxSize(),
        horizontalAlignment = Alignment.CenterHorizontally
    ) {

        var selected by remember { mutableIntStateOf(0) }
        Scaffold(
            bottomBar = {
                NavigationBar {
                    bottomNavItems.forEachIndexed { index, bottomNavItem ->
                        NavigationBarItem(
                            selected = index == selected,
                            onClick = {
                                selected = index
                                navController.navigate(bottomNavItem.route)
                            },
                            icon = {
                                BadgedBox(
                                    badge = {
                                        if (bottomNavItem.badges != 0) {
                                            Badge {
                                                Text(text = bottomNavItem.badges.toString())
                                            }
                                        } else if (bottomNavItem.hasNews) {
                                            Badge()
                                        }
                                    }
                                ) {
                                    Icon(imageVector =
                                    if (index == selected)
                                        bottomNavItem.selectedIcon
                                    else
                                        bottomNavItem.unselectedIcon,
                                        contentDescription = bottomNavItem.title)
                                }

                            },
                            label = {
                                Text(text = bottomNavItem.title)
                            })
                    }
                }
            },


            floatingActionButton = {
                FloatingActionButton(onClick = { /*TODO*/ }) {
                    IconButton(onClick = {
                        navController.navigate(ADD_PRODUCTS_URL)
                    }) {
                        Icon(imageVector = Icons.Default.Add,
                            contentDescription = "menu")
                    }
                }
            },
            topBar = {
     TopAppBar(title = { Text(text = "HOME")},
         colors = TopAppBarDefaults.mediumTopAppBarColors(lBLUE),
         navigationIcon = {
             IconButton(onClick = {
                 navController.navigate(ADD_PRODUCTS_URL)
             }) {
                 Icon(imageVector = Icons.Default.Add,
                     contentDescription = "menu")
             }
         })
            },
            //Content Section
            content = @Composable {
                Column(
                    modifier = Modifier.fillMaxSize(),
                    verticalArrangement = Arrangement.Center,
                    horizontalAlignment = Alignment.CenterHorizontally
                ) {


                    Column(modifier = Modifier.verticalScroll(rememberScrollState())) {
                        //Row1
                        Row(modifier = Modifier.padding(start = 5.dp)) {

                            //Card1
                            Card() {

                                Column() {
                                    Box(
                                        modifier = Modifier
                                            .height(150.dp)
                                            .width(180.dp),
                                        contentAlignment = Alignment.Center

                                    ) {
                                        Image(
                                            painter = painterResource(id = R.drawable.desk12),
                                            contentDescription = "",
                                            contentScale = ContentScale.Crop,
                                            modifier = Modifier
                                                .fillMaxHeight()
                                                .fillMaxWidth()
                                                .size(400.dp)
                                                .clickable {

                                                }
                                        )

                                    }
                                    Text(
                                        text = "R.jordan",
                                        textAlign = TextAlign.Center,
                                        fontSize = 30.sp,
                                        fontWeight = FontWeight.Bold,
                                        color = Color.Black
                                    )

                                }

                            }
                            Spacer(modifier = Modifier.width(10.dp))
                            //Card2
                            Card() {
                                Column() {
                                    Box(
                                        modifier = Modifier
                                            .height(150.dp)
                                            .width(180.dp),
                                        contentAlignment = Alignment.Center
                                    ) {
                                        Image(
                                            painter = painterResource(id = R.drawable.animal10),
                                            contentDescription = "",
                                            contentScale = ContentScale.Crop,
                                            modifier = Modifier
                                                .fillMaxHeight()
                                                .fillMaxWidth()
                                                .size(400.dp)
                                                .clickable {

                                                }
                                        )

                                    }
                                    Text(
                                        text = "butterfly",
                                        textAlign = TextAlign.Center,
                                        fontSize = 30.sp,
                                        fontWeight = FontWeight.Bold,
                                        color = Color.Black
                                    )

                                }

                            }

                        }
                        Spacer(modifier = Modifier.height(10.dp))


                        //Row2
                        Row(modifier = Modifier.padding(start = 5.dp)) {

                            //Card1
                            Card() {
                                Column() {
                                    Box(
                                        modifier = Modifier
                                            .height(150.dp)
                                            .width(180.dp),
                                        contentAlignment = Alignment.Center
                                    ) {
                                        Image(
                                            painter = painterResource(id = R.drawable.car8),
                                            contentDescription = "",
                                            contentScale = ContentScale.Crop,
                                            modifier = Modifier
                                                .fillMaxHeight()
                                                .fillMaxWidth()
                                                .size(400.dp)
                                                .clickable {

                                                }
                                        )

                                    }
                                    Text(
                                        text = "BMW",
                                        textAlign = TextAlign.Center,
                                        fontSize = 30.sp,
                                        fontWeight = FontWeight.Bold,
                                        color = Color.Black
                                    )

                                }

                            }
                            Spacer(modifier = Modifier.width(10.dp))
                            //Card2
                            Card() {
                                Column() {
                                    Box(
                                        modifier = Modifier
                                            .height(150.dp)
                                            .width(180.dp),
                                        contentAlignment = Alignment.Center
                                    ) {
                                        Image(
                                            painter = painterResource(id = R.drawable.dog3),
                                            contentDescription = "",
                                            contentScale = ContentScale.Crop,
                                            modifier = Modifier
                                                .fillMaxHeight()
                                                .fillMaxWidth()
                                                .size(400.dp)
                                                .clickable {

                                                }
                                        )

                                    }
                                    Text(
                                        text = "CHIWAWA",
                                        textAlign = TextAlign.Center,
                                        fontSize = 30.sp,
                                        fontWeight = FontWeight.Bold,
                                        color = Color.Black
                                    )

                                }

                            }

                        }
                        Spacer(modifier = Modifier.height(10.dp))


                        //Row3
                        Row(modifier = Modifier.padding(start = 5.dp)) {

                            //Card1
                            Card() {
                                Column() {
                                    Box(
                                        modifier = Modifier
                                            .height(150.dp)
                                            .width(180.dp),
                                        contentAlignment = Alignment.Center
                                    ) {
                                        Image(
                                            painter = painterResource(id = R.drawable.dask30),
                                            contentDescription = "",
                                            contentScale = ContentScale.Crop,
                                            modifier = Modifier
                                                .fillMaxHeight()
                                                .fillMaxWidth()
                                                .size(400.dp)
                                                .clickable {

                                                }
                                        )

                                    }
                                    Text(
                                        text = "VOLCANO",
                                        textAlign = TextAlign.Center,
                                        fontSize = 30.sp,
                                        fontWeight = FontWeight.Bold,
                                        color = Color.Black
                                    )

                                }

                            }
                            Spacer(modifier = Modifier.width(10.dp))
                            //Card2
                            Card() {
                                Column() {
                                    Box(
                                        modifier = Modifier
                                            .height(150.dp)
                                            .width(180.dp),
                                        contentAlignment = Alignment.Center
                                    ) {
                                        Image(
                                            painter = painterResource(id = R.drawable.animal66),
                                            contentDescription = "",
                                            contentScale = ContentScale.Crop,
                                            modifier = Modifier
                                                .fillMaxHeight()
                                                .fillMaxWidth()
                                                .size(400.dp)
                                                .clickable {

                                                }
                                        )

                                    }
                                    Text(
                                        text = "ELEPHANT",
                                        textAlign = TextAlign.Center,
                                        fontSize = 30.sp,
                                        fontWeight = FontWeight.Bold,
                                        color = Color.Black
                                    )

                                }

                            }

                        }
                        Spacer(modifier = Modifier.height(10.dp))


                        //Row4
                        Row(modifier = Modifier.padding(start = 5.dp)) {

                            //Card1
                            Card() {
                                Column() {
                                    Box(
                                        modifier = Modifier
                                            .height(150.dp)
                                            .width(180.dp),
                                        contentAlignment = Alignment.Center
                                    ) {
                                        Image(
                                            painter = painterResource(id = R.drawable.animal5),
                                            contentDescription = "",
                                            contentScale = ContentScale.Crop,
                                            modifier = Modifier
                                                .fillMaxHeight()
                                                .fillMaxWidth()
                                                .size(400.dp)
                                                .clickable {

                                                }
                                        )

                                    }
                                    Text(
                                        text = "TIGER",
                                        textAlign = TextAlign.Center,
                                        fontSize = 30.sp,
                                        fontWeight = FontWeight.Bold,
                                        color = Color.Black
                                    )

                                }

                            }
                            Spacer(modifier = Modifier.width(10.dp))
                            //Card2
                            Card() {
                                Column() {
                                    Box(
                                        modifier = Modifier
                                            .height(150.dp)
                                            .width(180.dp),
                                        contentAlignment = Alignment.Center
                                    ) {
                                        Image(
                                            painter = painterResource(id = R.drawable.car100),
                                            contentDescription = "",
                                            contentScale = ContentScale.Crop,
                                            modifier = Modifier
                                                .fillMaxHeight()
                                                .fillMaxWidth()
                                                .size(400.dp)
                                                .clickable {

                                                }
                                        )

                                    }
                                    Text(
                                        text = "DRIFT",
                                        textAlign = TextAlign.Center,
                                        fontSize = 30.sp,
                                        fontWeight = FontWeight.Bold,
                                        color = Color.Black
                                    )

                                }

                            }

                        }
                        Spacer(modifier = Modifier.height(10.dp))


                        //Row5
                        Row(modifier = Modifier.padding(start = 5.dp)) {

                            //Card1
                            Card() {
                                Column() {
                                    Box(
                                        modifier = Modifier
                                            .height(150.dp)
                                            .width(180.dp),
                                        contentAlignment = Alignment.Center
                                    ) {
                                        Image(
                                            painter = painterResource(id = R.drawable.animal9),
                                            contentDescription = "",
                                            contentScale = ContentScale.Crop,
                                            modifier = Modifier
                                                .fillMaxHeight()
                                                .fillMaxWidth()
                                                .size(400.dp)
                                                .clickable {

                                                }
                                        )

                                    }
                                    Text(
                                        text = "HUMMING BIRD",
                                        textAlign = TextAlign.Center,
                                        fontSize = 30.sp,
                                        fontWeight = FontWeight.Bold,
                                        color = Color.Black
                                    )

                                }

                            }
                            Spacer(modifier = Modifier.width(10.dp))
                            //Card2
                            Card() {
                                Column() {
                                    Box(
                                        modifier = Modifier
                                            .height(150.dp)
                                            .width(180.dp),
                                        contentAlignment = Alignment.Center
                                    ) {
                                        Image(
                                            painter = painterResource(id = R.drawable.animal2),
                                            contentDescription = "",
                                            contentScale = ContentScale.Crop,
                                            modifier = Modifier
                                                .fillMaxHeight()
                                                .fillMaxWidth()
                                                .size(400.dp)
                                                .clickable {

                                                }
                                        )

                                    }
                                    Text(
                                        text = "TOMKITTY",
                                        textAlign = TextAlign.Center,
                                        fontSize = 30.sp,
                                        fontWeight = FontWeight.Bold,
                                        color = Color.Black
                                    )

                                }

                            }

                        }
                        Spacer(modifier = Modifier.height(20.dp))

                    }
                }

                })

    }




}



val bottomNavItems = listOf(
    BottomNavItem(
        title = "Home",
        route="home",
        selectedIcon=Icons.Filled.Home,
        unselectedIcon=Icons.Outlined.Home,
        hasNews = false,
        badges=0
    ),



    BottomNavItem(
        title = "More",
        route="view_products",
        selectedIcon=Icons.Filled.Person,
        unselectedIcon=Icons.Outlined.Person,
        hasNews = true,
        badges=0
    ),
    

    BottomNavItem(
        title = "Animals",
        route="animal_wallpaper",
        selectedIcon=Icons.Filled.DateRange,
        unselectedIcon=Icons.Outlined.DateRange,
        hasNews = true,
        badges=0
    ),

    BottomNavItem(
        title = "Premium",
        route="go_premium",
        selectedIcon=Icons.Filled.Info,
        unselectedIcon=Icons.Outlined.Info,
        hasNews = true,
        badges=0
    ),


    )



data class BottomNavItem(
    val title :String,
    val route :String,
    val selectedIcon: ImageVector,
    val unselectedIcon :ImageVector,
    val hasNews :Boolean,
    val badges :Int
)



@Composable
@Preview(showBackground = true)
fun HomeScreenPreview(){
    WazitoECommerceTheme {
        HomeScreen(navController = rememberNavController())
    }
}