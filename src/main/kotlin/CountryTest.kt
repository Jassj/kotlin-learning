class CountryTest {

    fun isBigEuropeanCountry(country: Country): Boolean {
        return country.continient == "EU" && country.population > 10000
    }

    fun isChina(country: Country): Boolean {
        return country.continient == "CH"
    }

}