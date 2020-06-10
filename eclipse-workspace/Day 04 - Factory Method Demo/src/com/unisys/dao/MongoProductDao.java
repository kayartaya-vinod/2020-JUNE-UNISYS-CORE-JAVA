package com.unisys.dao;

import java.util.logging.Logger;

public class MongoProductDao implements ProductDao {

	Logger logger = Logger.getLogger(getClass().getName());
	
	@Override
	public int getProductCount() {
		logger.info("MongoProductDao.getProductCount() called");
		return 500000;
	}

}
