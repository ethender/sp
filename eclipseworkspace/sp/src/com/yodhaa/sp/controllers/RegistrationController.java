package com.yodhaa.sp.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.yodhaa.sp.model.Registration;

import com.yodhaa.sp.service.impl.RegistrationServiceImpl;

@CrossOrigin
@RestController
public class RegistrationController {

	@Autowired
	@Qualifier("registration")
	private RegistrationServiceImpl service;
	
	
	
	@RequestMapping(path="/registration",method=RequestMethod.POST,consumes="application/json",produces="application/json")
	public Object createRegistration(@RequestBody Registration reg) {
		System.out.println("****** Result: "+service.insertRegistration(reg));
		return reg;
	}
	
	@RequestMapping(path="/registration",method=RequestMethod.PUT,consumes="application/json",produces="application/json")
	public Object updateRegistration(@RequestBody Registration reg) {
		System.out.println("******Result "+service.updateRegistration(reg));
		return reg;
	}
	
	@RequestMapping(path="/registration",method=RequestMethod.DELETE,consumes="application/json",produces="application/json")
	public Object deleteRegistration(@RequestBody Registration reg) {
		System.out.println("******Result "+service.deleteRegistration(reg));
		return reg;
	}
	
	@RequestMapping(path="/registration/{refnum}",method=RequestMethod.GET,produces="application/json")
	public Object queryRegistration(@PathVariable("refnum") String refnum) {
		Registration reg = new Registration();
		reg.setRefnum(refnum);
		return service.queryRegistration(reg);
	}
	
	@RequestMapping(path="/allregistrations",method=RequestMethod.GET,produces="application/json")
	public Object allRegistrations() {
		return service.getAllRegistration();
	}
	
	
}
