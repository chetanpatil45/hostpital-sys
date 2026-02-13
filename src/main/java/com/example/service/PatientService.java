package com.example.service;

import com.example.models.Patient;
import jakarta.persistence.Id;

import java.util.List;

public class PatientService {


    public Patient getPatient(long id){
        try {
            System.out.println("INTO SERVICE LAYER WITH ID :: "+ id);
        }catch (Exception e){
            e.printStackTrace();
        }

        return null;
    }

    public List<Patient> getAllPatients(){
        try {
            System.out.println("INTO SERVICE LAYER WITH ID :: ");
        }catch (Exception e){
            e.printStackTrace();
        }

        return null;
    }

    public Patient savePatient(Patient patient){
        try {
            System.out.println("INTO SERVICE LAYER [ SAVE METHOD ]  WITH ID :: ");
        }catch (Exception e){
            e.printStackTrace();
        }

        return null;
    }

    public Patient updatePatient(Patient patient){
        try {
            System.out.println("INTO SERVICE LAYER [ UPDATE METHOD ]");
        }catch (Exception e){
            e.printStackTrace();
        }

        return null;
    }

    public boolean deletePatient(long id){
        try {
            System.out.println("INTO SERVICE LAYER [ DELETE METHOD ]  WITH ID :: "+id);
        }catch (Exception e){
            e.printStackTrace();
        }
        return false;
    }
}
