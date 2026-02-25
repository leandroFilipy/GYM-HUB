package com.example.gymhub

import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.PaddingValues
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxHeight
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Button
import androidx.compose.material3.ButtonDefaults
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp


@Composable
fun Home(onStartExercise: (String) -> Unit) {

    Surface(
        modifier = Modifier.fillMaxSize(),
        color = Color(0xFF12121D)
    ) {

        Column(
            modifier = Modifier
                .fillMaxSize()
                .padding(top = 20.dp),
            horizontalAlignment = Alignment.CenterHorizontally
        ) {

            Image(
                painter = painterResource(R.drawable.logo_sem_fundo),
                contentDescription = null,
                modifier = Modifier.size(70.dp)
            )

            Spacer(modifier = Modifier.height(20.dp))
            Surface(
                modifier = Modifier
                    .width(380.dp)
                    .height(50.dp),
                shape = RoundedCornerShape(16.dp)

            ) {
                Column(
                    modifier = Modifier.fillMaxSize(),
                    horizontalAlignment = Alignment.CenterHorizontally,
                    verticalArrangement = Arrangement.Center
                ) {
                    Text("MONDAY", fontSize = 16.sp, fontWeight = FontWeight.Bold)
                }
            }
            LazyColumn(
                modifier = Modifier.fillMaxSize(),
                contentPadding = PaddingValues(16.dp)
            ) {

                item {
                    ExerciseCard(
                        title = "Rosca W",
                        reps = "3 sets of 15 reps",
                        imageRes = R.drawable.bah,
                        onStartClick = { onStartExercise("roscaW") }
                    )
                }
                item {
                    ExerciseCard(
                        title = "Supino",
                        reps = "4 sets of 10 reps",
                        imageRes = R.drawable.supino,
                        onStartClick = { onStartExercise("supino") })
                }

                item {
                    ExerciseCard(
                        title = "Puxada alta",
                        reps = "3 sets of 12 reps",
                        imageRes = R.drawable.puxada,
                        onStartClick = { onStartExercise("puxada") })

                }

                item {
                    ExerciseCard(
                        title = "Triceps na polia alta",
                        reps = "3 sets of 15 reps",
                        imageRes = R.drawable.triceps,
                        onStartClick = { onStartExercise("triceps") })

                }
            }


        }
    }

}

@Composable
fun ExerciseCard(
    title: String,
    reps: String,
    imageRes: Int,
    onStartClick: () -> Unit
) {


    Surface(
        modifier = Modifier
            .padding(top = 20.dp)
            .width(380.dp)
            .height(140.dp),
        shape = RoundedCornerShape(16.dp),
        tonalElevation = 6.dp
    ) {

        Row(
            modifier = Modifier
                .fillMaxSize()
                .padding(16.dp),
            verticalAlignment = Alignment.CenterVertically
        ) {

            Image(
                painter = painterResource(imageRes),
                contentDescription = null,
                contentScale = ContentScale.Crop,
                modifier = Modifier
                    .width(110.dp)
                    .height(110.dp)
                    .clip(RoundedCornerShape(20.dp))
            )
            Spacer(modifier = Modifier.width(20.dp))

            Column(
                modifier = Modifier.fillMaxHeight(),
                verticalArrangement = Arrangement.SpaceBetween
            ) {

                Text(
                    text = title,
                    fontSize = 20.sp,
                    fontWeight = FontWeight.Bold
                )

                Text(
                    text = reps,
                    fontSize = 16.sp
                )

                Button(
                    onClick = onStartClick,
                    modifier = Modifier
                        .padding(top = 30.dp)
                        .width(280.dp)
                        .height(45.dp),
                    shape = RoundedCornerShape(8.dp),
                    colors = ButtonDefaults.buttonColors(
                        containerColor = Color(0xFF12121D),
                        contentColor = Color.White
                    )
                ) {
                    Text(
                        text = "Start",
                        style = TextStyle(fontWeight = FontWeight.Bold, fontSize = 16.sp)
                    )
                }
            }
        }
    }
}