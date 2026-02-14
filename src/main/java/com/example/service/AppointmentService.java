package com.example.service;

import com.example.models.Appointment;
import com.example.repository.AppointmentRepository;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class AppointmentService {

    @Autowired
    private AppointmentRepository repository;

    private final static Logger logger = LoggerFactory.getLogger(AppointmentService.class);

    public Appointment getAppointment(long id) {
        try {
            return repository.findById(id).orElse(null);
        } catch (Exception e) {
            logger.error("NO APPOINTMENT FOUND WITH ID {} :: {} ", id, e.getMessage());
        }
        return null;
    }

    public List<Appointment> getAllAppointment() {
        try {
            return repository.findAll();
        } catch (Exception e) {
            logger.error("NO APPOINTMENT'S FOUND :: {} ", e.getMessage());
        }
        return null;
    }

    public Appointment saveAppointment(Appointment appointment) {
        try {
            return repository.save(appointment);
        } catch (Exception e) {
            logger.error("UNABLE TO ADD APPOINTMENT WITH ID {} :: {} ", appointment.getId(), e.getMessage());
        }
        return null;
    }

    public Appointment updateAppointment(Long id, Appointment appointment) {
        try {
            if (repository.existsById(id)){
                return repository.findById(id).map(
                        existingAppointment -> {
                            existingAppointment.setDoctorId(appointment.getDoctorId());
                            existingAppointment.setPatientId(appointment.getPatientId());
                            existingAppointment.setDate(appointment.getDate());

                            return repository.save(existingAppointment);
                        }
                ).orElse( null);
            }else
                logger.error("APPOINTMENT WITH ID {} IS NOT EXIST, CAN'T BE UPDATED ", id);
        } catch (Exception e) {
            logger.error("UNABLE TO UPDATE APPOINTMENT WITH ID {} :: {} ", appointment.getId(), e.getMessage());
        }
        return null;
    }

    public boolean deleteAppointment(long id) {
        try {
            if (repository.existsById(id)){
                repository.deleteById(id);
                return true;
            }else
                logger.error("APPOINTMENT WITH ID {} IS NOT EXIST, CAN'T BE DELETED ", id);
        } catch (Exception e) {
            logger.error("UNABLE TO DELETE APPOINTMENT WITH ID {} :: {} ", id, e.getMessage());
//            e.printStackTrace();
        }
        return false;
    }
}
