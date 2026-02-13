package com.example.service;

import com.example.models.Bill;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class BillService {

    private final static Logger logger = LoggerFactory.getLogger(BillService.class);

    public Bill getBill(long id){
        try {
            System.out.println("INTO SERVICE LAYER [ GET BILL ] WITH ID :: "+ id);
        }catch (Exception e){
            logger.error("NO BILL IS FOUND WITH ID {} :: {}",id,e.getMessage());
//            e.printStackTrace();
        }

        return null;
    }

    public List<Bill> getAllBill(){
        try {
            System.out.println("INTO SERVICE LAYER [GET ALL BILLs ] WITH ID :: ");
        }catch (Exception e){
            logger.error("NO BILLS ARE FOUND  :: {}",e.getMessage());
//            e.printStackTrace();
        }

        return null;
    }

    public Bill saveBill(Bill bill){
        try {
            System.out.println("INTO SERVICE LAYER [ SAVE METHOD ]  WITH ID :: ");
        }catch (Exception e){
            logger.error("UNABLE TO ADD BILL WITH ID {} :: {}",bill.getId(),e.getMessage());
//            e.printStackTrace();
        }

        return null;
    }

    public Bill updateBill(Long id, Bill bill){
        try {
            System.out.println("INTO SERVICE LAYER [ UPDATE METHOD ]");
        }catch (Exception e){
            logger.error("UNABLE TO UPDATE BILL WITH ID {} :: {}",bill.getId(),e.getMessage());
//            e.printStackTrace();
        }

        return null;
    }

    public boolean deleteBill(long id){
        try {
            System.out.println("INTO SERVICE LAYER [ DELETE METHOD ]  WITH ID :: "+id);
        }catch (Exception e){
            logger.error("UNABLE TO DELETE BILL WITH ID {} :: {}",id,e.getMessage());
//            e.printStackTrace();
        }
        return false;
    }
}
