package com.capstone6.TaskList.pojo;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;

@Entity
public class User {
	private String name;//the pk
	private String email;
	private String password;
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private Integer userid;
	
	@OneToMany(mappedBy="user", cascade = CascadeType.ALL, orphanRemoval=true)
	private List<Task> tasks = new ArrayList<>();
	
	public User() {
		super();
		// TODO Auto-generated constructor stub
	}
	public User(String name, String email, String password) {
		super();
		this.name = name;
		this.email = email;
		this.password = password;
	}
	public User(String name, String email, String password, Integer userid) {
		super();
		this.name = name;
		this.email = email;
		this.password = password;
		this.userid = userid;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public Integer getUserid() {
		return userid;
	}
	public void setUserid(Integer userid) {
		this.userid = userid;
	}

	
}
