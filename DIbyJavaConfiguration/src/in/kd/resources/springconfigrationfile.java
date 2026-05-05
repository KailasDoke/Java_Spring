package in.kd.resources;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import in.kd.Beans.Address;
import in.kd.Beans.Student;

@Configuration
public class springconfigrationfile {
	@Bean
	public Address createAddobj() {
		Address addr = new Address();
		
		addr.setHname("kd");
		addr.setCity("Pune");
		addr.setPincode(142673);
		
		return addr;
	}
	
	@Bean
	public Student createStudobj() {
		
		Student std = new Student();
		
		std.setGender("Kailas");
		std.setGender("Male");
		std.setRollno(21);
		std.setAddress(createAddobj());
		
		return std;
	}

}
