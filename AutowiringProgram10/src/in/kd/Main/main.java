package in.kd.Main;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import in.kd.Beans.Student;
import in.kd.Confih.Springconfig;

public class main {
	public static void main(String[] args) {
		ApplicationContext context = new AnnotationConfigApplicationContext(Springconfig.class);
		
		Student std = context.getBean(Student.class);
		std.display();
	}

}
 