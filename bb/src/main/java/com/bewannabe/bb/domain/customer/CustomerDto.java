package com.bewannabe.bb.domain.customer;

import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.LocalDateTime;

import org.springframework.data.annotation.Id;

import lombok.AllArgsConstructor;


@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class CustomerDto {

    @Id
    private String id;

    private String name;

    private String email;

    private LocalDateTime regDtm;
}
