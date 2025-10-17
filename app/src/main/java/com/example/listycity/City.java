package com.example.listycity;

/**
* This is a class that defines a City.
*/
public class City implements Comparable<City>{
    private String city;
    private String province;
    public City(String city, String province){
        this.city = city;
        this.province = province;
    }
    public String getCityName(){
        return this.city;
    }
    public String getProvinceName(){
        return this.province;
    }

    @Override
    public int compareTo(City o) {
        return this.city.compareTo(o.getCityName()); // this.city refers to the city name
    }
    @Override
    public boolean equals(Object o) {
        if (o == this) {
            return true;
        }
        if (o == null || o.getClass() != this.getClass()) {
            return false;
        }
        City city = (City) o;
        return this.city.equals(city.getCityName()) && this.province.equals(city.getProvinceName());
    }
}