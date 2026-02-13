package com.example.controllers;

import com.example.models.Doctor;
import com.example.service.DoctorService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/v1/doctor")
public class DoctorController {

    @Autowired
    private DoctorService service;


    @GetMapping
    public List<Doctor> getAllDoctors(){ //fetch records of all DOCTORS
        System.out.println("-> FETCHING THE DOCTORS");
        return service.getAllDoctors();
    }

    @GetMapping("/{id}")
    public Doctor getDoctor(@PathVariable Long id){
        System.out.println("-> FETCHING DETAILS OF DOCTOR");
        return service.getDoctor(id);
    }

    @PostMapping
    public Doctor saveDoctor(@RequestBody Doctor doctor){
        System.out.println("-> CREATING DOCTOR ");
        return service.saveDoctor(doctor);
    }

    @PutMapping("/{id}")
    public Doctor updateDoctor(@RequestBody Doctor doctor, @PathVariable Long id){
        System.out.println("-> UPDATING DOCTOR");
        return service.updateDoctor(id,doctor);
    }

    @DeleteMapping("/{id}")
    public String deleteDoctor(@PathVariable Long id){
        System.out.println("-> DELETING DOCTOR");
        return service.deleteDoctor(id) ? "Deleted":"Failed";
    }
}
