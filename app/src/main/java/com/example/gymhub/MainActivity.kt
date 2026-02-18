package com.example.gymhub

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.safeDrawingPadding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.width
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
import com.example.gymhub.ui.theme.GymHubTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            login(modifier = Modifier
                .fillMaxSize()
                .safeDrawingPadding())
        }
    }
}

@Composable
fun login(modifier: Modifier = Modifier) {

    var user by remember {
        mutableStateOf("");
    }

    Surface(
        modifier = modifier.fillMaxSize(),
        color = Color(0xFF5A0A0A)


    ) {

        Column (
            modifier = modifier,
            horizontalAlignment = Alignment.CenterHorizontally,

        ){

            Image(painter = painterResource(R.drawable.logo), contentDescription = "Dado2",
                modifier = Modifier
                    .size(160.dp)
                    .padding(top = 60.dp))

            
            OutlinedTextField(value = user,
                onValueChange = { user = it },
                label = { Text("User")},
                modifier = modifier.width(100.dp),
                singleLine = true,
                colors = TextFieldDefaults.colors(
                    focusedContainerColor = Color.White,
                    unfocusedContainerColor = Color.White.copy(alpha = 0.8f)
                )
            )
        }

    }
}
