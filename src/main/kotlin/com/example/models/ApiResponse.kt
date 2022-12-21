package com.example.models

import kotlinx.serialization.Serializable

/**
 * Data resource returned by the API
 */
@Serializable
    data class ApiResponse(
    val success: Boolean,
    val message: String? = null,
    val prevPage: Int? = null,
    val nextPage: Int? = null,
    val heroes: List<Hero> = emptyList(),
    val lastUpdated: Long? = null
)
