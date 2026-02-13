package com.example.service;

import com.example.models.Doctor;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class DoctorService {

    private static final Logger logger = LoggerFactory.getLogger(DoctorService.class);


    public Doctor getDoctor(long id){
        try {
            System.out.println("INTO SERVICE LAYER [ GET DOCTOR ] WITH ID :: "+ id);
        }catch (Exception e){
            logger.error("No Doctor Found with Id {} :: {}",id,e.getMessage());
//            e.printStackTrace();
        }

        return null;
    }

    public List<Doctor> getAllDoctors(){
        try {
            System.out.println("INTO SERVICE LAYER [GET ALL DOCTORS ] WITH ID :: ");
        }catch (Exception e){
            logger.error("No Doctors Found :: {}",e.getMessage());
//            e.printStackTrace();
        }

        return null;
    }

    public Doctor saveDoctor(Doctor doctor){
        try {
            System.out.println("INTO SERVICE LAYER [ SAVE METHOD ]  WITH ID :: ");
        }catch (Exception e){
            logger.error("Unable to Save Doctor with Id {} :: {}",doctor.getId(),e.getMessage());
//            e.printStackTrace();
        }

        return null;
    }

    public Doctor updateDoctor(Long id, Doctor doctor){
        try {
            System.out.println("INTO SERVICE LAYER [ UPDATE METHOD ]");
        }catch (Exception e){
            logger.error("Unable to Update Doctor with Id {} :: {}",doctor.getId(),e.getMessage());
//            e.printStackTrace();
        }

        return null;
    }

    public boolean deleteDoctor(long id){
        try {
            System.out.println("INTO SERVICE LAYER [ DELETE METHOD ]  WITH ID :: "+id);
        }catch (Exception e){
            logger.error("Unable to Delete Doctor with Id {} :: {}",id,e.getMessage());
//            e.printStackTrace();
        }
        return false;
    }
}
