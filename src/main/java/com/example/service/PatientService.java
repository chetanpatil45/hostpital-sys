package com.example.service;

import com.example.models.Patient;
import com.example.repository.PatientRepository;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class PatientService {

    private static final Logger logger = LoggerFactory.getLogger(PatientService.class);

    @Autowired
    private PatientRepository repository;

    public Patient getPatient(long id){
        try {
            return repository.findById(id).orElse(null);
        }catch (Exception e){
            logger.error("Patient not found with id {} :: {}",id,e.getMessage());
        }

        return null;
    }

    public Page<Patient> getAllPatients(int page, int size){
        try {
            Pageable pageable = PageRequest.of(page,size);
            return repository.findAll(pageable);
        }catch (Exception e){
            logger.error("Unable to Find Any Patient :: {}",e.getMessage());
        }
        return null;
    }

    public Patient savePatient(Patient patient){
        try {
            return repository.save(patient);
        }catch (Exception e){
            logger.error("Unable to Save Patient with id {} :: {}",patient.getId(),e.getMessage());
        }

        return null;
    }

    public Patient updatePatient(Long id, Patient patient){
        try {
            if (repository.existsById(id)){
                return repository.findById(id).map(existingPatient -> {
                    existingPatient.setName(patient.getName());
                    existingPatient.setGender(patient.getGender());
                    existingPatient.setAge(patient.getAge());
                    return repository.save(existingPatient);
                }).orElse(null);
            }

            logger.error("Patient with this id {} is not present",patient.getId());
        }catch (Exception e){
//            e.printStackTrace();
            logger.error("Unable to Update Patient with id {} :: {}",patient.getId(),e.getMessage());
        }

        return null;
    }

    public boolean deletePatient(long id){
        try {
            if (repository.existsById(id)) {
                repository.deleteById(id);
                return true;
            }
            else logger.error("Patient with this id {} is not present, Can't be deleted", id);


        }catch (Exception e){
            logger.error("Unable to Delete Patient with id {} :: {}",id,e.getMessage());
//            e.printStackTrace();
        }
        return false;
    }
}
