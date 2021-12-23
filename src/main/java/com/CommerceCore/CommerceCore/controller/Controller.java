package com.CommerceCore.CommerceCore.controller;

import com.CommerceCore.CommerceCore.modal.PaymentAndShipping;
import com.CommerceCore.CommerceCore.modal.Product;
import com.CommerceCore.CommerceCore.modal.TaskService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;

@RestController
@CrossOrigin(origins = "*")
public class Controller  {

    @Autowired
    private TaskService taskService;


    @GetMapping("/api/products")
    public ArrayList<Product> getAllProducts(){
        return this.taskService.getAllProduct();
    }

    @PostMapping("/api/import")
    public PaymentAndShipping postPaymentAndShipping (@RequestBody PaymentAndShipping paymentAndShipping){
        PaymentAndShipping result = this.taskService.addPaymentAndShipping(paymentAndShipping);
        return result;
    }




}
