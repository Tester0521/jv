package com.tester0521.cities;

public class Way implements Cloneable {
    private City city;
    private int cost;

    public Way(City city, int cost){
        this.city = city;
        this.cost = cost;
    }

    public Way(City city) {
        this(city, 52);
    }

    public City getCity(){
        return city;
    }

    public int getCost() {
        return cost;
    }

    public void setCost(int cost) {
        this.cost = cost;
    }

    // @Override
    // protected Way clone() throws CloneNotSupportedException {
    //     return (Way) super.clone();
    // }

    public String toString(){
        return city.getName() + " - " + "$" + cost;
    }
}