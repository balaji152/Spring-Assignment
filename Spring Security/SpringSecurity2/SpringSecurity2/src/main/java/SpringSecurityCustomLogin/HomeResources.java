package SpringSecurityCustomLogin;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HomeResources {

	
	
	@RequestMapping(value="/")
	public String run() {
		return "Welcome";
	}
	
	
}