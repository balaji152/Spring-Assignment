package Assignment3;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class UserController2 {
	
	@RequestMapping(value="/Q3/{zipcode}")
	public ResponseEntity<String> check(@PathVariable String zipcode) {
		if(zipcode.equals("600092")) {
			return new ResponseEntity<String>("{State:Tamil Nadu,City:Chennai,Country:india}",HttpStatus.OK);
		}
		else if(zipcode.equals("600093")) {
			return new ResponseEntity<String>("{State: Andhra ,city:Vizag,country:India}",HttpStatus.OK);
		}
		else if(zipcode.equals("600098")) {
			return new ResponseEntity<String>("{State:Paris,city:Nantes,country:France}",HttpStatus.OK);
		}
		 return new ResponseEntity<String>("false",HttpStatus.NOT_FOUND);
	}
}