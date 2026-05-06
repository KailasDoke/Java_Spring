package in.kd.Main;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import in.kd.Beans.Student;
import in.kd.resources.springconfigrationfile;

public class main {
	public static void main(String[] args) {
		
		ApplicationContext contect = new AnnotationConfigApplicationContext(springconfigrationfile.class);
		
		Student std = contect.getBean(Student.class);
		std.display();
	}
	

}
