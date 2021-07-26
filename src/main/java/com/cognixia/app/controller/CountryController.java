package com.cognixia.app.controller;


import java.util.*;

import org.springframework.beans.factory.annotation.*;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import com.cognixia.app.model.Country;
import com.cognixia.app.service.CountryService;
 
@RestController
public class CountryController {
 
    @Autowired
    private CountryService service;
     
    // RESTful API methods for Retrieval operations
    @GetMapping("/country")
    public List<Country> list() {
        return service.listAll();
    }
    
    
    @GetMapping("/country/{id}")
    public ResponseEntity<Country> get(@PathVariable Integer id) {
        try {
            Country country = service.get(id);
            return new ResponseEntity<Country>(country, HttpStatus.OK);
        } catch (NoSuchElementException e) {
            return new ResponseEntity<Country>(HttpStatus.NOT_FOUND);
        }      
    }
    
    
    // RESTful API method for Create operation     Note: This will work as Update operation too, so careful when you dont want to update exisng data
    @PostMapping("/country")
    public void add(@RequestBody Country country) {
        service.save(country);
    }
     
    // RESTful API method for Update operation
    @PutMapping("/country/{id}")
    public ResponseEntity<?> update(@RequestBody Country country, @PathVariable Integer id) {
        try {
            Country existCountry = service.get(id);  // this will ensure that: id in db == id in the url
            service.save(country);
            return new ResponseEntity<>(HttpStatus.OK);
        } catch (NoSuchElementException e) {
            return new ResponseEntity<>(HttpStatus.NOT_FOUND);
        }      
    }
    
    
    // RESTful API method for Delete operation
    @DeleteMapping("/country/{id}")
    public void delete(@PathVariable Integer id) {
        service.delete(id);
    }
}
