package MainApplication;

import org.springframework.stereotype.Controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;



@Controller
public class AssignmentQ6 {
    @RequestMapping(value="/AssignmentQ6",method=RequestMethod.GET)
	public String showpage() {
		return "registration";
	}
}