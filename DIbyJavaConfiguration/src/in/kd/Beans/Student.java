package in.kd.Beans;

public class Student {
	private String Name;
	private String gender;
	private int rollno;
	private Address address;
	public Address getAddress() {
		return address;
	}
	public void setAddress(Address address) {
		this.address = address;
	}
	public String getName() {
		return Name;
	}
	public void setName(String name) {
		Name = name;
	}
	public String getGender() {
		return gender;
	}
	public void setGender(String gender) {
		this.gender = gender;
	}
	public int getRollno() {
		return rollno;
	}
	public void setRollno(int rollno) {
		this.rollno = rollno;
	}
	
	public void display() {
		System.out.println("Name "+Name);
		System.out.println("gender "+gender);
		System.out.println("rollno "+rollno);
		System.out.println("Address "+address);
	}

}
