package com.unisys.programs;

import java.util.logging.Logger;

import com.unisys.dao.DaoFactory;
import com.unisys.dao.ProductDao;

public class PrintProductCount {

	static Logger logger = Logger.getGlobal();

	public static void main(String[] args) {
		ProductDao dao;

		// dao = new MongoProductDao(); // tight coupling

		dao = DaoFactory.getProductDao();

		int pc = dao.getProductCount();

		logger.info("product count = " + pc);
	}

}
