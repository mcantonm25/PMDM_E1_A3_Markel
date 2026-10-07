package com.mcantonm25.pmdmE1A3

import android.os.Bundle
import androidx.activity.compose.*
import androidx.activity.*
import androidx.compose.foundation.layout.*
import androidx.compose.material3.*
import androidx.compose.runtime.*
import androidx.compose.runtime.saveable.rememberSaveable
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.*
import androidx.compose.foundation.*
import androidx.compose.ui.Alignment
import androidx.compose.ui.unit.*
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import com.mcantonm25.pmdmE1A3.ui.theme.PMDM_E1_A3_MarkelTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContent {
            PMDM_E1_A3_MarkelTheme {
                Scaffold(modifier = Modifier.fillMaxSize()) { innerPadding ->
                    Ariketa3(
                        modifier = Modifier.padding(innerPadding)
                    )
                }
            }
        }
    }
}

@Composable
fun Ariketa3 (modifier: Modifier = Modifier) {
    var nota by rememberSaveable { mutableStateOf(0) }

    Box (
        modifier = modifier.fillMaxSize(),
        contentAlignment = Alignment.Center
    ) {
        Image (
            painter = painterResource(R.drawable.ic_launcher_background),
            contentDescription = "Fondo",
            modifier = Modifier.fillMaxSize(),
            contentScale = ContentScale.Crop
        )

        Column(
            horizontalAlignment = Alignment.CenterHorizontally,
            verticalArrangement = Arrangement.Center,
            modifier = Modifier.padding(16.dp)
        ) {
            Text(
                text = "Ikaslearen nota",
                style = MaterialTheme.typography.titleLarge,
                fontSize = 24.sp
            )

            Spacer(modifier = Modifier.height(12.dp))

            Text(
                text = "$nota",
                style = MaterialTheme.typography.displayMedium,
                fontSize = 48.sp
            )

            Spacer(modifier = Modifier.height(24.dp))

            Button (
                onClick = { nota++ }
            ) {
                Text(text = "Nota igo (+1)")
            }
        }
    }
}

@Preview(showBackground = true)
@Composable
fun Ariketa3Preview() {
    PMDM_E1_A3_MarkelTheme {
        Ariketa3()
    }
}