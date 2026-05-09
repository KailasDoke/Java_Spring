package in.kailas.NamedParameterjdbcTemplete;
// 12lecture code 
import java.util.HashMap;
import java.util.Map;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.jdbc.core.namedparam.NamedParameterJdbcTemplate;

import in.kd.resources.springConfigrationgFile;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
       ApplicationContext context = new AnnotationConfigApplicationContext(springConfigrationgFile.class);
       NamedParameterJdbcTemplate npjdbcTemplete= (NamedParameterJdbcTemplate)context.getBean(NamedParameterJdbcTemplate.class);
       
       Map<String , Object> map = new HashMap<String, Object>();
       map.put("Name", "Kailas");
       map.put("Gender", "Male");
       map.put("rollno", 21);
       
       String s = "Insert into student values(:Name ,:Gender ,:rollno)";
       int count = npjdbcTemplete.update(s, map);
       if(count>0) {
    	   System.out.println("success");
       }
       else {
    	   System.out.println("fail");
       }
       
    }
}
