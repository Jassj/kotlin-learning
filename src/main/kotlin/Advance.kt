data class Country(
    val name: String,
    val continient: String,
    val population: Int)

fun filterCountries(
    countries: List<Country>,
    test: (Country) -> Boolean): List<Country> // 增加了⼀个函数类型的参数
{
    val res = mutableListOf<Country>()
    for (c in countries) {
        if (test(c)) { // 直接调⽤test来进⾏筛选
            res.add(c)
        }
    }
    return res
}

fun main() {
    val country1 = Country("lucy", "EU", 20000)
    val country2 = Country("chenshuwen", "CH", 100)
    val countries : List<Country> = mutableListOf(country1, country2)
    val countryTest = CountryTest()
    val result1 = filterCountries(countries, countryTest::isBigEuropeanCountry)
    result1.forEach(::println)

    val result2 = filterCountries(countries, countryTest::isChina)
    result2.forEach(::println)
}