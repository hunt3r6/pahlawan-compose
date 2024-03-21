package com.example.pahlawan

import androidx.compose.foundation.BorderStroke
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Surface
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp
import com.example.pahlawan.data.Hero

@Composable
fun HeroCard(hero: Hero, modifier: Modifier) {
    Surface(
        modifier = modifier,
        color = MaterialTheme.colorScheme.surface,
        border = BorderStroke(0.dp, MaterialTheme.colorScheme.secondary),
        shape = RoundedCornerShape(8.dp)
    ) {

    }

}