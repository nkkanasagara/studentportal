package com.sns.bo;

import java.util.List;

import com.sns.model.ContactUS;

public interface ContactUsBO {

	public List<ContactUS> getDetails();
	public ContactUS setDetails(ContactUS contactUs);	
}
