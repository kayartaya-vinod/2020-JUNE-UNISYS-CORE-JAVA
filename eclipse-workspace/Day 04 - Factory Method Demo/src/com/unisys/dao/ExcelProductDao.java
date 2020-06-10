package com.unisys.dao;

import java.util.logging.Logger;

public class ExcelProductDao implements ProductDao {

	Logger logger = Logger.getLogger(getClass().getName());
	
	@Override
	public int getProductCount() {
		logger.info("ExcelProductDao.getProductCount() called");
		return 900;
	}

}
