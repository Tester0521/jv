package com.tester0521.deprecated;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

public class City {
    private String name;
    List<Ways> ways = new ArrayList<>();

    public City(String name){
        this.name = name;
    }

    public String getName(){
        return name;
    }

    public List<Ways> getWays(){
        return new ArrayList<>(ways);
    }

    public void putWays(City city, int cost){
        for(int i = 0; i < ways.size(); i++){
            if(ways.get(i).toDo() == city) {
                ways.get(i).cost = cost;
                return;
            }
        }
        ways.add(new Ways(city, cost));
    }

    public void removeWays(City city){
        for(int i = 0; i < ways.size(); i++){
            if(ways.get(i).toDo() == city) ways.remove(i);
        }
    }

    public boolean checkToDo(City city) {
        for (Ways way : ways) {
            if (way.toDo() == city)  return true;
        }
        return false;
    }

    public String toString(){
        return name + "\n \\ \n" + ways;
    }

}
