package com.example.businesscard

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.compose.foundation.BorderStroke
import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.border
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.IntrinsicSize

import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.layout.wrapContentSize
import androidx.compose.material3.Icon
import androidx.compose.material3.LocalContentColor
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.painter.Painter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.res.fontResource
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.res.vectorResource
import androidx.compose.ui.text.font.FontFamily
import androidx.compose.ui.text.font.FontStyle
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.businesscard.ui.theme.BusinesscardTheme
import org.intellij.lang.annotations.JdkConstants.HorizontalAlignment

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContent {
            BusinesscardTheme {
                Scaffold(modifier = Modifier.fillMaxSize()) { innerPadding ->
                    Card(
                        modifier = Modifier.padding(innerPadding)
                    )
                }
            }
        }
    }
}

@Composable
fun Card(modifier: Modifier = Modifier) {
    Column(
        modifier = Modifier
            .fillMaxSize()
            .background(Color(0xFFd2e8d4))
            ) {
        Column(
            horizontalAlignment = Alignment.CenterHorizontally,
            verticalArrangement = Arrangement.Center,
            modifier = Modifier
                .weight(2F)
                .fillMaxWidth()
                .padding(top=100.dp)
        ) {
            Box(
                contentAlignment = Alignment.Center,
                modifier = Modifier
                    .background(Color(0xFF073042))
                    .width(120.dp)
                    .height(120.dp)

            )

            {
            Image(
                painter = painterResource(id = R.drawable.android_logo),
                contentDescription = "Mail icon",
                modifier = Modifier
                    .width(115.dp)
                    .height(115.dp)

            )
            }

            Text(
                text = "Shadit Supreme",
                fontSize = (40.sp),
                fontFamily = FontFamily.SansSerif,
                fontWeight = FontWeight(375),
                modifier = Modifier.padding(top = 15.dp)
            )
            Text(
                text = "Android Developer Extraordinaire",
                fontSize = 12.sp,
                fontWeight = FontWeight.Bold,
                color = Color(0xFF006d3b),
                modifier = Modifier.padding(top = 5.dp)
            )



        }
        Column(
            horizontalAlignment = Alignment.CenterHorizontally,
            verticalArrangement = Arrangement.Center,
            modifier = Modifier
                .weight(1f)
                .fillMaxWidth()

        ) {

            Column(modifier = Modifier
                .wrapContentSize(Alignment.Center)
            ) {
                DrawRow(
                    icon = ImageVector.vectorResource(R.drawable.phone_24dp_e8eaed),
                    desc = "Phone Icon",
                    text = "+11 (123) 334-333-2119"
                )
                DrawRow(
                    icon = ImageVector.vectorResource(R.drawable.share_24dp_006d3b),
                    desc = "Share Icon",
                    text = "@AndriodDevShadit"
                )
                DrawRow(
                    icon = ImageVector.vectorResource(R.drawable.mail_24dp_e8eaed),
                    desc = "Mail Icon",
                    text = "sshadit@southhills.edu"
                )
            }
            }

        }

    }


@Composable
private fun DrawRow(icon:ImageVector ,desc: String ,text: String) {

        Row(
            verticalAlignment = Alignment.CenterVertically,
            horizontalArrangement = Arrangement.Start,
            modifier = Modifier
                .padding(8.dp)
            // Distribute space between icon and text
        ) {
            Icon(
                imageVector = icon,
                contentDescription = desc,
                tint = Color(0xFF006d3b)

                )
            Box(
                modifier = Modifier
                    .width(15.dp)
            )
            Text(
                text = text,
                fontSize = 16.sp,

                fontFamily = FontFamily.SansSerif


            )
        }
    }

@Preview(showBackground = true)
@Composable
fun GreetingPreview() {
    BusinesscardTheme {
        Card()
    }
}