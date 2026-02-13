package com.example.service;

import com.example.models.Bill;

import java.util.List;

public class BillService {
    public Bill getBill(long id){
        try {
            System.out.println("INTO SERVICE LAYER [ GET BILL ] WITH ID :: "+ id);
        }catch (Exception e){
            e.printStackTrace();
        }

        return null;
    }

    public List<Bill> getAllBill(){
        try {
            System.out.println("INTO SERVICE LAYER [GET ALL BILLs ] WITH ID :: ");
        }catch (Exception e){
            e.printStackTrace();
        }

        return null;
    }

    public Bill saveBill(Bill bill){
        try {
            System.out.println("INTO SERVICE LAYER [ SAVE METHOD ]  WITH ID :: ");
        }catch (Exception e){
            e.printStackTrace();
        }

        return null;
    }

    public Bill updateBill(Bill bill){
        try {
            System.out.println("INTO SERVICE LAYER [ UPDATE METHOD ]");
        }catch (Exception e){
            e.printStackTrace();
        }

        return null;
    }

    public boolean deleteBill(long id){
        try {
            System.out.println("INTO SERVICE LAYER [ DELETE METHOD ]  WITH ID :: "+id);
        }catch (Exception e){
            e.printStackTrace();
        }
        return false;
    }
}
