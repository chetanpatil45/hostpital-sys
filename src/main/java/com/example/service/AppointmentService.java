package com.example.service;

import com.example.models.Appointment;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class AppointmentService {
    private final static Logger logger = LoggerFactory.getLogger(AppointmentService.class);
    public Appointment getAppointment(long id){
        try {
            System.out.println("INTO SERVICE LAYER [ GET Appointment ] WITH ID :: "+ id);
        }catch (Exception e){
            logger.error("NO APPOINTMENT FOUND WITH ID {} :: {} ",id, e.getMessage());
//            e.printStackTrace();
        }

        return null;
    }

    public List<Appointment> getAllAppointment(){
        try {
            System.out.println("INTO SERVICE LAYER [GET ALL Appointment ] WITH ID :: ");
        }catch (Exception e){
            logger.error("NO APPOINTMENT'S FOUND :: {} ", e.getMessage());
//            e.printStackTrace();
        }

        return null;
    }

    public Appointment saveAppointment(Appointment appointment){
        try {
            System.out.println("INTO SERVICE LAYER [ SAVE METHOD ]  WITH ID :: ");
        }catch (Exception e){
            logger.error("UNABLE TO ADD APPOINTMENT WITH ID {} :: {} ",appointment.getId(), e.getMessage());
//            e.printStackTrace();
        }

        return null;
    }

    public Appointment updateAppointment(Long id, Appointment appointment){
        try {
            System.out.println("INTO SERVICE LAYER [ UPDATE METHOD ]");
        }catch (Exception e){
            logger.error("UNABLE TO UPDATE APPOINTMENT WITH ID {} :: {} ",appointment.getId(), e.getMessage());
//            e.printStackTrace();
        }

        return null;
    }

    public boolean deleteAppointment(long id){
        try {
            System.out.println("INTO SERVICE LAYER [ DELETE METHOD ]  WITH ID :: "+id);
        }catch (Exception e){
            logger.error("UNABLE TO DELETE APPOINTMENT WITH ID {} :: {} ", id, e.getMessage());
//            e.printStackTrace();
        }
        return false;
    }
}
