package com.yodhaa.sp.service;

import java.util.List;

import com.yodhaa.sp.model.Registration;

public interface RegistrationService {
	
	
	public boolean insertRegistration(Registration reg);
	
	public boolean updateRegistration(Registration reg);
	
	public Registration queryRegistration(Registration reg);
	
	public List<Registration> queryRegistrations(Registration reg);
	
	public List<Registration> getAllRegistration();
	
	public boolean deleteRegistration(Registration reg);

}
