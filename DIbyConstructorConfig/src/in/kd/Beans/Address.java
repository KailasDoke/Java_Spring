package in.kd.Beans;

public class Address 
{
	private String Hname;
	private String city;
	private int pincode;
	
	
	public Address(String Hname , String city , int pincode ) {
		this.Hname = Hname;
		this.city = city;
		this.pincode = pincode;
	}
	
	public void display() {
		System.out.println("Home name " +Hname);
		System.out.println("Home city " +city);
		System.out.println("Home pincode " +pincode);
	}
	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return "#"+Hname+ " "+city+ " " +pincode;
	}
}
