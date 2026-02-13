package com.example.controllers;

import com.example.models.Appointment;
import com.example.service.AppointmentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/v1/appointment")
public class AppointmentContoller {

    @Autowired
    private AppointmentService service;

    @GetMapping
    public List<Appointment> getAllAppointments(){ //fetch records of all patients
        System.out.println("-> FETCHING THE APPOINTMENTS");
        return service.getAllAppointment();
    }

    @GetMapping("/{id}")
    public Appointment getAppointment(@PathVariable Long id){
        System.out.println("-> FETCHING DETAILS OF APPOINTMENT");
        return service.getAppointment(id);
    }

    @PostMapping
    public Appointment saveAppointment(@RequestBody Appointment appointment){
        System.out.println("-> CREATING APPOINTMENT ");
        return service.saveAppointment(appointment);
    }

    @PutMapping("/{id}")
    public Appointment updateAppointment(@RequestBody Appointment appointment, @PathVariable Long id){
        System.out.println("-> UPDATING APPOINTMENT");
        return service.updateAppointment(id,appointment);
    }

    @DeleteMapping("/{id}")
    public String deleteAppointment(@PathVariable Long id){
        System.out.println("-> DELETING APPOINTMENT");
        return service.deleteAppointment(id) ? "Deleted":"Failed";
    }


}
