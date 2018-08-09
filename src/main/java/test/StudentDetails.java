package test;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;



@Entity
@Table(name="StudentDetails")
public class StudentDetails {
	@Id
	@GeneratedValue
	private Integer id;
	@Column(name="name")
	private String name;
	@Column(name="rollNo")
	private Integer rollNo;
	@Column(name="className")
	private String className;
	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public Integer getRollNo() {
		return rollNo;
	}
	public void setRollNo(Integer rollNo) {
		this.rollNo = rollNo;
	}
	public String getClassName() {
		return className;
	}
	public void setClassName(String className) {
		this.className = className;
	}
	public StudentDetails(Integer id, String name, Integer rollNo, String className) {
		super();
		this.id = id;
		this.name = name;
		this.rollNo = rollNo;
		this.className = className;
	}
	public StudentDetails() {
		super();
		// TODO Auto-generated constructor stub
	}

}
