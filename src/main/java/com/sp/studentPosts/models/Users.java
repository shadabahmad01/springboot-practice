package com.sp.studentPosts.models;

public class Users {
	
	private Long id;
	private String name;
	private Long salary;

	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public Long getSalary() {
		return salary;
	}
	public void setSalary(Long salary) {
		this.salary = salary;
	}
	@Override
	public String toString() {
		return "Users [id=" + id + ", name=" + name + ", salary=" + salary + "]";
	}
	
	
	
}
