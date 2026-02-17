package com.example.controllers;

import com.example.models.Bill;
import com.example.service.BillService;
import io.swagger.v3.oas.annotations.tags.Tag;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/v1/bill")
@Tag(name = "Bill APIs", description = "Bill related APIs - CREATE, READ, UPDATE & DELETE")
public class BillController {

    @Autowired
    private BillService service;

    @GetMapping
    public List<Bill> getAllBills(){ //fetch records of all patients
        System.out.println("-> FETCHING THE BILLS");
        return service.getAllBill();
    }

    @GetMapping("/{id}")
    public Bill getBill(@PathVariable Long id){
        System.out.println("-> FETCHING DETAILS OF BILL");
        return service.getBill(id);
    }

    @PostMapping
    public Bill saveBill(@RequestBody Bill bill){
        System.out.println("-> CREATING BILL ");
        return service.saveBill(bill);
    }

    @PutMapping("/{id}")
    public Bill updateBill(@RequestBody Bill bill, @PathVariable Long id){
        System.out.println("-> UPDATING BILL");
        return service.updateBill(id,bill);
    }

    @DeleteMapping("/{id}")
    public String deleteBill(@PathVariable Long id){
        System.out.println("-> DELETING BILL");
        return service.deleteBill(id) ? "Deleted":"Failed";
    }

}
