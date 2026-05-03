package in.kd.Bean;


public class Student {
	
	private String name;
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getRollno() {
		return rollno;
	}
	public void setRollno(int rollno) {
		this.rollno = rollno;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	private int rollno;
	private String email;
	
	public void display() {
	System.out.println("name :"+name);
	System.out.println("rollno :"+rollno);
	System.out.println("email :"+email);
	}
	}

