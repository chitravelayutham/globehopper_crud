package com.cognixia.app.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
 
@Entity
public class City {
    private Integer Cityid; //Do not write CountryId == table column, hibernate adds a number for the second capital number
   	private String Name;
    private Integer Countryid;
    private Integer Capital;
    private String firstlandmark;
    private String secondlandmark;
    private String thirdlandmark;
    
    
    public City() {
    }
 
    public City(Integer id, String name, Integer countryid, Integer capital, String firstlandmark, String secondlandmark, String thirdlandmark) {
    	this.Cityid = id;
    	this.Name = name;
        this.Countryid = countryid;
        this.Capital = capital;
        this.firstlandmark = firstlandmark;
        this.secondlandmark = secondlandmark;
        this.thirdlandmark = thirdlandmark;
    }

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    public Integer getCityid() {
		return Cityid;
	}

	public void setCityid(Integer cityid) {
		Cityid = cityid;
	}

	public String getName() {
		return Name;
	}

	public void setName(String name) {
		Name = name;
	}

	public Integer getCountryid() {
		return Countryid;
	}

	public void setCountryid(Integer countryid) {
		Countryid = countryid;
	}

	public Integer getCapital() {
		return Capital;
	}

	public void setCapital(Integer capital) {
		Capital = capital;
	}

	public String getFirstLandmark() {
		return firstlandmark;
	}

	public void setFirstLandmark(String firstLandmark) {
		firstlandmark = firstLandmark;
	}

	public String getSecondLandmark() {
		return secondlandmark;
	}

	public void setSecondLandmark(String secondLandmark) {
		secondlandmark = secondLandmark;
	}

	public String getThirdLandmark() {
		return thirdlandmark;
	}

	public void setThirdLandmark(String thirdLandmark) {
		thirdlandmark = thirdLandmark;
	}
      
  }
