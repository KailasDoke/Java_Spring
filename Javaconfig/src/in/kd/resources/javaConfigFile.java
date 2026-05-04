package in.kd.resources;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import in.kd.bean.Student;
@Configuration
public class javaConfigFile {
	
	@Bean
	public Student stdid()
	{
		Student std = new Student();
		
		std.setName("kailas");
		std.setRollno(230);
		std.setEmail("kails@gmail.com");
		
		return std;
	}

}
