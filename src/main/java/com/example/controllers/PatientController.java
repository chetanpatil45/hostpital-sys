package com.example.controllers;

import com.example.models.Patient;
import org.aspectj.apache.bcel.generic.RET;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.concurrent.RecursiveTask;

@RestController
@RequestMapping("/api/v1/patient")
public class PatientController {

    @GetMapping
    public List<Patient> getAllPatient(){ //fetch records of all patients
        System.out.println("-> FETCHING THE PATIENTS");
        return null;
    }

    @GetMapping("/{id}")
    public Patient getPatient(@PathVariable Long id){
        System.out.println("-> FETCHING DETAILS OF PATIENT");
        return null;
    }

    @PostMapping
    public Patient savePatient(@RequestBody Patient patient){
        System.out.println("-> CREATING PATIENT ");
        return null;
    }

    @PutMapping("/{id}")
    public Patient updatePatient(@RequestBody Patient patient, @PathVariable Long id){
        System.out.println("-> UPDATING PATIENT");
        return null;
    }

    @DeleteMapping("/{id}")
    public String deletePatient(@PathVariable Long id){
        System.out.println("-> DELETING PATIENT");
        return null;
    }

}
