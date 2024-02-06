package composables

import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Menu
import androidx.compose.material.icons.filled.Settings
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.material3.*

@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun HeaderDisplay(
    modifier: Modifier = Modifier,
) {
    Column(
        verticalArrangement = Arrangement.Top,
        horizontalAlignment = Alignment.CenterHorizontally
    ) {
        TopAppBar(
            title = { Text("Jetpack Compose Playground") },
            modifier = modifier,
            navigationIcon = {
                IconButton(onClick = {
                    println("Menu clicked")
                }) {
                    Icon(Icons.Filled.Menu, null)
                }
            },
            actions = {
                IconButton(onClick = {
                    println("Settings clicked")
                }) {
                    Icon(Icons.Filled.Settings, null)
                }

            },
            colors = TopAppBarDefaults.centerAlignedTopAppBarColors(
                containerColor = MaterialTheme.colorScheme.primary,
                titleContentColor = MaterialTheme.colorScheme.onPrimary,
                actionIconContentColor = MaterialTheme.colorScheme.onPrimary,
                navigationIconContentColor = MaterialTheme.colorScheme.onPrimary
            )
        )
    }
}
