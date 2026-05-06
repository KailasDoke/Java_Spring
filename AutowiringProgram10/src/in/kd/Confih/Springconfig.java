package in.kd.Confih;

import java.util.ArrayList;
import java.util.List;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import in.kd.Beans.Address;
import in.kd.Beans.Student;
import in.kd.Beans.Subject;


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
	public Subject creatsubobj1() {
		Subject sub = new Subject();
		List<String>subject_list = new ArrayList<String>();
		subject_list.add("Java");
		subject_list.add("Python");
		
		sub.setSubjects(subject_list); 
		
		return sub;
	}
	
	@Bean
	public Subject creatsubobj2() {
		Subject sub = new Subject();
		List<String>subject_list = new ArrayList<String>();
		subject_list.add("c++");
		subject_list.add("JavaScript");
		
		sub.setSubjects(subject_list); 
		
		return sub;
	}
	
	@Bean
	public Student createstobj() {
		Student std = new Student();
		std.setName("kails");
		std.setRollno(21);
		//std.setAddress(createobj());
		//std.setSubject(creatsubobj());  // Manually Dependency Injection 
		
		
		return std;
	}
	

}
