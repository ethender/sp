package com.yodhaa.sp.dao;

import org.springframework.data.mongodb.core.query.Query;
import org.springframework.data.mongodb.core.query.Update;

@SuppressWarnings("rawtypes")
public interface MongoDao {

	public boolean insertDocument(Object obj);
	
	public boolean deleteDocument(Object obj);
	
	public Object getDocument(Query query,Class entity);
	
	public Object getDocuments(Query query, Class entity);
	
	public boolean updateDocument(Query query, Update update, Class entity);
	
	public Object getAllDocuments(Class entity);
	
	public long countDocuments(Query query, Class entity);
}
