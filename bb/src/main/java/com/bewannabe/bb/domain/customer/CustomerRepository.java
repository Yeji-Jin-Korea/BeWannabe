package com.bewannabe.bb.domain.customer;

import java.time.LocalDateTime;
import java.util.List;

import org.springframework.data.mongodb.repository.MongoRepository;

public interface CustomerRepository extends MongoRepository<CustomerDto, String> {
    public CustomerDto findByEmail(String email);
    
    public List<CustomerDto> findByRegDtm(LocalDateTime regDtm);
}
