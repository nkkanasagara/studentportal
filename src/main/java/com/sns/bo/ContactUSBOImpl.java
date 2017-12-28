package com.sns.bo;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.sns.dao.ContactUSDao;
import com.sns.model.ContactUS;

@Service
public class ContactUSBOImpl implements ContactUsBO {

	@Autowired
	private ContactUSDao contactUsDao; 
	
	@Override
	public List<ContactUS> getDetails() {
		return contactUsDao.getDetails();
	}

	@Override
	@Transactional
	public ContactUS setDetails(ContactUS contactUs) {
		return contactUsDao.setDetails(contactUs);
	}

}
