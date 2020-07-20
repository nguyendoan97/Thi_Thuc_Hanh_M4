package com.codegym.thi_thuc_hanh.service;

import com.codegym.thi_thuc_hanh.model.Country;
import com.codegym.thi_thuc_hanh.repositories.CountryRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


@Service
public class CountryServiceImpl implements CountryService {

    @Autowired
    CountryRepository countryRepository;

    @Override
    public Iterable<Country> findAll() {
        return countryRepository.findAll();
    }

    @Override
    public Country findById(Long id) {
        return countryRepository.findById(id).get();
    }

    @Override
    public Country save(Country country) {
        return countryRepository.save(country);
    }

    @Override
    public Country delete(Long id) {
        Country country = countryRepository.findById(id).get();
        countryRepository.delete(country);
        return country;
    }
}
