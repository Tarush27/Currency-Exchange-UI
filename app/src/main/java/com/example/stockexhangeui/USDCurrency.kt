package com.example.stockexhangeui

import androidx.compose.foundation.BorderStroke
import androidx.compose.foundation.background
import androidx.compose.foundation.isSystemInDarkTheme
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.PaddingValues
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Button
import androidx.compose.material3.ButtonDefaults
import androidx.compose.material3.Icon
import androidx.compose.material3.IconButton
import androidx.compose.material3.IconButtonDefaults
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.SpanStyle
import androidx.compose.ui.text.buildAnnotatedString
import androidx.compose.ui.text.withStyle
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.stockexhangeui.ui.theme.md_theme_light_onTertiaryContainer
import com.example.stockexhangeui.ui.theme.md_theme_light_tertiary

@Composable
fun USDCurrency() {
    Surface(
        Modifier
            .height(190.dp)
            .fillMaxWidth(), shape = RoundedCornerShape(
            topStart = 20.dp, topEnd = 20.dp, bottomEnd = 20.dp, bottomStart = 20.dp
        ), color = (if (isSystemInDarkTheme()) {
            Color.DarkGray
        } else {
            MaterialTheme.colorScheme.surface
        }) as Color, border = (if (isSystemInDarkTheme()) {
            BorderStroke(width = 0.dp, color = Color.DarkGray)
        } else {
            BorderStroke(width = 0.5.dp, color = Color.LightGray)
        }) as BorderStroke?
    ) {
        Column(horizontalAlignment = Alignment.CenterHorizontally) {
            Row(
                modifier = Modifier.fillMaxWidth(), verticalAlignment = Alignment.CenterVertically
            ) {
                Spacer(Modifier.width(5.dp))
                IconButton(
                    {},
                    colors = IconButtonDefaults.iconButtonColors(containerColor = md_theme_light_tertiary),
                    content = {
                        Icon(
                            painterResource(R.drawable.ic_dollar),
                            contentDescription = "Ethereum",
                            Modifier.size(40.dp),
                            tint = Color.White

                        )
                    }
                )
                Spacer(Modifier.width(10.dp))
                Text(text = "USD", fontSize = 20.sp)
                Icon(painterResource(R.drawable.ic_dropdown), contentDescription = "Drop Down")
                Spacer(Modifier.weight(1f))
                Button(
                    onClick = {},
                    modifier = Modifier.padding(top = 8.dp, end = 13.dp),
                    colors = ButtonDefaults.buttonColors(
                        containerColor = if (isSystemInDarkTheme()) Color.DarkGray else Color.White,
                        contentColor = if (isSystemInDarkTheme()) Color.LightGray else Color.Blue
                    ),
                    border = (if (isSystemInDarkTheme()) {
                        BorderStroke(width = 1.dp, color = Color.LightGray.copy(alpha = 0.10f))
                    } else {
                        BorderStroke(width = 0.8.dp, color = Color.LightGray.copy(alpha = 0.7f))
                    }) as BorderStroke?,
                    contentPadding = PaddingValues(horizontal = 15.dp)
                ) {
                    Text(text = "Receive")
                }

            }

            Text(
                text = "1801,73", Modifier.padding(top = 10.dp), fontSize = 40.sp
            )

            Text(
                text = buildAnnotatedString {
                    withStyle(style = SpanStyle(color = Color.Gray)) {
                        append("Balance: ")
                    }

                    withStyle(style = SpanStyle()) {
                        append("100,95 USD")
                    }
                },
                Modifier.padding(top = 30.dp),
            )


        }
    }
}


@Composable
@Preview
fun USDCurrencyPreview() {
    USDCurrency()
}

