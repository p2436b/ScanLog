package com.peyman.bayat.scanlog.android

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.safeContentPadding
import androidx.compose.foundation.text.KeyboardOptions
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.AccountCircle
import androidx.compose.material.icons.filled.Call
import androidx.compose.material3.*
import androidx.compose.runtime.Composable
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.getValue
import androidx.compose.runtime.setValue
import androidx.compose.runtime.remember
import androidx.compose.ui.Modifier
import androidx.compose.ui.text.input.ImeAction
import androidx.compose.ui.text.input.PasswordVisualTransformation
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.navigation.NavController

class MainActivity : ComponentActivity() {
	override fun onCreate(savedInstanceState: Bundle?) {
		super.onCreate(savedInstanceState)
		setContent {
			MyApplicationTheme {
				Surface(
					color = MaterialTheme.colorScheme.background
				) {
					Navigation()
				}
			}
		}
	}
}

@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun MainView(navController: NavController) {
	Scaffold(
		modifier = Modifier.fillMaxSize(),
		topBar = {
			CenterAlignedTopAppBar(
				title = { Text("Scan Log") }
			)
		}
	) { innerPadding ->
		Column(
			Modifier
				.padding(innerPadding)
				.padding(horizontal = 10.dp)
				.fillMaxSize(),
			verticalArrangement = Arrangement.spacedBy(10.dp)
		) {
			ElevatedButton(modifier = Modifier.fillMaxWidth(), onClick = {
				val project = "This is a test project"
				navController.navigate(ScanLogScreen.Projects.name + "/$project/")
			}) {
				Text("Projects")
			}
			ElevatedButton(modifier = Modifier.fillMaxWidth(), onClick = {
				navController.navigate(ScanLogScreen.About.name)
			}) {
				Text("About")
			}
		}
	}
}