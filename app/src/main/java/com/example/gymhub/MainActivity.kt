package com.example.gymhub

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.safeDrawingPadding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Button
import androidx.compose.material3.ButtonDefaults
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.OutlinedTextField
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.material3.TextFieldDefaults
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.gymhub.ui.theme.GymHubTheme
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.sp
import androidx.activity.compose.setContent
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.safeDrawingPadding
import androidx.compose.runtime.*

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            // Estado que controla a navegação
            var telaAtual by remember { mutableStateOf("login") }

            when (telaAtual) {
                "login" -> login(
                    modifier = Modifier.fillMaxSize().safeDrawingPadding(),
                    onLoginClick = { telaAtual = "Home" }
                )
                "Home" -> Home(
                    onStartExercise = { destino -> telaAtual = destino }
                )
                "roscaW" -> roscaW(
                    onBack = { telaAtual = "Home" }
                )
                "supino" -> supino(onBack = { telaAtual = "Home" })
                "puxada" -> puxada(onBack = { telaAtual = "Home" })
                "triceps" -> triceps(onBack = { telaAtual = "Home" })
            }
        }
    }
}

@Composable
fun login(
    modifier: Modifier = Modifier,
    onLoginClick: () -> Unit
) {

    var user by remember {
        mutableStateOf("");
    }
    var password by remember {
        mutableStateOf("");
    }
    Surface(
        modifier = modifier.fillMaxSize(), color = Color(0xFF12121D)


    ) {

        Column(
            modifier = modifier,
            horizontalAlignment = Alignment.CenterHorizontally,

            ) {

            Image(
                painter = painterResource(R.drawable.logo),
                contentDescription = "Dado2",
                modifier = Modifier
                    .size(160.dp)
                    .padding(top = 60.dp)
            )

            Text(
                text = "Go Gym",
                color = Color.White,
                fontSize = 20.sp
            )



            OutlinedTextField(
                value = user,
                onValueChange = { user = it },
                modifier = Modifier.padding(top = 170.dp),
                label = { Text("User") },
                singleLine = true,
                textStyle = TextStyle(fontSize = 20.sp),
                colors = TextFieldDefaults.colors(
                    focusedContainerColor = Color.White,
                    unfocusedContainerColor = Color.White.copy(alpha = 1f)
                )
            )

            OutlinedTextField(
                value = password,
                modifier = Modifier
                    .padding(top = 30.dp),
                onValueChange = { password = it },
                label = { Text("Password") },
                textStyle = TextStyle(fontSize = 20.sp),

                singleLine = true,
                colors = TextFieldDefaults.colors(
                    focusedContainerColor = Color.White,
                    unfocusedContainerColor = Color.White.copy(alpha = 1f)
                )
            )


            Button(
                onClick = {
                    onLoginClick()
                },
                modifier = Modifier
                    .padding(top = 30.dp)
                    .width(280.dp)
                    .height(45.dp),
                shape = RoundedCornerShape(8.dp),
                colors = ButtonDefaults.buttonColors(
                    containerColor = Color.White,
                    contentColor = Color(0xFF5A0A0A)
                )
            ) {
                Text(
                    text = "Login",
                    style = TextStyle(fontWeight = FontWeight.Bold, fontSize = 16.sp)
                )
            }
        }

    }
}
