package com.yodhaa.sp.service;

import java.util.List;

import com.yodhaa.sp.model.Telephone;

public interface TelephoneService {
	
	
	public boolean insertTelephone(Telephone tel);
	
	public boolean updateTelephone(Telephone tel);
	
	public Telephone queryTelephone(Telephone tel);
	
	public List<Telephone> queryTelephones(Telephone tel);
	
	public List<Telephone> getAllTelephone();
	
	public boolean deleteTelephone(Telephone tel);

}
