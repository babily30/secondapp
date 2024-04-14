package com.example.secondapp

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Button
import androidx.compose.material3.ButtonDefaults
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.Font
import androidx.compose.ui.text.font.FontFamily
import androidx.compose.ui.text.font.FontLoadingStrategy
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.secondapp.ui.Secondscreen
import com.example.secondapp.ui.theme.SecondappTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            SecondappTheme {
                // A surface container using the 'background' color from the theme
                Surface(
                    modifier = Modifier.fillMaxSize(),
                    color = MaterialTheme.colorScheme.background
                ) {
                   Secondscreen()
//                    LandingScreen()
                }
            }
        }
    }
}


@Composable
fun LandingScreen(){

    Box(modifier = Modifier.fillMaxSize()){
        Image(
            painter = painterResource(id = R.drawable.audi),
            contentDescription = null,
            modifier = Modifier.fillMaxSize(),
            contentScale = ContentScale.Crop
        )
        Column (
            modifier = Modifier
                .fillMaxSize()
//                .background(
//                   color = Color.Red.copy(alpha = 0.4f)
//                )
                .padding(start = 16.dp, end = 16.dp, top = 150.dp, bottom = 48.dp)
        ){
            Text(text = "Find and Rental Car",
                fontSize = 60.sp,
                fontWeight = FontWeight.Black,
                lineHeight = 60.sp,
                color = Color.White,         //color=MaterialTheme.colorscheme.Primary
                //letterSpacing = 5.sp,
                fontFamily = FontFamily(
                    Font(R.font.candal, loadingStrategy = FontLoadingStrategy.Async)
                )
            )
            Spacer(modifier = Modifier.weight(1f))
            Button(
                modifier = Modifier
                    .fillMaxWidth(1f)
                    .padding(horizontal = 8.dp, vertical = 24.dp),
                colors = ButtonDefaults.buttonColors(
                    containerColor = Color.White,
                ),
                shape = RoundedCornerShape(16.dp),
                elevation = ButtonDefaults.buttonElevation(
                    defaultElevation = 2.dp , // shadow in button to make it louder in the screen
                    pressedElevation = 8.dp  // when we click on button the shadow will appere
                ),
                onClick = { /*TODO*/ })
            {
                Text(text = "Let's Go",
                    fontSize = 24.sp,
                    modifier = Modifier.padding(8.dp))
            }

        }
    }

}
@Preview(showBackground = true)
@Composable
fun LandingScreenPreview(){
    SecondappTheme {
        LandingScreen()
    }
}