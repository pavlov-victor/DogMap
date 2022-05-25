package com.example.dogmap.components

import androidx.compose.foundation.layout.*
import androidx.compose.material.Icon
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.dogmap.R

@Composable
fun TopBar() {
    Row(
        horizontalArrangement = Arrangement.SpaceBetween,
        modifier = Modifier.fillMaxWidth()
    ) {
        Text("DogFree", color = Color.Black,
            fontWeight = FontWeight.Bold,
            modifier = Modifier.padding(5.dp), fontSize = 25.sp)
        Row(
            verticalAlignment = Alignment.CenterVertically
        ) {
            Icon(painter = painterResource(R.drawable.ic_baseline_menu_24),
                contentDescription = "desc", modifier = Modifier
                    .padding(10.dp)
                    .size(30.dp))
        }
    }
}