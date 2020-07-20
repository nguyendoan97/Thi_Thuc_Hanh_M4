package com.codegym.thi_thuc_hanh.service;

import com.codegym.thi_thuc_hanh.model.City;
import com.codegym.thi_thuc_hanh.repositories.CityRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


@Service
public class CityServiceImpl implements CityService {

    @Autowired
    CityRepository cityRepository;

    @Override
    public Iterable<City> findAll() {
        return cityRepository.findAll();
    }

    @Override
    public City findById(Long id) {
       return cityRepository.findById(id).get();
    }

    @Override
    public City save(City city) {
        return cityRepository.save(city);
    }

    @Override
    public City delete(Long id) {
        City city = cityRepository.findById(id).get();
        cityRepository.delete(city);
        return city;
    }
}
