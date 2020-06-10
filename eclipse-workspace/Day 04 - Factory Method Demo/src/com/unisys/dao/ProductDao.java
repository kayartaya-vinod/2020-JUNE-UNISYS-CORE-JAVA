package com.unisys.dao;

public interface ProductDao {
	
	public int getProductCount();
	
	public default boolean existsById(int id) { 
		throw new RuntimeException("Method not implemented!");
	}

}
