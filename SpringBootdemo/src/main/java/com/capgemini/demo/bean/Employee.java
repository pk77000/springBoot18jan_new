package com.capgemini.demo.bean;

import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement
public class Employee {
	
	private String id;
	private String name;
	//private String description;
	
	public Employee()
	{
		
	}
	public Employee(String id, String name) {
		super();
		this.id = id;
		this.name = name;
		//this.description = description;
	}
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}

	
}
