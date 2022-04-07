package Assignment1;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class SpringAssignment1 {
	@RequestMapping("/hello")
	public String sayHi(){
		return "Hello World";
	}

}