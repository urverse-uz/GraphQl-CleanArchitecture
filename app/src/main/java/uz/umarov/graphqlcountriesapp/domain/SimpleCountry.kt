package uz.umarov.graphqlcountriesapp.domain

import uz.umarov.CountryQuery.Continent
import uz.umarov.CountryQuery.Language

data class SimpleCountry(
    val code: String,
    val name: String,
    val emoji: String,
    val capital: String
)