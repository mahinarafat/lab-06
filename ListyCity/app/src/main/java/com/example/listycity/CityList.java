package com.example.listycity;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/**
 * This is a class that keeps track of a list of city objects
 */
public class CityList {
    private List<City> cities = new ArrayList<>();
    /**
     * This adds a city to the list if the city does not exist
     * @param city
     * This is a candidate city to add
     */
    public void add(City city) {
        if (cities.contains(city)) {
            throw new IllegalArgumentException();
        }
        cities.add(city);
    }

    /**
     * This returns a sorted list of cities
     * @return list
     * Return the sorted list
     */
    public List<City> getCities() {
        List<City> list = cities;
        Collections.sort(list);
        return list;
    }
    /**
     * This returns true if city is in list, false otherwise 
     * @return boolen
     * Return true or false
     */
    public  boolean hasCity(City city){
        return cities.contains((city));
    }

    /**
     * This removes city if in list, throws exception if not
     * @param City
     * @return None
     */
    public void removeCity(City city){
        if (cities.contains(city)){
            cities.remove(city);
        }
        else {
            throw new IllegalArgumentException("city not in list");
        }
    }

    /**
     * This counts cities in list
     * @return city number
     */
    public int city_num(){
        return cities.size();
    }
}
