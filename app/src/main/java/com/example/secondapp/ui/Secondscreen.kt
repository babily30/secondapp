package com.example.secondapp.ui

import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.padding
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.CheckCircle
import androidx.compose.material.icons.filled.FavoriteBorder
import androidx.compose.material.icons.filled.Search
import androidx.compose.material3.Card
import androidx.compose.material3.CardDefaults
import androidx.compose.material3.Icon
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.secondapp.R
import com.example.secondapp.ui.theme.SecondappTheme

@Composable
fun Secondscreen() {
    Column {
        Row(
            modifier = Modifier.padding(horizontal = 7.dp, vertical = 20.dp)
        ) {

            Text(
                text = "Discover",
                fontWeight = FontWeight.Black,
                fontSize = 25.sp,
            )
            Image(
                imageVector = Icons.Default.Search,
                contentDescription = "search",
                modifier = Modifier.padding(start = 280.dp, end = 0.dp, top = 5.dp, bottom = 0.dp)
            )
        }
        Text(
            text = "Just for you", modifier = Modifier.padding(horizontal = 7.dp, vertical = 20.dp)
        )
        Column(
            modifier = Modifier.padding(start = 0.dp, end = 120.dp, top = 0.dp, bottom = 0.dp)
//                .background(
//                    color = Color.Black
//                )

        ) {
            Card(
                modifier = Modifier.padding(horizontal = 7.dp, vertical = 20.dp),
                colors = CardDefaults.cardColors(containerColor = Color.White)
            ) {
                Image(
                    painter = painterResource(id = R.drawable.human),
                    contentDescription = "human",
                    alignment = Alignment.TopCenter
                )
                Text(
                    text = "What's makes great art, great",
                    modifier = Modifier.padding(horizontal = 7.dp, vertical = 6.dp),
                    fontSize = 16.sp
                )
                Text(
                    text = "The know-how to help you out",
                    modifier = Modifier.padding(horizontal = 7.dp, vertical = 6.dp)
                )
                Row {
                    Icon(
                        imageVector = Icons.Default.CheckCircle,
                        contentDescription = "Duration icon"
                    )
                    Text(text = "11 mins Listen")
                    Spacer(modifier = Modifier.weight(1f))
                    Icon(
                        imageVector = Icons.Default.FavoriteBorder,
                        contentDescription = "bookmark icon",
                        modifier = Modifier.padding(
                            start = 0.dp, top = 0.dp, end = 0.dp, bottom = 0.dp
                        )
                    )
                }

            }
        }


        Row(
            modifier = Modifier.padding(horizontal = 7.dp, vertical = 20.dp)
        ) {
            Text(
                text = "Art", modifier = Modifier.padding(
                    start = 7.dp, top = 0.dp, end = 310.dp, bottom = 8.dp
                )
            )
            Text(text = "More")
        }
        Row(
            modifier = Modifier.padding(start = 0.dp, end = 200.dp, top = 0.dp, bottom = 0.dp)
        ) {


            Card(
                modifier = Modifier.padding(horizontal = 7.dp, vertical = 0.dp),
                colors = CardDefaults.cardColors(
                    containerColor = Color.Magenta
                )
            ) {
                Text(
                    text = "Is art subjective or objective",
                    modifier = Modifier.padding(horizontal = 7.dp, vertical = 6.dp),
                    fontSize = 20.sp
                )
                Text(
                    text = "Let a contemporary artist inspire your creativity",
                    modifier = Modifier.padding(horizontal = 7.dp, vertical = 6.dp)
                )
                Row {
                    Icon(
                        imageVector = Icons.Default.CheckCircle,
                        contentDescription = "Duration icon"
                    )
                    Text(text = "4 mins Listen")
                    Spacer(modifier = Modifier.weight(1f))
                    Icon(
                        imageVector = Icons.Default.FavoriteBorder,
                        contentDescription = "bookmark icon",
                        modifier = Modifier.padding(
                            start = 0.dp, top = 0.dp, end = 0.dp, bottom = 0.dp
                        )
                    )

                }
            }
            Card(
                modifier = Modifier.padding(start = 28.dp, top = 5.dp),
                colors = CardDefaults.cardColors(
                    containerColor = Color.Red,
                )
            ) {
                Text(
                    text = "What makes van Gogh so famous",
                    fontSize = 20.sp,
                    modifier = Modifier.padding(start = 7.dp,top=15.dp)
                )
                Text(text = "Painter here,eager to talk with you.")
                Row {
                    Icon(
                        imageVector = Icons.Default.CheckCircle,
                        contentDescription = "Duration icon"
                    )
                    Text(text = "5 mins Listen")
                    Spacer(modifier = Modifier.weight(1f))
                    Icon(
                        imageVector = Icons.Default.FavoriteBorder,
                        contentDescription = "bookmark icon",
                        modifier = Modifier.padding(
                            start = 17.dp, top = 0.dp
                        )
                    )
                }
            }
        }
    }
}


@Preview(showBackground = true)
@Composable
fun SecondscreenPreview() {
    SecondappTheme {
        Secondscreen()
    }
}