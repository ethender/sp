package com.yodhaa.sp.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.mongodb.core.query.Criteria;
import org.springframework.data.mongodb.core.query.Query;
import org.springframework.data.mongodb.core.query.Update;
import org.springframework.stereotype.Service;

import com.yodhaa.sp.dao.impl.MongoDaoImpl;
import com.yodhaa.sp.model.Registration;
import com.yodhaa.sp.service.RegistrationService;
import com.yodhaa.sp.util.DateUtil;
import com.yodhaa.sp.util.RegistrationUtil;

@Service("registration")
public class RegistrationServiceImpl implements RegistrationService{

	@Autowired
	private MongoDaoImpl dao;

	
	public boolean insertRegistration(Registration reg) {
		Query query = new Query(Criteria.where("_class").is(Registration.class.getName()));
		int count = (int)dao.countDocuments(query, Registration.class);
		RegistrationUtil util = new RegistrationUtil();
		DateUtil dUtil = new DateUtil();
		if(count <= 0) {
			reg.setRefnum(util.getRefNumber(1));
		}else {
			reg.setRefnum(util.getRefNumber(++count));
		}
		reg.setInsertdate(dUtil.currentDate());
		reg.setLastmodified(dUtil.currentDate());
		
		return dao.insertDocument(reg);
		
	}

	
	public boolean updateRegistration(Registration reg) {
		Query query = new Query(Criteria.where("refnum").is(reg.getRefnum()));
		Update update = new Update();
		update.set("companyName", reg.getCompanyName());
		update.set("email", reg.getEmail());
		update.set("mobile", reg.getMobile());
		update.set("landline", reg.getLandline());
		update.set("person", reg.getPerson());
		update.set("businesshour", reg.getBusinesshour());
		update.set("lastmodified", (new DateUtil()).currentDate());
		return dao.updateDocument(query, update, Registration.class);
	}

	
	public Registration queryRegistration(Registration reg) {
		Query query = new Query(Criteria.where("refnum").is(reg.getRefnum()));
		return (Registration)dao.getDocument(query, Registration.class);
	}

	@SuppressWarnings("unchecked")
	public List<Registration> queryRegistrations(Registration reg) {
		Query query = new Query(Criteria.where("email").is(reg.getEmail())
				.orOperator(Criteria.where("mobile").is(reg.getMobile())));
		return (List<Registration>)dao.getDocuments(query, Registration.class);
	}

	
	@SuppressWarnings("unchecked")
	public List<Registration> getAllRegistration() {
		return (List<Registration>)dao.getAllDocuments(Registration.class);
	}

	
	public boolean deleteRegistration(Registration reg) {
		return dao.deleteDocument(reg);
	}
	
}
