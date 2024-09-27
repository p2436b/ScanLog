package com.peyman.bayat.scanlog

interface Platform {
    val name: String
}

expect fun getPlatform(): Platform