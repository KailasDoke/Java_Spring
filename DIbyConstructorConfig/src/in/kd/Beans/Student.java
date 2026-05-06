package in.kd.Beans;

public class Student {
	private String Name;
	private String gender;
	private int rollno;
	private Address address;
	
	public Student(String Name, String gender , int rollno, Address address) {
		this.Name= Name;
		this.gender = gender;
		this.rollno=rollno;
		this.address=address;
	}
	
	public void display() {
		System.out.println("Name "+Name);
		System.out.println("gender "+gender);
		System.out.println("rollno "+rollno);
		System.out.println("Address "+address);
	}

}
