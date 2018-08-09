package test;

import java.util.Date;

public class Task {
	
	private Integer id;
	private String task_Name;
	private Date created_At;
	private Date update_At;
	private String is_completed;
	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	public String getTask_Name() {
		return task_Name;
	}
	public void setTask_Name(String task_Name) {
		this.task_Name = task_Name;
	}
	public Date getCreated_At() {
		return created_At;
	}
	public void setCreated_At(Date created_At) {
		this.created_At = created_At;
	}
	public Date getUpdate_At() {
		return update_At;
	}
	public void setUpdate_At(Date update_At) {
		this.update_At = update_At;
	}
	public String getIs_completed() {
		return is_completed;
	}
	public void setIs_completed(String is_completed) {
		this.is_completed = is_completed;
	}
	public Task(Integer id, String task_Name, Date created_At, Date update_At, String is_completed) {
		super();
		this.id = id;
		this.task_Name = task_Name;
		this.created_At = created_At;
		this.update_At = update_At;
		this.is_completed = is_completed;
	}
	public Task() {
		super();
		// TODO Auto-generated constructor stub
	}
	

}
