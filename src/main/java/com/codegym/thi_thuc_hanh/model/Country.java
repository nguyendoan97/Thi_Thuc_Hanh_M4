package com.codegym.thi_thuc_hanh.model;


import lombok.Data;

import javax.persistence.*;

@Entity
@Table(name = "countrys")
@Data
public class Country {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
    private String name;
}
