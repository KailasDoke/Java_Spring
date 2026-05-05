package in.kd.Beans;

public class Address 
{

	private String Hname;
	private String city;
	private int pincode;
	public String getHname() {
		return Hname;
	}
	public void setHname(String hname) {
		Hname = hname;
	}
	public String getCity() {
		return city;
	}
	public void setCity(String city) {
		this.city = city;
	}
	public int getPincode() {
		return pincode;
	}
	public void setPincode(int pincode) {
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
