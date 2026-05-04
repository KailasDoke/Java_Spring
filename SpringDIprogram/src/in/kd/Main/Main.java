package in.kd.Main;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import in.kd.Beans.Student;

public class Main {
	
	public static void main(String[] args)
	{
		String path = "/in/kd/resources/applicationContext.xml";
		ApplicationContext context = new ClassPathXmlApplicationContext(path);
		
		Student std =(Student) context.getBean("stdid");
		std.display();
	}

}
