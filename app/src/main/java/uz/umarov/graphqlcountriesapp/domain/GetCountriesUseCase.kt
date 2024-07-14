package uz.umarov.graphqlcountriesapp.domain

class GetCountriesUseCase(private val countryClient: CountryClient) {
    suspend fun execute(): List<SimpleCountry> = countryClient.getCountries().sortedBy { it.name }

}