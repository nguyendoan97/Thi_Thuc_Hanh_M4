package com.codegym.thi_thuc_hanh.controller;


import com.codegym.thi_thuc_hanh.model.City;
import com.codegym.thi_thuc_hanh.model.Country;
import com.codegym.thi_thuc_hanh.service.CityService;
import com.codegym.thi_thuc_hanh.service.CountryService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.servlet.ModelAndView;

import java.security.Principal;

@Controller
public class CityController {

    @Autowired
    CityService cityService;

    @Autowired
    CountryService countryService;

    @ModelAttribute("countrys")
    Iterable<Country> countrys(){
        return countryService.findAll();
    }


    @GetMapping("")
    public ModelAndView getIndex(){
        Iterable<City> city = cityService.findAll();
        ModelAndView mv = new ModelAndView("/city/list");
        mv.addObject("citys",city);
        return mv;
    }
    @GetMapping("detail/{id}")
    public ModelAndView getdetail(@PathVariable Long id){
        City city = cityService.findById(id);
        ModelAndView mv = new ModelAndView("/city/detail");
        mv.addObject("city",city);
        return mv;
    }

    @GetMapping("/create")
    public ModelAndView create(){
        ModelAndView mv = new ModelAndView("/city/create");
        mv.addObject("city",new City());
        return mv;
    }
    @PostMapping("/create")
    public ModelAndView save(@ModelAttribute City city){
        cityService.save(city);
        ModelAndView modelAndView = new ModelAndView("/city/create");
        modelAndView.addObject("city", new City());
        modelAndView.addObject("mess", "City create successfully");
        return modelAndView;
    }

    @GetMapping("{id}/update")
    public ModelAndView edit(@PathVariable Long id){
        City city = cityService.findById(id);
        ModelAndView mv = new ModelAndView("/city/update");
        mv.addObject("city",city);
        return mv;

    }

    @PostMapping("{id}/update")
    public ModelAndView edit(@ModelAttribute City city){
        cityService.save(city);
        ModelAndView mv = new ModelAndView("/city/update");
        mv.addObject("city",city);
        mv.addObject("mess", "City update successfully");
        return mv;

    }



    @PostMapping("delete/{id}")
    public String deleteCity(@PathVariable Long id){
        City deleteCity = cityService.findById(id);
        cityService.delete(id);
        return ("redirect:/");
    }
}

