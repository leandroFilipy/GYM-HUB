package com.example.gymhub

import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.unit.dp

@Composable
fun Home(modifier: Modifier = Modifier) {

    Surface(
        modifier = modifier.fillMaxSize(),
        color = Color(0xFF5A0A0A)
    ) {

        Column(
            modifier = Modifier
                .fillMaxSize()
                .padding(top = 10.dp),
            horizontalAlignment = Alignment.CenterHorizontally
        ) {

            Image(
                painter = painterResource(R.drawable.logo_sem_fundo),
                contentDescription = "Logo sem fundo",
                modifier = Modifier.size(70.dp)
            )



            Surface(
                modifier = modifier.size(40.dp),
                color = Color.Black
            ){}

        }

    }
}
