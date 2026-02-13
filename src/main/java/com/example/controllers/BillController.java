package com.example.controllers;

import com.example.models.Bill;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/v1/bill")
public class BillController {

    @GetMapping
    public List<Bill> getAllBills(){ //fetch records of all patients
        System.out.println("-> FETCHING THE BILLS");
        return null;
    }

    @GetMapping("/{id}")
    public Bill getBill(@PathVariable Long id){
        System.out.println("-> FETCHING DETAILS OF BILL");
        return null;
    }

    @PostMapping
    public Bill saveBill(@RequestBody Bill bill){
        System.out.println("-> CREATING BILL ");
        return null;
    }

    @PutMapping("/{id}")
    public Bill updateBill(@RequestBody Bill bill, @PathVariable Long id){
        System.out.println("-> UPDATING BILL");
        return null;
    }

    @DeleteMapping("/{id}")
    public String deleteBill(@PathVariable Long id){
        System.out.println("-> DELETING BILL");
        return null;
    }

}
