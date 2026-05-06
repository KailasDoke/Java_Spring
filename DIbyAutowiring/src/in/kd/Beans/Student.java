package in.kd.Beans;

import org.springframework.beans.factory.annotation.Autowired;

public class Student {
	private String Name;
	private int rollno;
	
	@Autowired
	private Address address;
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
		
	}
	
}
