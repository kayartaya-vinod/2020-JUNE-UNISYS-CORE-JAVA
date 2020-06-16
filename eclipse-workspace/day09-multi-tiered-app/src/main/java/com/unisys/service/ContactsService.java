package com.unisys.service;

import java.util.List;

import com.unisys.entity.Contact;
import com.unisys.repository.ContactsRepository;
import com.unisys.repository.RepositoryException;
import com.unisys.repository.RepositoryFactory;

public class ContactsService {
	
	ContactsRepository repo;
	
	public ContactsService() throws ServiceException {
		try {
			repo = RepositoryFactory.getContactsRepository();
		} catch (RepositoryException e) {
			throw new ServiceException(e);
		}
	}
	
	// to avoid passing many parameters, the presentation layer may pass a DTO (data transfer object)
	// as a single parameter that contains all the values intended.
	public void addNewContact(String firstname, String lastname, String email, String phone, String city) throws ServiceException {
		// validations here
		if(firstname.trim().length()<3 || firstname.trim().length()>25) {
			throw new ServiceException("Firstname must contain 3 to 25 characters");
		}
		// more validations to follow...
		
		Contact c = new Contact();
		c.setFirstname(firstname);
		c.setLastname(lastname);
		c.setEmail(email);
		c.setPhone(phone);
		c.setCity(city);
		
		try {
			repo.createContact(c);
		} catch (RepositoryException e) {
			throw new ServiceException(e);
		}
		
	}

	// facade for the repository function getAll()
	// this function has no additional value
	public List<Contact> getAllContacts() throws ServiceException {
		try {
			return repo.getAll();
		} catch (RepositoryException e) {
			throw new ServiceException(e);
		}
	}
}
