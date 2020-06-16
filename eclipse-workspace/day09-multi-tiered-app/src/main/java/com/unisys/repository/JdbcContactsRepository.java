package com.unisys.repository;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

import com.unisys.entity.Contact;
import com.unisys.utils.DbUtil;

public class JdbcContactsRepository implements ContactsRepository {

	@Override
	public void createContact(Contact contact) throws RepositoryException {

		String sql = "insert into contacts(firstname, lastname, email, phone, city) values (?,?,?,?,?)";
		try(
			Connection conn = DbUtil.createConnection();
			PreparedStatement stmt = conn.prepareStatement(sql);
		) {
			stmt.setString(1, contact.getFirstname());
			stmt.setString(2, contact.getLastname());
			stmt.setString(3, contact.getEmail());
			stmt.setString(4, contact.getPhone());
			stmt.setString(5, contact.getCity());
			
			stmt.execute();
			
		}
		catch(Exception ex) {
			throw new RepositoryException(ex); 
		}
	}

	@Override
	public List<Contact> getAll() throws RepositoryException {
		String sql = "select * from contacts";
		List<Contact> list = new ArrayList<Contact>();
		
		try(
				Connection conn = DbUtil.createConnection();
				PreparedStatement stmt = conn.prepareStatement(sql);
				ResultSet rs = stmt.executeQuery();
		) {
			while(rs.next()) {
				Contact c = new Contact();
				c.setId(rs.getInt("id"));
				c.setFirstname(rs.getString("firstname"));
				c.setLastname(rs.getString("lastname"));
				c.setEmail(rs.getString("email"));
				c.setPhone(rs.getString("phone"));
				c.setCity(rs.getString("city"));
				list.add(c);
			}
		}
		catch(Exception ex) {
			throw new RepositoryException(ex); 
		}
		return list;
	}

}
