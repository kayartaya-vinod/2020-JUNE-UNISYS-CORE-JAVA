package com.unisys.entity;

import lombok.Data;

@Data
public class ContactDetails {
	private String email;
	private String phone;
	private PostalAddress address = new PostalAddress(); // HAS-A
}
