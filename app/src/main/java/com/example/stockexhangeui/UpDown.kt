package com.example.stockexhangeui

import androidx.compose.foundation.BorderStroke
import androidx.compose.foundation.isSystemInDarkTheme
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.material3.Icon
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Surface
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.example.stockexhangeui.ui.theme.md_theme_dark_scrim
import com.example.stockexhangeui.ui.theme.md_theme_dark_surfaceTint
import com.example.stockexhangeui.ui.theme.md_theme_light_surfaceTint

@Composable
fun UpDownSymbol() {

    Surface(
        modifier = Modifier.size(40.dp), shape = CircleShape, color = (if (isSystemInDarkTheme()) {
            Color.LightGray
        } else {
            MaterialTheme.colorScheme.surface
        }) as Color, border = if (isSystemInDarkTheme()) {
            BorderStroke(width = 1.dp, color = Color.LightGray)
        } else {
            BorderStroke(width = 1.dp, color = Color.Gray)
        } as BorderStroke
    ) {
        Icon(
            painterResource(R.drawable.ic_swap),
            contentDescription = "UpDown",
            Modifier.padding(10.dp),
            md_theme_dark_scrim
        )
    }


}

@Composable
@Preview
fun UpDownPreview() {
    UpDownSymbol()
}