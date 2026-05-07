package in.kd.Bean;

public class Student {
	private String Name ;
	private String Gender;
	private int rollno;
	
	
	public String getName() {
		return Name;
	}
	public void setName(String name) {
		Name = name;
	}
	public String getGender() {
		return Gender;
	}
	public void setGender(String gender) {
		Gender = gender;
	}
	public int getRollno() {
		return rollno;
	}
	public void setRollno(int rollno) {
		this.rollno = rollno;
	}
	public void display() {
		System.out.println("kd");
		System.out.println("male");
		System.out.println("21");
	}
	
}
