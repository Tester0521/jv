package com.tester0521.cities;

import java.util.*;
import java.util.stream.Collectors;

public class City implements Cloneable {
    private String name;
    private List<Way> ways = new ArrayList<>();

    public City(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public List<Way> getWays() {
        return new ArrayList<>(ways);
    }

    public void putWay(City city, int cost) {
        ways.forEach( way -> {
            if (way.getCity() == city) { way.setCost(cost); return; }
        });

        ways.add(new Way(city, cost));
    }

    public void putWay(Way way) {
        putWay(way.getCity(), way.getCost());
    }

    public void removeWay(City city){
        ways
            .stream()
            .filter(way -> way.getCity() == city)
            .collect(Collectors.toList());
    }

    public boolean checkWay(City city) {
        return ways.stream().anyMatch( way -> way.getCity() == city );
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof City city) ) return false;
        if (o == null || getClass() != o.getClass()) return false;

        return Objects.equals(name, city.name) && Objects.equals(ways, city.ways);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, ways);
    }

    // @Override
    // public City clone() throws CloneNotSupportedException {
    //     try {
    //         City clone = (City) super.clone();
    //         clone.ways = ways.stream().collect(Collectors.toList());

    //         return clone;
    //     } catch (CloneNotSupportedException e) {
    //         throw new CloneNotSupportedException();
    //     }
    // }

    public City clone() {
        City clone = new City(this.name);
        clone.ways = ways.stream().collect(Collectors.toList());
        return clone;
    }

    public String toString() {
        return name + "\n\n" + ways;
    }
}
   
