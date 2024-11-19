package com.tester0521.cities;

import java.util.*;

public class City {
    private String name;
    private List<Way> ways = new ArrayList<>();

    public City(String name){
        this.name = name;
    }

    public String getName(){
        return name;
    }

    public List<Ways> getWays(){
        return new ArrayList<>(ways);
    }

    public void putWay(City city, int cost){
        ways
            .stream()
            .map( way -> (way.getCity() == city) ? {way.cost = cost; return} : null )
            .collect(Collectors.toList());

        ways.add(new Way(city, cost));
    }

    public void removeWay(City city){
        ways
            .stream()
            .filter(way -> way.getCity == city)
            .collect(Collectors.toList());
    }

    public boolean checkWay(City city) {
        ways
            .stream()
            .map(way -> {
                if (way.getCity == city) return true
            }).collect(Collectors.toList());

        return false;
    }

    public String toString() {
        return name + "\n\n" + ways;
    }
}
   
