package com.example.stockexhangeui

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.compose.foundation.isSystemInDarkTheme
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.PaddingValues
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.material3.Button
import androidx.compose.material3.ButtonDefaults
import androidx.compose.material3.CenterAlignedTopAppBar
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.Icon
import androidx.compose.material3.IconButton
import androidx.compose.material3.IconButtonDefaults
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.shadow
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.example.stockexhangeui.ui.theme.StockExhangeUITheme

class MainActivity : ComponentActivity() {
    @OptIn(ExperimentalMaterial3Api::class)
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContent {
            StockExhangeUITheme {

                Scaffold(topBar = {
                    CenterAlignedTopAppBar(title = {
                        Text(
                            text = "Exchange",
                            textAlign = TextAlign.Center,
                            fontWeight = FontWeight.Bold,
                            style = MaterialTheme.typography.bodyLarge
                        )
                    }, Modifier.padding(start = 8.dp), navigationIcon = {
                        IconButton(
                            {},
                            Modifier
                                .size(64.dp)
                                .shadow(elevation = 1.5.dp, shape = CircleShape, clip = false),
                            colors = IconButtonDefaults.iconButtonColors(containerColor = if (isSystemInDarkTheme()) Color.DarkGray else Color.White),
                            shape = CircleShape
                        ) {
                            Icon(
                                painterResource(R.drawable.ic_arrow_back),
                                contentDescription = "Back Arrow For Navigation",
                            )
                        }
                    })
                }) { innerPadding ->
                    Surface(
                        Modifier
                            .padding(innerPadding)
                            .fillMaxSize()
                    ) {
                        ExchangeCurrency()
                    }
                }

            }
        }
    }
}


@Composable
fun ExchangeCurrency() {

    Column(Modifier.padding(top = 15.dp)) {
        Box(modifier = Modifier.fillMaxWidth(), contentAlignment = Alignment.Center) {
            Column(
                Modifier.padding(PaddingValues(15.dp)),
                verticalArrangement = Arrangement.spacedBy(10.dp)
            ) {
                ETHCard()
                USDCurrency()
            }
            UpDownSymbol()
        }
        Button(
            {},
            Modifier
                .fillMaxWidth()
                .height(50.dp)
                .padding(start = 15.dp, end = 15.dp),
            colors = ButtonDefaults.buttonColors(containerColor = MaterialTheme.colorScheme.primary)
        ) {
            Text(text = "Exchange", color = Color.White)
        }
        StockSum()
    }


}


@Composable
@Preview(showSystemUi = true)
fun ExchangeCurrencyPreview() {

    ExchangeCurrency()

}

