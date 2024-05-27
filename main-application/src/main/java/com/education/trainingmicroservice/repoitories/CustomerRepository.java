package com.education.trainingmicroservice.repoitories;

import com.education.trainingmicroservice.model.Customer;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CustomerRepository extends JpaRepository<Customer, Long> {}