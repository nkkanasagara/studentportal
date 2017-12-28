package com.sns.dao;

import java.util.List;

import com.sns.model.ContactUS;

public interface ContactUSDao {
	public List<ContactUS> getDetails();
	public ContactUS setDetails(ContactUS contactUs);	
}
