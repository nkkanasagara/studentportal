package com.sns.bo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.sns.dao.SubscribeDao;
import com.sns.model.Subscribe;

@Service
public class SubscribeBOImpl implements SubscribeBO {
	
	@Autowired
	private SubscribeDao subscribeDao;

	@Override
	@Transactional
	public Subscribe subscribe(Subscribe subscribe) {
		return subscribeDao.subscribe(subscribe);
	} 
	
	
}
