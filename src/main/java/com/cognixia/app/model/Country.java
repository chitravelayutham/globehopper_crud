package com.cognixia.app.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
 
@Entity
public class Country {
    private Integer Countryid; //Do not write CountryId == table column, hibernate adds a number for the second capital number
   	private String Name;
    private Integer Population;
    private String Continent;
    
    public Country() {
    }
 
    public Country(Integer id, String name, Integer population, String continent) {
        this.Countryid = id;
        this.Name = name;
        this.Population = population;
        this.Continent = continent;
    }
    
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    public Integer getCountryid() {
		return Countryid;
	}

	public void setCountryid(Integer countryId) {
		Countryid = countryId;
	}

	public String getName() {
		return Name;
	}

	public void setName(String name) {
		Name = name;
	}

	public Integer getPopulation() {
		return Population;
	}

	public void setPopulation(Integer population) {
		Population = population;
	}

	public String getContinent() {
		return Continent;
	}

	public void setContinent(String continent) {
		Continent = continent;
	}
 
       
        
  }
