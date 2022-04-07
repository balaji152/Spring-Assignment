package SpringSecurityDemo1;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloController {
	
	
	
	@RequestMapping(value="/demo")
	public String run() {
		return "Welcome";
	}
	
	
	
	 @RequestMapping(value="/user") 
	  public String run1(){ 
		  
		  return "Welcome User"; 
		  }
	  
	  @RequestMapping(value="/admin")
	  public String run2(){
		  
		  return "Welcome Admin"; 
		  }
	 
	
}
