package com.unisys.repository;

import java.util.List;

import com.unisys.entity.Contact;

public interface ContactsRepository {

	// CRUD operations
	public void createContact(Contact contact) throws RepositoryException;
	
	// Queries
	public List<Contact> getAll() throws RepositoryException;
}
