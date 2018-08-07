package com.cg.resume;

import java.time.LocalDate;
import java.util.Arrays;

public class Person {

	
	String firstname;
	String lastname;
	String gender;
	String hq;
	String dob;
	String [] hobbies;
	String address;
	String[] skills;
	String email;
	String phoneno;
	String summary;
	
	
	
	
	public Person() {
		super();
		
	}








	public Person(String firstname, String lastname, String gender, String hq, String dob, String[] hobbies,
			String address, String[] skills, String email, String phoneno, String summary) {
		super();
		this.firstname = firstname;
		this.lastname = lastname;
		this.gender = gender;
		this.hq = hq;
		this.dob = dob;
		this.hobbies = hobbies;
		this.address = address;
		this.skills = skills;
		this.email = email;
		this.phoneno = phoneno;
		this.summary = summary;
	}








	@Override
	public String toString() {
		return "Person [firstname=" + firstname + ", lastname=" + lastname + ", gender=" + gender + ", hq=" + hq
				+ ", dob=" + dob + ", hobbies=" + Arrays.toString(hobbies) + ", address=" + address + ", skills="
				+ Arrays.toString(skills) + ", email=" + email + ", phoneno=" + phoneno + ", summary=" + summary + "]";
	}
	
	
	
	
}
