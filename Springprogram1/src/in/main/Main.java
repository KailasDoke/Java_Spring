package in.main;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import in.kd.Bean.Student;

public class Main {
	
		public static void main(String args[])
		{
			String congi_loc = "/in/kd/resources/applicationContext.xml";
			ApplicationContext context = new ClassPathXmlApplicationContext(congi_loc);
			
			Student std = (Student) context.getBean("stdid");
			std.display();
			Student std1 = (Student) context.getBean("st");
			std1.display();
			
			
		}
}
