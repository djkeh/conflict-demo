package com.example.conflictdemo.persistence;

import com.example.conflictdemo.domain.SampleDomain;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;


public interface SampleDomainRepository extends JpaRepository<SampleDomain, Long> {
    Optional<SampleDomain> findById(Long id);
}
