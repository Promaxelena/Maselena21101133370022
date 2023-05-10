package com.javaguides.springbootrestfulcrudapp.controller;

import com.javaguides.springbootrestfulcrudapp.exception.ResourceNotFoundException;
import com.javaguides.springbootrestfulcrudapp.model.Compliance;
import com.javaguides.springbootrestfulcrudapp.repository.ComplianceRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("api/v1/compliances")
public class ComplianceController {

    @Autowired
    private ComplianceRepository complianceRepository;

    @GetMapping
    public List<Compliance> getAllCompliances(){
        return complianceRepository.findAll();

    }
    // CREATE API
    @PostMapping
    public Compliance createCompliance(@RequestBody Compliance compliance){
        return complianceRepository.save(compliance);
    }

    // read byId
    @GetMapping("{id}")
    public ResponseEntity<Compliance> getComplianceById(@PathVariable long id){
        Compliance compliance = complianceRepository.findById(id).orElseThrow(() -> new ResourceNotFoundException("compliance does not exist with id:" + id));
        return ResponseEntity.ok(compliance);
    }

    // UPDATE API
 //   @PutMapping("{id}")
    //public ResponseEntity<Compliance> updateCompliance(@PathVariable long id, @RequestBody Compliance complianceDetails){
     //   Compliance compliance = complianceRepository.findById(id).orElseThrow(() -> new ResourceNotFoundException("compliance does not exist with id:" + id));


    //}



// DELETE API

@DeleteMapping("{id}")
    public ResponseEntity<HttpStatus> deleteCompliance(@PathVariable long id){

        Compliance compliance = complianceRepository.findById(id).orElseThrow(() -> new ResourceNotFoundException("compliance not exist with id:" + id));

        complianceRepository.delete(compliance);

        return  new ResponseEntity<>(HttpStatus.NO_CONTENT);
    }
}
