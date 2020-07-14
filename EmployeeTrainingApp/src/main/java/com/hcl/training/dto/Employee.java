package com.hcl.training.dto;

public class Employee {
	
	private Integer epmolyee_id;
	private String employee_name;
	private Long phone;
	private String password;
	private String address;
	private String email;
	public Integer getEpmolyee_id() {
		return epmolyee_id;
	}
	public void setEpmolyee_id(Integer epmolyee_id) {
		this.epmolyee_id = epmolyee_id;
	}
	public String getEmployee_name() {
		return employee_name;
	}
	public void setEmployee_name(String employee_name) {
		this.employee_name = employee_name;
	}
	public Long getPhone() {
		return phone;
	}
	public void setPhone(Long phone) {
		this.phone = phone;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	@Override
	public String toString() {
		return "Employee [epmolyee_id=" + epmolyee_id + ", employee_name=" + employee_name + ", phone=" + phone
				+ ", password=" + password + ", address=" + address + ", email=" + email + ", getEpmolyee_id()="
				+ getEpmolyee_id() + ", getEmployee_name()=" + getEmployee_name() + ", getPhone()=" + getPhone()
				+ ", getPassword()=" + getPassword() + ", getAddress()=" + getAddress() + ", getEmail()=" + getEmail()
				+ ", getClass()=" + getClass() + ", hashCode()=" + hashCode() + ", toString()=" + super.toString()
				+ "]";
	}
	
}
