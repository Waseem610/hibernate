package com.te.hibernate;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity(name = "IndiaTeam")
public class Team {
	@Id
	private int id;
	private String name;
	private String designation;
	private double salary;
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	@Override
	public String toString() {
		return "Team [id=" + id + ", name=" + name + ", designation=" + designation + ", salary=" + salary + "]";
	}
	public String getDesignation() {
		return designation;
	}
	public void setDesignation(String designation) {
		this.designation = designation;
	}
	public double getSalary() {
		return salary;
	}
	public void setSalary(double salary) {
		this.salary = salary;
	}
	

}
