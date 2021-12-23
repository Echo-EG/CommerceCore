package com.CommerceCore.CommerceCore.modal;

import org.springframework.stereotype.Service;

import java.util.ArrayList;

@Service
public class TaskService {

    private final TaskMapper taskMapper;


    public TaskService(TaskMapper taskMapper) {
        this.taskMapper = taskMapper;
    }

    public ArrayList<Product>getAllProduct(){
        return this.taskMapper.getAllProducts();
    }


    public PaymentAndShipping addPaymentAndShipping(PaymentAndShipping paymentAndShipping){
        this.taskMapper.addPaymentAndShipping(paymentAndShipping);
        return paymentAndShipping;
    }


}
