package com.example.service;

import com.example.models.Appointment;

import java.util.List;

public class AppointmentService {
    public Appointment getAppointment(long id){
        try {
            System.out.println("INTO SERVICE LAYER [ GET Appointment ] WITH ID :: "+ id);
        }catch (Exception e){
            e.printStackTrace();
        }

        return null;
    }

    public List<Appointment> getAllAppointment(){
        try {
            System.out.println("INTO SERVICE LAYER [GET ALL Appointment ] WITH ID :: ");
        }catch (Exception e){
            e.printStackTrace();
        }

        return null;
    }

    public Appointment saveAppointment(Appointment appointment){
        try {
            System.out.println("INTO SERVICE LAYER [ SAVE METHOD ]  WITH ID :: ");
        }catch (Exception e){
            e.printStackTrace();
        }

        return null;
    }

    public Appointment updateAppointment(Appointment appointment){
        try {
            System.out.println("INTO SERVICE LAYER [ UPDATE METHOD ]");
        }catch (Exception e){
            e.printStackTrace();
        }

        return null;
    }

    public boolean deleteAppointment(long id){
        try {
            System.out.println("INTO SERVICE LAYER [ DELETE METHOD ]  WITH ID :: "+id);
        }catch (Exception e){
            e.printStackTrace();
        }
        return false;
    }
}
