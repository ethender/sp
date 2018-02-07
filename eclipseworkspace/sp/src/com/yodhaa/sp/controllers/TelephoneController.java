package com.yodhaa.sp.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import org.springframework.web.bind.annotation.RestController;

import com.yodhaa.sp.model.Telephone;
import com.yodhaa.sp.service.impl.TelephoneServiceImpl;

@RestController
@RequestMapping(path="/admin")
public class TelephoneController {

	@Autowired
	@Qualifier("telphone")
	private TelephoneServiceImpl service;
	
	@RequestMapping(path="/telephone",method=RequestMethod.POST,consumes="application/json",produces="application/json")
	public Object createTelephone(@RequestBody Telephone tel) {
		boolean result = service.insertTelephone(tel);
		System.out.println("****** Result: "+result);
		return tel;
	}
	
	@RequestMapping(path="/telephone",method=RequestMethod.PUT,consumes="application/json",produces="application/json")
	public Object updateTelephone(@RequestBody Telephone tel) {
		System.out.println("******Result "+service.updateTelephone(tel));
		return tel;
	}
	
	@RequestMapping(path="/telephone",method=RequestMethod.DELETE,consumes="application/json",produces="application/json")
	public Object deleteTelephone(@RequestBody Telephone tel) {
		System.out.println("******Result "+service.deleteTelephone(tel));
		return tel;
	}
	
	@RequestMapping(path="/telephone/{country}",method=RequestMethod.GET,produces="application/json")
	public Object queryTelephone(@PathVariable("country") String country) {
		Telephone tel = new Telephone();
		tel.setCountry(country);
		return service.queryTelephones(tel);
	}
	
	@RequestMapping(path="/alltelephones",method=RequestMethod.GET,produces="application/json")
	public Object allTelephones() {
		return service.getAllTelephone();
	}
	
}
