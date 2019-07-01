package com.kodilla.stream.world;

import java.util.ArrayList;
import java.util.List;

public final class Continent {
    private final String continentName;
    private final List<Country> countriesOfTheContinent;

    public Continent(final String continentName) {
        this.continentName = continentName;
        this.countriesOfTheContinent = new ArrayList<>();
    }

    public void addCountry(Country country) {
        countriesOfTheContinent.add(country);
    }

    public String getContinentName() {
        return continentName;
    }

    public List<Country> getCountriesOfTheContinent() {
        return countriesOfTheContinent;
    }
}
