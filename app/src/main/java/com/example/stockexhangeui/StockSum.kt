package com.example.stockexhangeui

import androidx.compose.foundation.BorderStroke
import androidx.compose.foundation.isSystemInDarkTheme
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.PaddingValues
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.colorResource
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp

@Composable
fun StockSum() {

    Surface(
        Modifier
            .height(156.dp)
            .padding(PaddingValues(15.dp))
            .fillMaxWidth(),
        shape = RoundedCornerShape(
            topStart = 30.dp, topEnd = 30.dp, bottomEnd = 30.dp, bottomStart = 30.dp
        ),
        border = (if (isSystemInDarkTheme()) {
            BorderStroke(width = 1.dp, color = Color.LightGray.copy(alpha = 0.08f))
        } else{
            BorderStroke(width = 0.5.dp, color = Color.LightGray)
        }) as BorderStroke?
    ) {

        Column() {
            Box(
                Modifier
                    .fillMaxWidth()
                    .padding(start = 15.dp, top = 15.dp, end = 15.dp)
            ) {
                Text(text = "Rate", color = Color.Gray)
                Text(text = "1 ETH = 2593,00 USD", Modifier.align(Alignment.CenterEnd))
            }
            Box(
                Modifier
                    .fillMaxWidth()
                    .padding(start = 15.dp, top = 12.dp, end = 15.dp)
            ) {
                Text(text = "Estimated Fee",color = Color.Gray)
                Text(text = "4,28 USD", Modifier.align(Alignment.CenterEnd))
            }
            Box(
                Modifier
                    .fillMaxWidth()
                    .padding(start = 15.dp, top = 9.dp, end = 15.dp)
            ) {
                Text(text = "You will receive",color = Color.Gray)
                Text(text = "1797,45 USD", Modifier.align(Alignment.CenterEnd))
            }
        }

    }

}


@Composable
@Preview
fun StockSumPreview() {

    StockSum()

}