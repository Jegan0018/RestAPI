package com.example.demo.dto;

public class BlogDTO {
	private int id;
	private String name;
	private String password;
	private String title;
	private String content;
	
	@Override
	public String toString() {
		return "BlogDTO [id=" + id + ", name=" + name + ", password=" + password + ", title=" + title + ", content="
				+ content + "]";
	}


	public BlogDTO(int id, String name, String password, String title, String content) {
		super();
		this.id = id;
		this.name = name;
		this.password = password;
		this.title = title;
		this.content = content;
	}


	public BlogDTO() {
		super();
	}


	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getTitle() {
		return title;
	}
	public void setTitle(String title) {
		this.title = title;
	}
	public String getContent() {
		return content;
	}
	public void setContent(String content) {
		this.content = content;
	}
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
}
