package com.education.trainingmicroservice.controller;

import java.util.List;

import com.education.trainingmicroservice.model.Customer;
import com.education.trainingmicroservice.repoitories.CustomerRepository;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
class CustomerController {

    private final CustomerRepository repo;

    CustomerController(CustomerRepository repo) {
        this.repo = repo;
    }

    @GetMapping("/api/customers")
    List<Customer> getAll() {
        return repo.findAll();
    }
}