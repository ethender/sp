package com.yodhaa.sp.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.data.mongodb.core.query.Criteria;
import org.springframework.data.mongodb.core.query.Query;
import org.springframework.data.mongodb.core.query.Update;
import org.springframework.stereotype.Service;

import com.yodhaa.sp.dao.MongoDao;
import com.yodhaa.sp.model.Telephone;
import com.yodhaa.sp.service.TelephoneService;

@Service("telphone")
public class TelephoneServiceImpl implements TelephoneService{

	@Autowired
	@Qualifier("dao")
	private MongoDao dao;
	
	
	public boolean insertTelephone(Telephone tel) {
		return dao.insertDocument(tel);
	}


	public boolean updateTelephone(Telephone tel) {
		Query query = new Query(Criteria.where("pincode").is(tel.getId()));
		Update update = new Update();
		update.set("country", tel.getCountry());
		update.set("telecode", tel.getTelecode());
		update.set("currency", tel.getCurrency());
		update.set("lenofcode", tel.getLenofcode());
		
		return dao.updateDocument(query, update, Telephone.class);
	}

	
	public Telephone queryTelephone(Telephone tel) {
		Query query = new Query(Criteria.where("pincode").is(tel.getId()));
		return (Telephone) dao.getDocument(query, Telephone.class);
	}

	
	@SuppressWarnings("unchecked")
	public List<Telephone> queryTelephones(Telephone tel) {
		Query query = new Query(Criteria.where("country").is(tel.getCountry())
				.orOperator(Criteria.where("telecode").is(tel.getTelecode()))
				.orOperator(Criteria.where("currency").is(tel.getCurrency()))
				.orOperator(Criteria.where("lenofcode").is(tel.getLenofcode())));
		
		return (List<Telephone>) dao.getDocuments(query, Telephone.class);
	}

	@SuppressWarnings("unchecked")	
	public List<Telephone> getAllTelephone() {
		return (List<Telephone>)dao.getAllDocuments(Telephone.class);
	}

	
	public boolean deleteTelephone(Telephone tel) {
		return dao.deleteDocument(tel);
	}

}
