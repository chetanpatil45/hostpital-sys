package com.example.controllers;

import com.example.models.Appointment;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/v1/appointment")
public class AppointmentContoller {

    @GetMapping
    public List<Appointment> getAllAppointments(){ //fetch records of all patients
        System.out.println("-> FETCHING THE APPOINTMENTS");
        return null;
    }

    @GetMapping("/{id}")
    public Appointment getAppointment(@PathVariable Long id){
        System.out.println("-> FETCHING DETAILS OF APPOINTMENT");
        return null;
    }

    @PostMapping
    public Appointment saveAppointment(@RequestBody Appointment appointment){
        System.out.println("-> CREATING APPOINTMENT ");
        return null;
    }

    @PutMapping("/{id}")
    public Appointment updateAppointment(@RequestBody Appointment appointment, @PathVariable Long id){
        System.out.println("-> UPDATING APPOINTMENT");
        return null;
    }

    @DeleteMapping("/{id}")
    public String deleteAppointment(@PathVariable Long id){
        System.out.println("-> DELETING APPOINTMENT");
        return null;
    }


}
