package com.example.ejercicio1.home

import androidx.compose.foundation.layout.*
import androidx.compose.material3.Button
import androidx.compose.material3.Text
import androidx.compose.material3.TextField
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp
import androidx.compose.ui.Alignment

@Composable
fun HomeScreen(onButtonClick: (String) -> Unit) {
    var text by remember {
        mutableStateOf("")
    }
    Column(
        modifier = Modifier.fillMaxSize().padding(16.dp),
        horizontalAlignment = Alignment.CenterHorizontally,
        verticalArrangement = Arrangement.Center
    ) {
        TextField(
            value = text,
            onValueChange = { text = it },
            modifier = Modifier.fillMaxWidth() // Ajusta el ancho máximo, pero no el alto
                .height(IntrinsicSize.Min) // Establece la altura mínima
        )
        Button(
            onClick = { onButtonClick(text) },
            modifier = Modifier
                .fillMaxWidth()
                .padding(top = 16.dp) // Añade un espacio entre el TextField y el Button
        ) {
            Text(text = "Enviar")
        }
    }
}

