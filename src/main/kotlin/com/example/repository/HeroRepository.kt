package com.example.repository

import com.example.models.ApiResponse
import com.example.models.Hero

/**
 * Defines server pagination and API contracts
 */
interface HeroRepository {
    val heroes: Map<Int, List<Hero>>

    val page1: List<Hero>
    val page2: List<Hero>
    val page3: List<Hero>
    val page4: List<Hero>
    val page5: List<Hero>

    /**
     * Retrieves all [Hero] on a specified page id
     * @param page- pagination id
     * @return [ApiResponse]
     */
    suspend fun getAllHeroes(page: Int = 1): ApiResponse

    /**
     * Retrieves all [Hero] by name
     * @param [name] - hero name
     * @return [ApiResponse]
     */
    suspend fun searchHeroes(name: String?): ApiResponse
}