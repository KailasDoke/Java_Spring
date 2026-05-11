 package in.kd.main;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

import in.kd.bean.user;



@Controller 
public class MyController {
	
	@GetMapping("/hellopahe")
//	public ModelAndView openhellopage() {
//		
//		System.out.println("openhellopage");
////		
//		ModelAndView mvc = new ModelAndView("hellow");
//		//mvc.setViewName("hellow");
//		
//		r
		
		public String Display() {
			return "hellow";
		}
	
	
		@GetMapping("/myFrom")
		public String openmyform() {
			return "my-Form";
		}
		
		@PostMapping("/submitform")
		public String handlemyform(
									@RequestParam("name") String myname,
									@RequestParam("email") String myemail,
									@RequestParam("phone") String myphone,
									Model model
									) {
			
			System.out.println("NAME " +myname);
			System.out.println("EMAIL "+myemail );
			System.out.println("PHONE " +myphone);
			
			user User = new user();
			User.setName(myname);
			User.setEmail(myemail);
			User.setPhone(myphone);
			
			
			model.addAttribute("mname", myname);
			model.addAttribute("memail", myemail);
			model.addAttribute("mphone", myphone);
			return "profile" ;
		}
	}


