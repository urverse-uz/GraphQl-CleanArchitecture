package uz.umarov.graphqlcountriesapp.domain

import uz.umarov.CountryQuery.Continent
import uz.umarov.CountryQuery.Language

data class DetailedCountry(
    val code: String,
    val name: String,
    val emoji: String,
    val capital: String,
    val currency: String,
    val languages: List<String>,
    val continent: String,
)