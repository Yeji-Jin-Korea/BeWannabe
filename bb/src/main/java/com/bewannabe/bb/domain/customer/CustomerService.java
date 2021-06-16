package com.bewannabe.bb.domain.customer;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import lombok.extern.slf4j.Slf4j;

@Slf4j
@Service
public class CustomerService {

    @Autowired
    CustomerRepository customerRepository;
    
    public CustomerDto getCustomerDtl(String custNo){
        CustomerDto customer = customerRepository.findById(custNo).orElseGet(CustomerDto::new);
        log.info(">>> getCustomerDtl() customer:{}", customer);
        return customer;
    }
}
