package com.unisys.dao;

import java.util.logging.Logger;

public class JdbcProductDao implements ProductDao {

	Logger logger = Logger.getLogger(getClass().getName());

	@Override
	public int getProductCount() {
		logger.info("JdbcProductDao.getProductCount() called");
		return 1000;
	}

	@Override
	public boolean existsById(int id) {
		if (id > 0)
			return true;
		return false;
	}
}
