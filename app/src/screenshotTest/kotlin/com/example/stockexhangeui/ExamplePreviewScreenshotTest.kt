package com.example.stockexhangeui

import androidx.compose.runtime.Composable
import androidx.compose.ui.tooling.preview.Preview
import com.android.tools.screenshot.PreviewTest

class ExamplePreviewScreenshotTest {
    @PreviewTest
    @Composable
    @Preview(showBackground = true)
    fun ETHCardPreview() {

        ETHCard()

    }
}
