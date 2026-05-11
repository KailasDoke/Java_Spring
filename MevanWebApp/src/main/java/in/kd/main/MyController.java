 package in.kd.main;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller 
public class MyController {
	
	@GetMapping("/hellopahe")
	public ModelAndView openhellopage() {
		
		System.out.println("openhellopage");
		
		ModelAndView mvc = new ModelAndView();
		mvc.setViewName("hello");
		
		return mvc;
	}

}
