package com.kodilla.stream.world;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;

public final class World {
    private final List<Continent> listOfContinents = new ArrayList<>();

    public void addContinent(Continent continent) {
        listOfContinents.add(continent);
    }

    public List<Continent> getListOfContinets() {
        return new ArrayList<>(listOfContinents);
    }

    public BigDecimal getPeopleQuantity() {
        BigDecimal peopleQuantity = listOfContinents.stream()
                .flatMap(continent -> continent.getCountriesOfTheContinent().stream())
                .map(Country::getPeopleQuantity)
                .reduce(BigDecimal.ZERO, (sum, current) -> sum.add(current));
        return peopleQuantity;
    }
}
