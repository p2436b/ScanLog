package com.peyman.bayat.scanlog.android

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.automirrored.filled.ArrowBack
import androidx.compose.material.icons.filled.ArrowBack
import androidx.compose.material3.Button
import androidx.compose.material3.ElevatedButton
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.Icon
import androidx.compose.material3.IconButton
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.material3.TopAppBar
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.unit.dp
import androidx.navigation.NavController
import org.intellij.lang.annotations.JdkConstants.HorizontalAlignment

@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun ProjectScreen(navController: NavController, project: String?) {
	Scaffold(
		modifier = Modifier.fillMaxSize(),
		topBar = {
			TopAppBar(
				title = { Text(project!!) },
				navigationIcon = {
					IconButton(onClick = { navController.popBackStack() }) {
						Icon(imageVector = Icons.AutoMirrored.Filled.ArrowBack, contentDescription = null)
					}
				}
			)
		}
	) { innerPadding ->
		LazyColumn(
			Modifier
				.padding(innerPadding)
				.padding(horizontal = 10.dp)
				.fillMaxSize(),
			verticalArrangement = Arrangement.spacedBy(16.dp)
		) {
			items(20) {
				Box(
					Modifier
						.padding(16.dp)
						.background(Color.DarkGray)
						.fillMaxWidth()) {
					Text(text = "sdklfjadsklfj")
				}
			}
		}
	}
}