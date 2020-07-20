package com.codegym.thi_thuc_hanh.service;

import com.codegym.thi_thuc_hanh.model.City;
import com.codegym.thi_thuc_hanh.model.Country;

public interface CountryService {
    Iterable<Country> findAll();
    Country findById(Long id);
    Country save(Country country);
    Country delete(Long id);
}
