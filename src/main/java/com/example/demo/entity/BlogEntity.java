package com.example.demo.entity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name="post_table")
public class BlogEntity {
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	private int id;
	@Column(name="name", length=45)
	private String name;
	@Column(name="password", length=200)
	private String password;
	@Column(name="title", length=100)
	private String title;
	@Column(name="content", length=200)
	private String content;
	
	public BlogEntity() {
		super();
	}
	
	public BlogEntity(int id,String name, String password, String title, String content) {
		super();
		this.id=id;
		this.name = name;
		this.password = password;
		this.title = title;
		this.content = content;
	}
	@Override
	public String toString() {
		return "BlogEntity [id=" + id + ", name=" + name + ", password=" + password + ", title=" + title + ", content="
				+ content + "]";
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
	
}
