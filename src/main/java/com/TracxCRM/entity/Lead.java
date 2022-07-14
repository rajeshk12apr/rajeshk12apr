package com.TracxCRM.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "leads")
public class Lead {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private long id;
	@Column(name = "First_Name", length = 45, nullable = false)
	private String first_name;

	@Column(name = "Last_Name", length = 45, nullable = false)
	private String last_name;

	@Column(name = "Email", length = 145, nullable = false)
	private String email;

	@Column(name = "Mobile", length = 10, nullable = false)
	private long mobile;

	@Column(name = "Lead_Source")
	private String leadSource;

	@Column(name = "Gender")
	private String gender;

	public Lead(long id, String first_name, String last_name, String email, long mobile, String leadSource,
			String gender) {
		super();
		this.id = id;
		this.first_name = first_name;
		this.last_name = last_name;
		this.email = email;
		this.mobile = mobile;
		this.leadSource = leadSource;
		this.gender = gender;
	}

	public Lead() {
		super();
		// TODO Auto-generated constructor stub
	}

	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}

	public String getFirst_name() {
		return first_name;
	}

	public void setFirst_name(String first_name) {
		this.first_name = first_name;
	}

	public String getLast_name() {
		return last_name;
	}

	public void setLast_name(String last_name) {
		this.last_name = last_name;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public long getMobile() {
		return mobile;
	}

	public void setMobile(long mobile) {
		this.mobile = mobile;
	}

	public String getLeadSource() {
		return leadSource;
	}

	public void setLeadSource(String leadSource) {
		this.leadSource = leadSource;
	}

	public String getGender() {
		return gender;
	}

	public void setGender(String gender) {
		this.gender = gender;
	}

	@Override
	public String toString() {
		return "Lead [id=" + id + ", first_name=" + first_name + ", last_name=" + last_name + ", email=" + email
				+ ", mobile=" + mobile + ", leadSource=" + leadSource + ", gender=" + gender + "]";
	}

}
