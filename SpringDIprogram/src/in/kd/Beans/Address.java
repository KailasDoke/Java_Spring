package in.kd.Beans;

public class Address {

	private String Hname;
	private int Hno;
	private String City;
	
	public void setHname(String hname) {
		Hname = hname;
	}
	public void setHno(int hno) {
		Hno = hno;
	}
	public void setCity(String city) {
		City = city;
	}
	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return "#"+Hname+", "+Hno +" , " +City; 
	}
	
}
