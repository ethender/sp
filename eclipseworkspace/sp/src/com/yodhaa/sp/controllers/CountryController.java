package com.yodhaa.sp.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;
import com.yodhaa.sp.model.Country;
import com.yodhaa.sp.service.impl.CountryServiceImpl;

//@CrossOrigin(origins="localhost:8080")
@CrossOrigin
@RestController
@RequestMapping("/admin")
public class CountryController {

	
	@Autowired
	@Qualifier("country")
	private CountryServiceImpl service;
	
	@RequestMapping(path="/country",method=RequestMethod.POST,consumes="application/json",produces="application/json")
	public Object createCountry(@RequestBody Country coun) {
		System.out.println("****** Result: "+service.insertCountry(coun));
		return coun;
	}
	
	@RequestMapping(path="/country",method=RequestMethod.PUT,consumes="application/json",produces="application/json")
	public Object updateCountry(@RequestBody Country coun) {
		System.out.println("******Result "+service.updateCountry(coun));
		return coun;
	}
	
	@RequestMapping(path="/country",method=RequestMethod.DELETE,consumes="application/json",produces="application/json")
	public Object deleteCountry(@RequestBody Country coun) {
		System.out.println("******Result "+service.deleteCountry(coun));
		return coun;
	}
	
	
	
	@RequestMapping(path="/allcountries",method=RequestMethod.GET,produces="application/json")
	public Object allCountries() {
		return service.getAllCountries();
	}

	
	
}
