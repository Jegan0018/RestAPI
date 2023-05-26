package com.example.demo.dto;

public class LoginDTO {
	private int id;
	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	private String name,password;

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public LoginDTO(int id,String name, String password) {
		super();
		this.id=id;
		this.name = name;
		this.password = password;
	}

	public LoginDTO() {
		super();
		// TODO Auto-generated constructor stub
	}
}
