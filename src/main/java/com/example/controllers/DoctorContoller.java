package com.example.controllers;

import com.example.models.Doctor;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/v1/doctor")
public class DoctorContoller {
    @GetMapping
    public List<Doctor> getAllDoctors(){ //fetch records of all DOCTORS
        System.out.println("-> FETCHING THE DOCTORS");
        return null;
    }

    @GetMapping("/{id}")
    public Doctor getDoctor(@PathVariable Long id){
        System.out.println("-> FETCHING DETAILS OF DOCTOR");
        return null;
    }

    @PostMapping
    public Doctor saveDoctor(@RequestBody Doctor doctor){
        System.out.println("-> CREATING DOCTOR ");
        return null;
    }

    @PutMapping("/{id}")
    public Doctor updateDoctor(@RequestBody Doctor doctor, @PathVariable Long id){
        System.out.println("-> UPDATING DOCTOR");
        return null;
    }

    @DeleteMapping("/{id}")
    public String deleteDoctor(@PathVariable Long id){
        System.out.println("-> DELETING DOCTOR");
        return null;
    }
}
