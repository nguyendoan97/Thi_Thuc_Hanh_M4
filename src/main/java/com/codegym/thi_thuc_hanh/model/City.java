package com.codegym.thi_thuc_hanh.model;


import lombok.Data;

import javax.persistence.*;

@Entity
@Table(name = "citys")
@Data
public class City {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
    private String name;

    @ManyToOne
    private Country country;
    private Long acreage;
    private Long population;
    private Long GDP;
    private String description;
}
