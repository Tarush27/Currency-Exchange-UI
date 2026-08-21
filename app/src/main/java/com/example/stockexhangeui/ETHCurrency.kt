package com.example.stockexhangeui

import androidx.compose.foundation.BorderStroke
import androidx.compose.foundation.isSystemInDarkTheme
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
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
import androidx.compose.ui.draw.shadow
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.SpanStyle
import androidx.compose.ui.text.buildAnnotatedString
import androidx.compose.ui.text.withStyle
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.stockexhangeui.ui.theme.md_theme_light_onPrimary
import com.example.stockexhangeui.ui.theme.md_theme_light_outlineVariant

@Composable
fun ETHCard() {

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
                    colors = IconButtonDefaults.iconButtonColors(containerColor = Color.White),
                    shape = CircleShape,
                    content = {
                        Icon(
                            painterResource(R.drawable.ic_etherum),
                            contentDescription = "Ethereum",
                            Modifier.size(40.dp),
                            tint = Color.Unspecified
                        )
                    })

                Spacer(Modifier.width(10.dp))
                Text(text = "ETH", fontSize = 20.sp)
                Icon(painterResource(R.drawable.ic_dropdown), contentDescription = "Drop Down")
                Spacer(Modifier.weight(1f))
                Button(
                    onClick = {},
                    colors = ButtonDefaults.buttonColors(
                        containerColor = if (isSystemInDarkTheme()) Color.DarkGray else Color.White,
                        contentColor = if (isSystemInDarkTheme()) Color.LightGray else Color.Blue
                    ),
                    border = (if (isSystemInDarkTheme()) {
                        BorderStroke(width = 1.dp, color = Color.LightGray.copy(alpha = 0.10f))
                    } else {
                        BorderStroke(width = 0.8.dp, color = Color.LightGray.copy(alpha = 0.7f))
                    }) as BorderStroke?,
                    modifier = Modifier.padding(top = 8.dp, end = 13.dp),

                    ) {
                    Text(text = "Send")
                }

            }

            Box(modifier = Modifier.fillMaxWidth(), contentAlignment = Alignment.Center) {
                Text(
                    text = "0,6948",
                    Modifier
                        .padding(top = 10.dp)
                        .align(Alignment.Center),
                    fontSize = 40.sp
                )
                Button(
                    {},
                    colors = ButtonDefaults.buttonColors(
                        containerColor = if (isSystemInDarkTheme()) MaterialTheme.colorScheme.onTertiary else MaterialTheme.colorScheme.tertiary,
                        contentColor = if (isSystemInDarkTheme()) Color.Green else Color.Green
                    ),
                    modifier = Modifier
                        .padding(top = 10.dp, end = 17.dp)
                        .align(Alignment.CenterEnd),
                ) { Text(text = "Max") }
            }

            Text(
                text = buildAnnotatedString {
                    withStyle(style = SpanStyle(color = Color.Gray)) {
                        append("Balance: ")
                    }

                    withStyle(style = SpanStyle()) {
                        append("0,6948 ETH")
                    }
                },
                Modifier.padding(top = 30.dp),

                )


        }
    }

}

@Composable
@Preview
fun ETHCardPreview() {

    ETHCard()

}