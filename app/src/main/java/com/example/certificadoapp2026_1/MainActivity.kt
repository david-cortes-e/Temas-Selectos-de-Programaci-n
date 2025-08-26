package com.example.certificadoapp2026_1

import android.graphics.drawable.Drawable
import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.compose.foundation.Image
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
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontStyle
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.certificadoapp2026_1.ui.theme.CertificadoApp20261Theme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContent {
            CertificadoApp20261Theme {
                Scaffold(modifier = Modifier.fillMaxSize()) { innerPadding ->
                    CertificatingCourse(
                        name = "Android",
                        modifier = Modifier.padding(innerPadding)
                    )
                }
            }
        }
    }
}

@Composable
fun CertificatingCourse(
    name: String,
    modifier: Modifier = Modifier,
    number:Int=50,
    course:String="Uso básico de Kotlin") {
    Column (
        modifier.fillMaxSize().padding(10.dp),
        verticalArrangement = Arrangement.Center,
        horizontalAlignment = Alignment.CenterHorizontally        )
    {
        Row(
            modifier = Modifier.fillMaxWidth(),
            horizontalArrangement = Arrangement.SpaceAround,
            verticalAlignment = Alignment.CenterVertically
            )
        {
            Image(
                painter = painterResource(id=R.drawable.apple_logo),
                contentDescription = null,
                modifier.size(70.dp,70.dp)
            )

            Text(
                text ="APPLEDROID",
                fontSize = 20.sp,
                textAlign = TextAlign.Center,
                )

            Image(
                painter = painterResource(id=R.drawable.android_logo),
                contentDescription = null,
                modifier.size(80.dp,80.dp)
            )
        }

        Spacer(modifier=modifier.height(20.dp)) //espacio entre texto

        Text(
            text = "This certificate is presented to:",
            fontSize = 20.sp,
            modifier = modifier.fillMaxWidth(),
            textAlign = TextAlign.Center,
        )

        Box(contentAlignment= Alignment.Center) {
            Image(
                painter = painterResource(id = R.drawable.graduacion),
                modifier=modifier.fillMaxWidth(),
                contentDescription = null,
                alpha = 0.4F,
            )

            Text(
                text = name,
                fontSize = 40.sp,
                fontWeight = FontWeight.Bold,
                modifier = modifier.fillMaxWidth(),
                textAlign = TextAlign.Center,
            )
        }
        Spacer(modifier=modifier.height(10.dp))

        Text(
            text="Has completed a $number hour course on:",
            fontSize = 20.sp,
            modifier=modifier.fillMaxWidth(),
            textAlign = TextAlign.Center,
        )
        Text(
            text=course,
            fontSize = 20.sp,
            fontStyle = FontStyle.Italic,
            modifier=modifier.fillMaxWidth(),
            textAlign = TextAlign.Center,
        )
        Spacer(modifier=modifier.height(20.dp)) //espacio entre texto

        Row(
            modifier = Modifier.fillMaxWidth(),
            horizontalArrangement = Arrangement.SpaceAround,
            verticalAlignment = Alignment.CenterVertically
        )
        {
            Column (
                //modifier.fillMaxSize().padding(10.dp),
                verticalArrangement = Arrangement.Center,
                horizontalAlignment = Alignment.CenterHorizontally        )
            {
                Image(
                    painter = painterResource(id=R.drawable.firma1),
                    contentDescription = null,
                    modifier.size(70.dp,70.dp)
                )
                Text(
                    text ="Juanito Pérez",
                    fontSize = 20.sp,
                    textAlign = TextAlign.Center,
                )
            }

            Column (
                //modifier.fillMaxSize().padding(10.dp),
                verticalArrangement = Arrangement.Center,
                horizontalAlignment = Alignment.CenterHorizontally        )
            {
                Image(
                    painter = painterResource(id=R.drawable.firma2),
                    contentDescription = null,
                    modifier.size(70.dp,70.dp)
                )
                Text(
                    text ="Pedro López",
                    fontSize = 20.sp,
                    textAlign = TextAlign.Center,
                )

            }
        }






    }



}
@Preview(showBackground = true)
@Composable
fun GreetingPreview() {
    CertificadoApp20261Theme {
        CertificatingCourse("David Cortés Elvira")
    }
}