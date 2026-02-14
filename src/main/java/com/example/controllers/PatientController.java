package com.example.controllers;

import com.example.models.Patient;
import com.example.service.PatientService;
import org.aspectj.apache.bcel.generic.RET;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.concurrent.RecursiveTask;

@RestController
@RequestMapping("/api/v1/patient")
public class PatientController {

    @Autowired
    private PatientService service;

    @GetMapping
    public Page<Patient> getAllPatient(@RequestParam(defaultValue = "0") int page,
                                       @RequestParam(defaultValue = "5") int size){ //fetch records of all patients
        System.out.println("-> FETCHING THE PATIENTS");
        return service.getAllPatients(page, size);
    }

    @GetMapping("/{id}")
    public Patient getPatient(@PathVariable Long id){
        System.out.println("-> FETCHING DETAILS OF PATIENT");
        return service.getPatient(id);
    }

    @PostMapping
    public Patient savePatient(@RequestBody Patient patient){
        System.out.println("-> CREATING PATIENT ");
        return service.savePatient(patient);
    }

    @PutMapping("/{id}")
    public Patient updatePatient(@RequestBody Patient patient, @PathVariable Long id){
        System.out.println("-> UPDATING PATIENT");
        return service.updatePatient(id,patient);
    }

    @DeleteMapping("/{id}")
    public String deletePatient(@PathVariable Long id){
        System.out.println("-> DELETING PATIENT");
        return service.deletePatient(id) ? " Deleted" : "Failed" ;
    }

}
