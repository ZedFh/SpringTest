package beans;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Entity
public class Student {
	@Id
	@GeneratedValue
	private int id;
	
	@Column
	private String name;
	
	public Student(int id, String name, Date ddn) {
		super();
		this.id = id;
		this.name = name;
		this.ddn = ddn;
	}

	@Override
	public String toString() {
		return "Student [id=" + id + ", name=" + name + ", ddn=" + ddn + "]";
	}

	public Student() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Student(String name, Date ddn) {
		super();
		this.name = name;
		this.ddn = ddn;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Date getDdn() {
		return ddn;
	}

	public void setDdn(Date ddn) {
		this.ddn = ddn;
	}

	@Column
	private Date ddn;
	
	
	

}
