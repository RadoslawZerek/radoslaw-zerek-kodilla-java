package com.kodilla.streamworld;

import com.kodilla.stream.world.Continent;
import com.kodilla.stream.world.Country;
import com.kodilla.stream.world.World;
import org.junit.jupiter.api.Test;
import java.math.BigDecimal;
import java.util.HashSet;
import java.util.Set;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class WorldTestSuite {

    @Test
    void testGetPeopleQuantity() {
        //Given
        Set<Country> europeCountries = new HashSet<>();
        Set<Country> asiaCountries = new HashSet<>();
        Set<Country> africaCountries = new HashSet<>();
        Country china = new Country(new BigDecimal("1439323776"));
        Country india = new Country(new BigDecimal("1380004385"));
        Country japan = new Country(new BigDecimal("126476461"));
        Country nigeria = new Country(new BigDecimal("206139589"));
        Country ethiopia = new Country(new BigDecimal("114963588"));
        Country germany = new Country(new BigDecimal("83783942"));
        Country france = new Country(new BigDecimal("65273511"));
        Country italy = new Country(new BigDecimal("60641826"));
        europeCountries.add(germany);
        europeCountries.add(italy);
        europeCountries.add(france);
        asiaCountries.add(china);
        asiaCountries.add(india);
        asiaCountries.add(japan);
        africaCountries.add(nigeria);
        africaCountries.add(ethiopia);
        Continent europe = new Continent(europeCountries);
        Continent asia = new Continent(asiaCountries);
        Continent africa = new Continent(africaCountries);
        Set<Continent> alldContinents = new HashSet<>();
        alldContinents.add(europe);
        alldContinents.add(asia);
        alldContinents.add(africa);
        World world = new World(alldContinents);

        //When
        BigDecimal quantityOfPeople = world.getPeopleQuantity();
        BigDecimal expected = new BigDecimal("3476607078");

        //Then
        assertEquals(expected, quantityOfPeople);
    }
}
