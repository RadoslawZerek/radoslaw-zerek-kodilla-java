package com.kodilla.stream.world;

import java.math.BigDecimal;
import java.util.Set;

public final class World {
    private final Set<Continent> collectionOfContinents;

    public World(Set<Continent> collectionOfContinents) {
        this.collectionOfContinents = collectionOfContinents;
    }
    public Set<Continent> getListOfContinents() {
        return collectionOfContinents;
    }
    public BigDecimal getPeopleQuantity() {
        return collectionOfContinents.stream()
                .flatMap(continent -> continent.getListOfCountries().stream())
                .map(Country::getPeopleQuantity)
                .reduce(BigDecimal.ZERO, (sum, current) -> sum = sum.add(current));
    }
}
