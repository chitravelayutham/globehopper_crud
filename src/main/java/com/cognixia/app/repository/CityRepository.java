package com.cognixia.app.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.cognixia.app.model.City;


public interface CityRepository extends JpaRepository<City, Integer> {
 
}