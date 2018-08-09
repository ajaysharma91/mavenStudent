package test;


import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class UserProfile {
	private Integer id;
	private String full_name;
	private String gender;
	private String mobile;
	private Set<Address> address = new HashSet<Address>();
	private List<String> emails = new ArrayList<String>();
	private List<Task>task = new ArrayList<Task>();
	public UserProfile() {
		super();
		// TODO Auto-generated constructor stub
	}
	public UserProfile(Integer id, String full_name, String gender, String mobile, Set<Address> address,
			List<String> emails, List<Task> task) {
		super();
		this.id = id;
		this.full_name = full_name;
		this.gender = gender;
		this.mobile = mobile;
		this.address = address;
		this.emails = emails;
		this.task = task;
	}
	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	public String getFull_name() {
		return full_name;
	}
	public void setFull_name(String full_name) {
		this.full_name = full_name;
	}
	public String getGender() {
		return gender;
	}
	public void setGender(String gender) {
		this.gender = gender;
	}
	public String getMobile() {
		return mobile;
	}
	public void setMobile(String mobile) {
		this.mobile = mobile;
	}
	public Set<Address> getAddress() {
		return address;
	}
	public void setAddress(Set<Address> address) {
		this.address = address;
	}
	public List<String> getEmails() {
		return emails;
	}
	public void setEmails(List<String> emails) {
		this.emails = emails;
	}
	public List<Task> getTask() {
		return task;
	}
	public void setTask(List<Task> task) {
		this.task = task;
	}
	
	
	

}
