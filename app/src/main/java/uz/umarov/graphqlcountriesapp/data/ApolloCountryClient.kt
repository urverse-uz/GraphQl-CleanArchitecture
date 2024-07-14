package uz.umarov.graphqlcountriesapp.data

import com.apollographql.apollo3.ApolloClient
import uz.umarov.CountriesQuery
import uz.umarov.CountryQuery
import uz.umarov.graphqlcountriesapp.domain.CountryClient
import uz.umarov.graphqlcountriesapp.domain.DetailedCountry
import uz.umarov.graphqlcountriesapp.domain.SimpleCountry

class ApolloCountryClient(
    private val apolloClient: ApolloClient
): CountryClient {

    override suspend fun getCountries(): List<SimpleCountry> {
        return apolloClient
            .query(CountriesQuery())
            .execute()
            .data
            ?.countries
            ?.map { it.toSimpleCountry() }
            ?: emptyList()
    }

    override suspend fun getCountry(code: String): DetailedCountry? {
        return apolloClient
            .query(CountryQuery(code))
            .execute()
            .data
            ?.country
            ?.toDetailedCountry()
    }
}