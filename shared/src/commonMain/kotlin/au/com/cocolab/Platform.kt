package au.com.cocolab

interface Platform {
    val name: String
}

expect fun getPlatform(): Platform