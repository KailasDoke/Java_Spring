package in.kd.main;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import in.kd.bean.Student;
import in.kd.resources.javaConfigFile;

public class Main {
	
	public static void main(String[] args) {
		ApplicationContext context = new AnnotationConfigApplicationContext(javaConfigFile.class);
		Student std = (Student) context.getBean("stdid");
		std.display();
	}
}
