package com.example.controllers;

import com.example.models.Appointment;
import com.example.service.AppointmentService;
import com.example.service.WebhookService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Objects;

@RestController
@RequestMapping("/api/v1/appointment")
public class AppointmentController {

    @Autowired
    private AppointmentService service;

    @Autowired
    private WebhookService webhookService;

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
    public Appointment saveAppointment(@RequestBody Appointment requAppointment){
        System.out.println("-> CREATING APPOINTMENT ");
        Appointment appointment =  service.saveAppointment(requAppointment);

        Map<String, Object> payload = new HashMap<>();

        payload.put("ID",appointment.getId());
        payload.put("PATIENT-ID",appointment.getPatientId());
        payload.put("DOCTOR-ID",appointment.getDoctorId());
        payload.put("DATE",appointment.getDate());

        String webhookURL = "http://localhost:8082/webhook";

        webhookService.sendWebhook(webhookURL,payload);
        return appointment;
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
