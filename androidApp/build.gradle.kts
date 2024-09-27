plugins {
	alias(libs.plugins.androidApplication)
	alias(libs.plugins.kotlinAndroid)
	alias(libs.plugins.compose.compiler)
}

android {
	namespace = "com.peyman.bayat.scanlog.android"
	compileSdk = 34
	defaultConfig {
		applicationId = "com.peyman.bayat.scanlog.android"
		minSdk = 24
		targetSdk = 34
		versionCode = 1
		versionName = "1.0"
		vectorDrawables {
			useSupportLibrary = true
		}
	}
	buildFeatures {
		compose = true
	}
	packaging {
		resources {
			excludes += "/META-INF/{AL2.0,LGPL2.1}"
		}
	}
	buildTypes {
		getByName("release") {
			isMinifyEnabled = false
		}
	}
	compileOptions {
		sourceCompatibility = JavaVersion.VERSION_1_8
		targetCompatibility = JavaVersion.VERSION_1_8
	}
	kotlinOptions {
		jvmTarget = "1.8"
	}
	composeOptions {
		kotlinCompilerExtensionVersion = "1.5.1"
	}
}

dependencies {
	implementation(projects.shared)
	implementation(libs.compose.ui)
	implementation(libs.compose.ui.tooling.preview)
	implementation(libs.compose.material3)
	implementation(libs.androidx.activity.compose)
	implementation(libs.androidx.lifecycle.runtime.ktx)
	implementation(platform(libs.androidx.compose.bom))
	implementation(libs.androidx.ui.graphics)
	implementation(libs.androidx.navigation.compose)
	androidTestImplementation(platform(libs.androidx.compose.bom))
	androidTestImplementation(libs.androidx.ui.test.junit4)
	debugImplementation(libs.compose.ui.tooling)
	debugImplementation(libs.androidx.ui.test.manifest)
}