package com.yodhaa.sp.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.data.mongodb.core.query.Criteria;
import org.springframework.data.mongodb.core.query.Query;
import org.springframework.data.mongodb.core.query.Update;
import org.springframework.stereotype.Service;

import com.yodhaa.sp.dao.impl.MongoDaoImpl;
import com.yodhaa.sp.model.Country;
import com.yodhaa.sp.service.CountryService;

@Service
@Qualifier("country")
public class CountryServiceImpl implements CountryService{

	@Autowired
	private MongoDaoImpl dao;
	
	
	public boolean insertCountry(Country coun) {
		return dao.insertDocument(coun);
	}

	
	public boolean updateCountry(Country coun) {
		Query query = new Query(Criteria.where("id").is(coun.getId()));
		Update update =  new Update();
		update.set("country", coun.getCountry());
		update.set("state", coun.getState());
		update.set("city", coun.getCity());
		update.set("areacode", coun.getAreacode());
		update.set("area", coun.getArea());
		update.set("transportzone", coun.getTransportzone());
		update.set("pincode", coun.getPincode());
		return dao.updateDocument(query, update, Country.class);
		
	}

	
	public Country queryCountry(Country coun) {
		Query query = new Query(Criteria.where("pincode").is(coun.getPincode()));
		return (Country) dao.getDocument(query, Country.class);
	}

	@SuppressWarnings("unchecked")
	public List<Country> queryCountries(Country coun) {
		Query query = new Query(Criteria.where("pincode").is(coun.getPincode())
				.orOperator(Criteria.where("country").is(coun.getCountry()))
				.orOperator(Criteria.where("state").is(coun.getState()))
				.orOperator(Criteria.where("city").is(coun.getCity()))
				.orOperator(Criteria.where("areacode").is(coun.getAreacode()))
				.orOperator(Criteria.where("area").is(coun.getArea()))
				.orOperator(Criteria.where("transportzone").is(coun.getTransportzone())));
	
		return (List<Country>)dao.getDocument(query, Country.class);
	}

	@SuppressWarnings("unchecked")
	public List<Country> getAllCountries() {
		return (List<Country>)dao.getAllDocuments(Country.class);
	}

	
	public boolean deleteCountry(Country coun) {
		return dao.deleteDocument(coun);
	}
	
}
