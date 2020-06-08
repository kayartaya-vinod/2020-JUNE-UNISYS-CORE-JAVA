package com.unisys.programs;

import com.unisys.entity.ContactDetails;
import com.unisys.entity.Employee;
import com.unisys.entity.PostalAddress;

public class CreateEmployee {

	public static void main(String[] args) {
		
		Employee e1 = new Employee();
		
		e1.setId(7788);
		e1.setName("Ramesh Kumar");
		e1.setSalary(67890);
		
		ContactDetails cd = new ContactDetails();
		cd.setEmail("ramesh@xmpl.com");
		cd.setPhone("83938371671");
		cd.setAddress(new PostalAddress(null, "Chennai", "Tamilnadu"));
		
		e1.setContactDetails(cd);
		
		System.out.println(e1);
		
		System.out.println("Name = " + e1.getName());
		System.out.println("City = " + e1.getContactDetails().getAddress().getCity());
		System.out.println("Email= " + e1.getContactDetails().getEmail());
		System.out.println("Salry= " + e1.getSalary());
				
		// JSP --> e1.contactDetails.address.city
		
	}
}
