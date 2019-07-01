
package com.kodilla.stream.world;

import org.junit.Assert;
import org.junit.Test;

import java.math.BigDecimal;

public class WorldTestSuite {
    @Test
    public void testGetPeopleQuantity() {
        // Given
        Continent europe = new Continent("Europe");
        europe.addCountry(new Country("Poland", new BigDecimal("38000000")));
        europe.addCountry(new Country("Russia", new BigDecimal("148000000")));
        europe.addCountry(new Country("Cyprus", new BigDecimal("346000")));

        Continent asia = new Continent("Asia");
        asia.addCountry(new Country("China", new BigDecimal("1600000000")));
        asia.addCountry(new Country("India", new BigDecimal("1500000000")));
        asia.addCountry(new Country("Japan", new BigDecimal("140000000")));

        Continent africa = new Continent("Africa");
        africa.addCountry(new Country("Mauretania", new BigDecimal("230000")));
        africa.addCountry(new Country("Madagaskar", new BigDecimal("1200000")));
        africa.addCountry(new Country("Lesotho", new BigDecimal("1345000")));

        World world = new World();
        world.addContinent(europe);
        world.addContinent(asia);
        world.addContinent(africa);

        // When
        BigDecimal resultPeopleQuantity = world.getPeopleQuantity();
        BigDecimal expectedPeopleQuantity = new BigDecimal("3429121000");

        // Then
        Assert.assertEquals(expectedPeopleQuantity, resultPeopleQuantity);
    }
}
