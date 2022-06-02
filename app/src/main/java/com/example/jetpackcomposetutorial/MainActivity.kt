package com.example.jetpackcomposetutorial

import android.os.Bundle
import android.widget.Button
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.background
import androidx.compose.foundation.border
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.*
import androidx.compose.material3.Button
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.RectangleShape
import androidx.compose.ui.graphics.Shape
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.example.jetpackcomposetutorial.ui.theme.JetpackComposeTutorialTheme


// JETPACK COMPOSE INTRO

/*
Jetpack Compose is a modern toolkit for building native
Android UI. Jetpack Compose simplifies and accelerates
UI development on Android with less code, powerful tools,
and intuitive Kotlin APIs.
 */

// A view is now mentioned as composable in android jetpack terminology
// Every component we need to define shoule have a @Composable annotation
// @Preview annotation ensures that we do not have to relaunch the app again
// and again after changes to the composable components


class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {

            // Columns are meant to place components vertically in a stack
            // Rows are meant to place components next to each other horizontally

            Column() {
                Row() {
                    Text(text = "First Jetpack Compose Tutorial")
                    Text(text = "First Jetpack Compose Tutorial")
                }
                Row() {
                    Text(text = "First Jetpack Compose Tutorial")
                    Text(text = "First Jetpack Compose Tutorial")
                }

                Column() {
                    Row() {
                        Text(text = "First Jetpack Compose Tutorial")
                        Text(text = "First Jetpack Compose Tutorial")
                    }
                    Row() {
                        Text(text = "First Jetpack Compose Tutorial")
                        Text(text = "First Jetpack Compose Tutorial")
                    }
                }

                /*
                => ROWS AND COLUMNS CONCEPT
                    -> A column and a row has a main axis and a cross axis
                    -> Main axis: direction in which the components are stacked
                    -> Cross axis: direction perpendicular to the main axis is cross axis
                    -> A component vertically arranged can be horizontally aligned
                    -> A component vrtically aligned can be horizontally arranged

                    -> Items are arranged horizontally in a row and aligned vertically
                    -> Items are arranged vertically in a column and aligned horizontally

                    -> Modifier: used to change formatting of any component
                    -> Space Evenly: creates even space between components
                    -> SpaceBetween: creates maximum space possible between components
                    -> SpaceAround: gives each components the same space but other components half space of the middle components
                    -> Modifier.fillMaxSize() : same as match parent, makes the component fit to screen size
                    -> Offset: it is same as margin but it does not shift other components along with it.
                        Only the component that has the offset gets shifted to the specified margins
                    -> Spacer: inserts an empty composable spacing between components
                 */

                Column() {
                    Row(
                        Modifier
                            .fillMaxWidth()
                            .padding(10.dp)
                            .background(Color.Green),
                        verticalAlignment = Alignment.CenterVertically,
                        horizontalArrangement = Arrangement.Center) {
                        Text(text = "Learning to place components in rows and columns")
                    }
                }

                Column(
                    Modifier
                        .background(Color.Cyan)
                        .fillMaxWidth()
                        .fillMaxSize(0.3f),
//                        .height(200.dp),
                /* we can either give height in dp or we can give % value in fillMaxSize()
                    function in order to change the size of component*/
                verticalArrangement = Arrangement.SpaceEvenly,
                horizontalAlignment = Alignment.CenterHorizontally) {
                        Text(text = "Hello")
                        Text(text = "World")
                        Text(text = "Hello")
                }

                Row(
                    Modifier
                        .fillMaxWidth()
                        .background(Color.Yellow)
                        .padding(10.dp),
                    verticalAlignment = Alignment.CenterVertically,
                    horizontalArrangement = Arrangement.SpaceEvenly,
                ) {
                    Text(text = "Hello")
                    Text(text = "World")
                    Text(text = "Hello")
                }

                Column(modifier = Modifier
                    .background(Color.Green)
                    .fillMaxHeight(0.5f)
                    .width(300.dp)
                    .border(5.dp, Color.Black)
                    .padding(5.dp)
                    .border(5.dp, Color.Blue)
                    .padding(5.dp)
                    .border(5.dp, Color.Red)
                    .padding(10.dp)
//                    .border(3.dp,Color.Black, RectangleShape)
//                    .requiredWidth(300.dp)
                ) {
//                    Text(text = "New Column1", modifier = Modifier.offset(0.dp,16.dp))
                        Spacer(modifier = Modifier.height(20.dp))
                        Text(text = "New Column1", modifier = Modifier.clickable {})
                        Spacer(modifier = Modifier.height(50.dp))
                        Text(text = "New Column2")
                }

            }
        }
    }
}

@Composable
fun Greeting(name: String) {
    Text(text = "Hello $name!")
}

@Preview(showBackground = true)
@Composable
fun DefaultPreview() {
    JetpackComposeTutorialTheme {
        Greeting("Tanishq")
    }
}