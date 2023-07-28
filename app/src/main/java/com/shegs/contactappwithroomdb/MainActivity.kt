package com.shegs.contactappwithroomdb

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import com.shegs.contactappwithroomdb.ui.theme.ContactAppWithRoomDBTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            ContactAppWithRoomDBTheme {

            }
        }
    }
}



@Preview(showBackground = true)
@Composable
fun GreetingPreview() {
    ContactAppWithRoomDBTheme {
    }
}