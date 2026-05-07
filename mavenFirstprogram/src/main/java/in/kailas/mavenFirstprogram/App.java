package in.kailas.mavenFirstprogram;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import in.kd.Bean.Student;

/*
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
    	String loc = "/in/kd/resources/applicationContext.xml";
    	ApplicationContext context = new ClassPathXmlApplicationContext(loc);
    	Student std = (Student)context.getBean(Student.class);
    	std.display();
    }
}
