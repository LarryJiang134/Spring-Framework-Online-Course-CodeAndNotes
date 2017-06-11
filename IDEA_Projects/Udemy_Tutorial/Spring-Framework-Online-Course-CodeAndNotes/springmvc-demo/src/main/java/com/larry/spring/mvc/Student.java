package com.larry.spring.mvc;

import java.util.LinkedHashMap;

/**
 * Created by hangyanjiang on 2017/6/11.
 */

public class Student {

    private String firstName;
    private String lastName;
    private String country;
    private LinkedHashMap<String, String> countryOptions;
    private String favoriteLanguage;

    public Student() {
        // populate country options: used ISO country code
        countryOptions = new LinkedHashMap<String, String>();

        countryOptions.put("CHN", "CHINA");
        countryOptions.put("USA", "AMERICA");
        countryOptions.put("RUS", "RUSSIA");
        countryOptions.put("UK", "BRITAIN");
        countryOptions.put("FRA", "FRANCE");
    }

    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public String getCountry() {
        return country;
    }

    public LinkedHashMap<String, String> getCountryOptions() {
        return countryOptions;
    }

    public String getFavoriteLanguage() {
        return favoriteLanguage;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public void setCountry(String country) {
        this.country = country;
    }

    public void setFavoriteLanguage(String favoriteLanguage) {
        this.favoriteLanguage = favoriteLanguage;
    }
}
