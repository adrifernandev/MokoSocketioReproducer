package com.adrifernandevs.mokosocketioreproducer

interface Platform {
    val name: String
}

expect fun getPlatform(): Platform