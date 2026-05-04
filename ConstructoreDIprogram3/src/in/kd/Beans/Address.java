package in.kd.Beans;

public class Address {

	private String Hname;
	private int Hno;
	private String City;
	
	public Address(String Hname, int Hno , String City) {
		this.Hname = Hname;
		this.Hno=Hno;
		this.City=City;
	}
	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return "#"+Hname+", "+Hno +" , " +City; 
	}
	
}
