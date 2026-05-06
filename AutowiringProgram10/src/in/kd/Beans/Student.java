package in.kd.Beans;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;

public class Student {
	private String Name;
	private int rollno;
	
	@Autowired
	private Address address;
	@Autowired
	@Qualifier("creatsubobj2")
	private Subject subject;
	
	
	public Address getAddress() {
		return address;
	}
	public void setAddress(Address address) {
		this.address = address;
	}
	public Subject getSubject() {
		return subject;
	}
	public void setSubject(Subject subject) {
		this.subject = subject;
	}
	public String getName() {
		return Name;
	}
	public void setName(String name) {
		Name = name;
	}
	public int getRollno() {
		return rollno;
	}
	public void setRollno(int rollno) {
		this.rollno = rollno;
	}
	
	
	public void display() {
		System.out.println(" name "+ Name);
		System.out.println(" rollno "+ rollno);
		System.out.println(" Address "+ address);
		System.out.println("Subject "+subject);
		
	}
	
}
