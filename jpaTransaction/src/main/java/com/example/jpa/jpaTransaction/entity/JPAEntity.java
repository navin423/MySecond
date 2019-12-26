package com.example.jpa.jpaTransaction.entity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Entity
public class JPAEntity {
	
	@Id
	@GeneratedValue
	private int id;
	private String name;
	private String address;

	public JPAEntity(String name, String address) {
		super();
		this.name = name;
		this.address = address;
	}

	public int getId() {
		return id;
	}
	
	public String getName() {
		return name;
	}
	
	public String getAddress() {
		return address;
	}

	@Override
	public String toString() {
		return "JPAEntity [id=" + id + ", name=" + name + ", address=" + address + "]";
	}


}
