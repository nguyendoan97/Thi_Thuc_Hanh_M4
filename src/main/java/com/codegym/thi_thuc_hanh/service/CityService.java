package com.codegym.thi_thuc_hanh.service;

import com.codegym.thi_thuc_hanh.model.City;

public interface CityService {

    Iterable<City> findAll();
    City findById(Long id);
    City save(City city);
    City delete(Long id);
}
