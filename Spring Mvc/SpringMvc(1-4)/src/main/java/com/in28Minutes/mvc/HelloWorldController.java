package com.in28Minutes.mvc;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

@Controller
public class HelloWorldController {
	
	
	@RequestMapping(value="/AssignmentQ1",method=RequestMethod.GET)
	public String showweb() {
		return "helloworld";
	}
		

}