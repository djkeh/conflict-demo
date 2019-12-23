package com.example.conflictdemo.controller;

import com.example.conflictdemo.domain.SampleDomain;
import com.example.conflictdemo.persistence.SampleDomainRepository;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Optional;


@RestController
public class SampleController {

    private final SampleDomainRepository sampleDomainRepository;

    public SampleController(SampleDomainRepository sampleDomainRepository) {
        this.sampleDomainRepository = sampleDomainRepository;
    }


    @GetMapping("/")
    ResponseEntity<SampleDomain> startingPoint() {
        Optional<SampleDomain> domain = sampleDomainRepository.findById(1L);
        return ResponseEntity.ok(domain.orElseGet(SampleDomain::new));
    }
}
