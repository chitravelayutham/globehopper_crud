package com.cognixia.app.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.cognixia.app.model.Country;


public interface CountryRepository extends JpaRepository<Country, Integer> {
 
}