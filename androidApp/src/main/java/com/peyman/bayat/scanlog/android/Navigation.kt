package com.peyman.bayat.scanlog.android

import androidx.compose.runtime.Composable
import androidx.navigation.NavType
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.rememberNavController
import androidx.navigation.navArgument

@Composable
fun Navigation() {
	val navController = rememberNavController()
	NavHost(navController = navController, startDestination = ScanLogScreen.Start.name) {
		composable(ScanLogScreen.Start.name) {
			MainView(navController)
		}
		composable(
			ScanLogScreen.Projects.name  + "/{project}/",
			arguments = listOf(
				navArgument("project"){
					type=NavType.StringType
					defaultValue="Test"
				}
			)) { entry ->
			ProjectScreen(navController, entry.arguments?.getString("project"))
		}
		composable(ScanLogScreen.About.name) {
			AboutScreen(navController)
		}
	}
}