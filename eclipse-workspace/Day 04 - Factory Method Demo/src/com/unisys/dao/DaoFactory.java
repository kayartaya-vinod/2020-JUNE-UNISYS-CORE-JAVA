package com.unisys.dao;

import java.util.ResourceBundle;

public class DaoFactory {
	
	static String discriminator;
	
	static {
		ResourceBundle bundle = ResourceBundle.getBundle("com.unisys.dao.dao");
		discriminator = bundle.getString("dao.impl.type");
	}

	public static ProductDao getProductDao() {
		switch (discriminator.toLowerCase()) {
		case "jdbc":
			return new JdbcProductDao();
		case "excel":
			return new ExcelProductDao();
		case "mongodb":
			return new MongoProductDao();
		default:
			throw new RuntimeException("Unable to find an implementation of type: " + discriminator);

		}
	}

}
