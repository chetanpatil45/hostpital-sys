package com.example.service;

import com.example.models.Doctor;
import com.example.repository.DoctorRepository;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class DoctorService {

    private static final Logger logger = LoggerFactory.getLogger(DoctorService.class);

    @Autowired
    private DoctorRepository repository;

    public Doctor getDoctor(long id){
        try {
            return repository.findById(id).orElse(null);
        }catch (Exception e){
            logger.error("No Doctor Found with Id {} :: {}",id,e.getMessage());
//            e.printStackTrace();
        }

        return null;
    }

    public List<Doctor> getAllDoctors(){
        try {
            return repository.findAll();
        }catch (Exception e){
            logger.error("No Doctors Found :: {}",e.getMessage());
        }
        return null;
    }

    public Doctor saveDoctor(Doctor doctor){
        try {
            return repository.save(doctor);
        }catch (Exception e){
            logger.error("Unable to Save Doctor with Id {} :: {}",doctor.getId(),e.getMessage());
        }
        return null;
    }

    public Doctor updateDoctor(Long id, Doctor doctor){
        try {
            if (repository.existsById(id)){
                return repository.findById(id).map(existingDoctor -> {
                    existingDoctor.setName(doctor.getName());
                    existingDoctor.setAge(doctor.getAge());
                    existingDoctor.setSpeciality(doctor.getSpeciality());
                    return repository.save(existingDoctor);
                }).orElse(null);
            }else
                logger.error("Doctor with Id {} not exist, can't be updated",id);
        }catch (Exception e){
            logger.error("Unable to Update Doctor with Id {} :: {}",doctor.getId(),e.getMessage());
        }
        return null;
    }

    public boolean deleteDoctor(long id){
        try {
            if (repository.existsById(id)){
                repository.deleteById(id);
                return true;
            }
            else logger.error("Doctor with Id {} not exist, can't be deleted",id);
        }catch (Exception e){
            logger.error("Unable to Delete Doctor with Id {} :: {}",id,e.getMessage());
        }
        return false;
    }
}
