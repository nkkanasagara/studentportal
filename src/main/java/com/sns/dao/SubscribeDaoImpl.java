package com.sns.dao;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.sns.model.Subscribe;



@Repository
public class SubscribeDaoImpl implements SubscribeDao {
	
	@PersistenceContext
	@Autowired
	private EntityManager em;
	
	@Override
	public Subscribe subscribe(Subscribe subscribe) {
		System.out.println(subscribe.getEmail());
	    em.persist(subscribe);
		return subscribe;
	}

}
