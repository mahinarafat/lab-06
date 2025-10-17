package com.example.listycity;

/**
 * This is a class that defines a City.
 */
public class City implements Comparable<City>{
    private String city;
    private String province;

    /**
     * This is the method that creates a City.
     * @param city name of city
     * @param province name of province
     */
    City(String city, String province){
        this.city = city;
        this.province = province;
    }
    /**
     * This is the method returns City name as string.
     */
    String getCityName(){
        return this.city;
    }

    /**
     * This is the method returns province name as string.
     */
    String getProvinceName(){
        return this.province;
    }

    /**
     * This is the method returns -1, 0, 1 depending on
     * alphabetical ordering of city name.
     */
    @Override
    public int compareTo(City o) {
        City city = (City) o;
        return this.city.compareTo(city.getCityName()); // this.city refers to the city name
    }
}

