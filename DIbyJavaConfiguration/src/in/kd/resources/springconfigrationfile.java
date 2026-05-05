package in.kd.resources;

import org.springframework.context.annotation.Configuration;

import in.kd.Beans.Address;

@Configuration
public class springconfigrationfile {
	
	public Address createAddobj() {
		Address addr = new Address();
		
		addr.setHname("kd");
		addr.setCity("Pune");
		addr.setPincode(142673);
		
		
	}

}
