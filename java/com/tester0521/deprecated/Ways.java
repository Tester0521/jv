package com.tester0521.deprecated;

public class Ways {
    private City city;
    int cost;

    public Ways(City city, int cost){
        this.city = city;
        this.cost = cost;
    }

    public City toDo(){
        return city;
    }

    public int getCost() {
        return cost;
    }

    public String toString(){
        return city.getName() + " - " + cost + "$";
    }
}