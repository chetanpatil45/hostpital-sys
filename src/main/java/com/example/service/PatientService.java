package com.example.service;

import com.example.models.Patient;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class PatientService {

    private static final Logger logger = LoggerFactory.getLogger(PatientService.class);

    public Patient getPatient(long id){
        try {
            System.out.println("INTO SERVICE LAYER WITH ID :: "+ id);
        }catch (Exception e){
//            e.printStackTrace();
            logger.error("Patient not found with id {} :: {}",id,e.getMessage());
        }

        return null;
    }

    public List<Patient> getAllPatients(){
        try {
            System.out.println("INTO SERVICE LAYER WITH ID :: ");
        }catch (Exception e){
            logger.error("Unable to Find Any Patient :: {}",e.getMessage());
//            e.printStackTrace();
        }

        return null;
    }

    public Patient savePatient(Patient patient){
        try {
            System.out.println("INTO SERVICE LAYER [ SAVE METHOD ]  WITH ID :: ");
        }catch (Exception e){
            logger.error("Unable to Save Patient with id {} :: {}",patient.getId(),e.getMessage());

//            e.printStackTrace();
        }

        return null;
    }

    public Patient updatePatient(Long id, Patient patient){
        try {
            System.out.println("INTO SERVICE LAYER [ UPDATE METHOD ]");
        }catch (Exception e){
//            e.printStackTrace();
            logger.error("Unable to Update Patient with id {} :: {}",patient.getId(),e.getMessage());
        }

        return null;
    }

    public boolean deletePatient(long id){
        try {
            System.out.println("INTO SERVICE LAYER [ DELETE METHOD ]  WITH ID :: "+id);
        }catch (Exception e){
            logger.error("Unable to Delete Patient with id {} :: {}",id,e.getMessage());
//            e.printStackTrace();
        }
        return false;
    }
}
