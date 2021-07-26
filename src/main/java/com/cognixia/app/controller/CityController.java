package com.cognixia.app.controller;


import java.util.*;

import org.springframework.beans.factory.annotation.*;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import com.cognixia.app.model.City;
import com.cognixia.app.model.Country;
import com.cognixia.app.service.CityService;
import com.cognixia.app.service.CountryService;
 
@RestController
public class CityController {
 
    @Autowired
    private CityService service;
     
    // RESTful API methods for Retrieval operations
    @GetMapping("/city")
    public List<City> list() {
        return service.listAll();
    }
    
    
    @GetMapping("/city/{id}")
    public ResponseEntity<City> get(@PathVariable Integer id) {
        try {
        	City city = service.get(id);
            return new ResponseEntity<City>(city, HttpStatus.OK);
        } catch (NoSuchElementException e) {
            return new ResponseEntity<City>(HttpStatus.NOT_FOUND);
        }      
    }
    
    
    // RESTful API method for Create operation     Note: This will work as Update operation too, so careful when you dont want to update exisng data
    @PostMapping("/city")
    public void add(@RequestBody City city) {
        service.save(city);
    }
     
    // RESTful API method for Update operation
    @PutMapping("/city/{id}")
    public ResponseEntity<?> update(@RequestBody City city, @PathVariable Integer id) {
        try {
        	City existcity = service.get(id);  // this will ensure that: id in db == id in the url
            service.save(city);
            return new ResponseEntity<>(HttpStatus.OK);
        } catch (NoSuchElementException e) {
            return new ResponseEntity<>(HttpStatus.NOT_FOUND);
        }      
    }
    
    
    // RESTful API method for Delete operation
    @DeleteMapping("/city/{id}")
    public void delete(@PathVariable Integer id) {
        service.delete(id);
    }
}
