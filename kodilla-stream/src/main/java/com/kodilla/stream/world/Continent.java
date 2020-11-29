package com.kodilla.stream.world;

import java.util.ArrayList;
import java.util.List;

public final class Continent {

    private final String nameContinent;
    private final List<Country> countries = new ArrayList<>();

    public Continent(final String nameContinent) {
        this.nameContinent = nameContinent;
    }

    public void addCountry(Country country) {
        countries.add(country);
    }

    public List<Country> getCountries() {
        return countries;
    }
}
