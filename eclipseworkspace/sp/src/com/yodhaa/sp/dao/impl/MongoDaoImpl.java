package com.yodhaa.sp.dao.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.data.mongodb.core.MongoTemplate;
import org.springframework.data.mongodb.core.query.Query;
import org.springframework.data.mongodb.core.query.Update;
import org.springframework.stereotype.Repository;

import com.yodhaa.sp.dao.MongoDao;

@SuppressWarnings("all")
@Repository("dao")
public class MongoDaoImpl implements MongoDao{
	@Autowired
	@Qualifier("mongoTemplate")
	private MongoTemplate mongo;

	/**
	 * inserts the document
	 */
	public boolean insertDocument(Object obj) {
		mongo.insert(obj);
		return true;
	}

	/**
	 * deletes the document
	 */
	public boolean deleteDocument(Object obj) {
		mongo.remove(obj);
		return true;
	}

	/**
	 * get single document else null
	 */
	public Object getDocument(Query query, Class entity) {
		List list = mongo.find(query, entity);
		return list.get(0);
	}

	/**
	 * get queries documents
	 */
	public Object getDocuments(Query query, Class entity) {
		return mongo.find(query, entity);
	}
	
	/**
	 * update the document
	 */
	public boolean updateDocument(Query query, Update update, Class entity) {
		mongo.updateFirst(query, update, entity);
		return true;
	}

	
	/**
	 * get all documents
	 */
	public Object getAllDocuments(Class entity) {
		return mongo.findAll(entity);
	}
	
	public long countDocuments(Query query, Class entity) {
		return mongo.count(query, entity);
	}
	
	
}
