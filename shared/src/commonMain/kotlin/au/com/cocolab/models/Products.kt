package au.com.cocolab.models

import kotlinx.serialization.Serializable

@Serializable
data class Products(
    val items: List<Product>
)
