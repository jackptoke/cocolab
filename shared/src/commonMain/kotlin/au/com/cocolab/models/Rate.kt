package au.com.cocolab.models

import kotlinx.serialization.Serializable

@Serializable
data class Rate(
    val rate: Double,
    val count: Int
    )
