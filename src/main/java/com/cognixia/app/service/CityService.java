package com.cognixia.app.service;

import java.util.List;

import javax.transaction.Transactional;
 
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.cognixia.app.model.City;
import com.cognixia.app.repository.CityRepository;

 
@Service
@Transactional
public class CityService {
 
    @Autowired
    private CityRepository repo;
     
    public List<City> listAll() {
        return repo.findAll();
    }
     
     public City get(Integer Cityid) {
        return repo.findById(Cityid).get();
    }
    
    public void save(City city) {
        repo.save(city);
    }
       
    public void delete(Integer cityid) {
        repo.deleteById(cityid);
    }
}