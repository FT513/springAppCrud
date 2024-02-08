package com.springpractice.springappcrud.model;


import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.MappedSuperclass;
import lombok.Data;
import org.springframework.data.annotation.CreatedDate;
import org.springframework.data.annotation.LastModifiedDate;

import java.util.Date;


@MappedSuperclass
@Data
public class BaseEntity {

@Id
@GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

@CreatedDate
private Date created;

@LastModifiedDate
private Date updated;


private UserStatus userstatus;
}

