package com.sns.dao;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.sns.model.ContactUS;

@Repository
public class ContactUSDaoImpl implements ContactUSDao {
	
	@PersistenceContext
	@Autowired
	private EntityManager em;
	

	@Override
	public List<ContactUS> getDetails() {
//		TypedQuery<ContactUS> query=sessionFactory.createNamedQuery("ContactUS.getDetails", ContactUS.class);
//		return query.getResultList();
		return null;
	}

	@Override
	public ContactUS setDetails(ContactUS contactUs) {
	    em.persist(contactUs);
		return contactUs;
	}

	

}
