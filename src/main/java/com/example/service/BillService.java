package com.example.service;

import com.example.models.Bill;
import com.example.repository.BillRepository;
import org.hibernate.sql.model.PreparableMutationOperation;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class BillService {

    private final static Logger logger = LoggerFactory.getLogger(BillService.class);

    @Autowired
    private BillRepository repository;

    public Bill getBill(long id) {
        try {
            return repository.findById(id).orElse(null);
        } catch (Exception e) {
            logger.error("NO BILL IS FOUND WITH ID {} :: {}", id, e.getMessage());
        }
        return null;
    }

    public List<Bill> getAllBill() {
        try {
            return repository.findAll();
        } catch (Exception e) {
            logger.error("NO BILLS ARE FOUND  :: {}", e.getMessage());
        }

        return null;
    }

    public Bill saveBill(Bill bill) {
        try {
            return repository.save(bill);
        } catch (Exception e) {
            logger.error("UNABLE TO ADD BILL WITH ID {} :: {}", bill.getId(), e.getMessage());
        }
        return null;
    }

    public Bill updateBill(Long id, Bill bill) {
        try {
            if (repository.existsById(id)) {
                return repository.findById(id).map(existingBill -> {
                    existingBill.setPatientId(bill.getPatientId());
                    existingBill.setAmount(bill.getAmount());
                    existingBill.setStatus(bill.getStatus());

                    return repository.save(existingBill);
                }).orElse(null);
            } else
                logger.error("Bill with id {} is not present, can't be updated", id);
        } catch (Exception e) {
            logger.error("UNABLE TO UPDATE BILL WITH ID {} :: {}", bill.getId(), e.getMessage());
        }

        return null;
    }

    public boolean deleteBill(long id) {
        try {
            if (repository.existsById(id)){
                repository.deleteById(id);
                return true;
            }
            else
                logger.error("Bill with id {} is not present, can't be deleted", id);
        } catch (Exception e) {
            logger.error("UNABLE TO DELETE BILL WITH ID {} :: {}", id, e.getMessage());
        }
        return false;
    }
}
