package com.example.service;

import com.example.models.Doctor;

import java.util.List;

public class DoctorService {
    public Doctor getDoctor(long id){
        try {
            System.out.println("INTO SERVICE LAYER [ GET DOCTOR ] WITH ID :: "+ id);
        }catch (Exception e){
            e.printStackTrace();
        }

        return null;
    }

    public List<Doctor> getAllDoctors(){
        try {
            System.out.println("INTO SERVICE LAYER [GET ALL DOCTORS ] WITH ID :: ");
        }catch (Exception e){
            e.printStackTrace();
        }

        return null;
    }

    public Doctor saveDoctor(Doctor doctor){
        try {
            System.out.println("INTO SERVICE LAYER [ SAVE METHOD ]  WITH ID :: ");
        }catch (Exception e){
            e.printStackTrace();
        }

        return null;
    }

    public Doctor updateDoctor(Doctor doctor){
        try {
            System.out.println("INTO SERVICE LAYER [ UPDATE METHOD ]");
        }catch (Exception e){
            e.printStackTrace();
        }

        return null;
    }

    public boolean deleteDoctor(long id){
        try {
            System.out.println("INTO SERVICE LAYER [ DELETE METHOD ]  WITH ID :: "+id);
        }catch (Exception e){
            e.printStackTrace();
        }
        return false;
    }
}
