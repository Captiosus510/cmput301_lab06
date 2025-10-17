package com.example.listycity;

/**
* This is a class that defines a City.
*/
public class City implements Comparable<City>{
    private String city;
    private String province;

    /**
     * This creates a new city.
     * @param city the name of the city.
     * @param province the name of the province.
     */
    public City(String city, String province){
        this.city = city;
        this.province = province;
    }
    /**
     * This returns the name of the city.
     * @return
     * Return the name of the city.
     */
    public String getCityName(){
        return this.city;
    }
    /**
     * This returns the name of the province.
     * @return
     * Return the name of the province.
     */
    public String getProvinceName(){
        return this.province;
    }

    /**
     * This compares two cities.
     * @param o the object to be compared.
     * @return a negative integer, zero, or a positive integer as this object is less than, equal to, or greater than the specified object.
     */
    @Override
    public int compareTo(City o) {
        return this.city.compareTo(o.getCityName()); // this.city refers to the city name
    }

    /**
     * This returns a string representation of the city.
     * @param o the object to be compared.
     * @return a string representation of the city.
     */
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