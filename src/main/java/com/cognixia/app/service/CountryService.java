package com.cognixia.app.service;

import java.util.List;

import javax.transaction.Transactional;
 
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.cognixia.app.model.Country;
import com.cognixia.app.repository.CountryRepository;
 
@Service
@Transactional
public class CountryService {
 
    @Autowired
    private CountryRepository repo;
     
    public List<Country> listAll() {
        return repo.findAll();
    }
     
     public Country get(Integer CountryId) {
        return repo.findById(CountryId).get();
    }
    
    public void save(Country country) {
        repo.save(country);
    }
       
    public void delete(Integer CountryId) {
        repo.deleteById(CountryId);
    }
}