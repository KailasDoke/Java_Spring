package in.kd.Beans;

public class Address {
	
	private String hname;

	public String getHname() {
		return hname;
	}

	public void setHname(String hname) {
		this.hname = hname;
	}
	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return "#"+hname;
	}
	

}
