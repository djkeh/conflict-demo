package com.example.conflictdemo.domain;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import java.math.BigDecimal;


@Entity
public class SampleDomain {

    @Id @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private BigDecimal fee;
    private String name;
    private int age;

    public BigDecimal getFee() { return fee; }
    public Long getId() { return id; }
    public String getName() { return name; }
    public int getAge() { return age; }

    public void setFee(BigDecimal fee) { this.fee = fee; }
    public void setName(String name) { this.name = name; }
    public void setAge(int age) { this.age = age; }
    public void setId(Long id) { this.id = id; }
}
