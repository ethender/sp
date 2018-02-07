package com.yodhaa.sp.service;

import java.util.List;
import com.yodhaa.sp.model.Country;

public interface CountryService {
	
	public boolean insertCountry(Country coun);
	
	public boolean updateCountry(Country coun);
	
	public Country queryCountry(Country coun);
	
	public List<Country> queryCountries(Country coun);
	
	public List<Country> getAllCountries();
	
	public boolean deleteCountry(Country coun);

}
