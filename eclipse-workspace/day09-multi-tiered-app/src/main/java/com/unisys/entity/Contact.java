package com.unisys.entity;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

@NoArgsConstructor
@Setter
@Getter
@ToString
public class Contact {
	int id;
	private String firstname;
	private String lastname;
	private String email;
	private String phone;
	private String city;
}
