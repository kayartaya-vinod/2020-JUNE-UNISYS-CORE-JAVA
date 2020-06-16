package com.unisys.repository;

public final class RepositoryFactory {

	// there should be a provision to overwrite this value (like ENV variables)
	private static String type = "jdbc";

	private RepositoryFactory() {
	}

	public static ContactsRepository getContactsRepository() throws RepositoryException {

		switch (type) {
		case "jdbc":
			return new JdbcContactsRepository();
		default:
			throw new RepositoryException("No implementation found for type: " + type);
		}

	}
}
