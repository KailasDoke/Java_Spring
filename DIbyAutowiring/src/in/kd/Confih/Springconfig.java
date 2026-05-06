package in.kd.Confih;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import in.kd.Beans.Address;
import in.kd.Beans.Student;


@Configuration
public class Springconfig 
{

	@Bean
	public Address createobj()
	{
		Address add = new Address();
		
		add.setHname("Sweet home ");
		return add;
		
	}
	@Bean
	public Student createstobj() {
		Student std = new Student();
		std.setName("kails");
		std.setRollno(21);
		//std.setAddress(createobj());
		
		
		return std;
	}
	

}
