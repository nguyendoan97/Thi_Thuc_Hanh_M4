package com.codegym.thi_thuc_hanh.repositories;

import com.codegym.thi_thuc_hanh.model.Country;
import org.springframework.data.repository.CrudRepository;

public interface CountryRepository extends CrudRepository<Country,Long> {
}
