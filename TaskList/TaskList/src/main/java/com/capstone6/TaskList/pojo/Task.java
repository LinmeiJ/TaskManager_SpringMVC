package com.capstone6.TaskList.pojo;


import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;

@Entity
public class Task {
	
	private Integer teamMemberid;
	private String dueDate;
	private String description;
	private Integer completed;
	@Id 
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private Integer taskid;
	
	@ManyToOne
	@JoinColumn(name="teamMemberid", insertable = false, updatable = false)
	private User user;
	
	public Task() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	
	public Task(Integer teamMemberid, String dueDate, String description) {
		super();
		this.teamMemberid = teamMemberid;
		this.dueDate = dueDate;
		this.description = description;
	}


	public Task(Integer teamMemberid, String dueDate, String description, Integer completed) {
		super();
		this.teamMemberid = teamMemberid;
		this.dueDate = dueDate;
		this.description = description;
		this.completed = completed;
	}


	public Task(Integer teamMemberid, String dueDate, String description, Integer completed, Integer taskid) {
		super();
		this.teamMemberid = teamMemberid;
		this.dueDate = dueDate;
		this.description = description;
		this.completed = completed;
		this.taskid = taskid;
	}


	public Integer getTeamMember() {
		return teamMemberid;
	}
	public void setTeamMember(Integer teamMember) {
		this.teamMemberid = teamMember;
	}
	public String getDueDate() {
		return dueDate;
	}
	public void setDueDate(String dueDate) {
		this.dueDate = dueDate;
	}
	public String getDescription() {
		return description;
	}
	public void setDescription(String description) {
		this.description = description;
	}
	public Integer getCompleted() {
		return completed;
	}
	public void setCompleted(Integer completed) {
		this.completed = completed;
	}
	public Integer getTaskid() {
		return taskid;
	}
	public void setTaskid(Integer taskid) {
		this.taskid = taskid;
	}
	
	
}
