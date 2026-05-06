package in.kd.resources;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import in.kd.Beans.Address;
import in.kd.Beans.Student;

@Configuration
public class springconfigrationfile {
	@Bean
	public Address createAddobj() {
		Address addr = new Address("Aai","Jalna",431203);
		
			
		return addr;
	}
	
	@Bean
	public Student createStudobj() {
		
		Student std = new Student("Ganesh","male",24,createAddobj());
		
		
		
		return std;
	}

}
