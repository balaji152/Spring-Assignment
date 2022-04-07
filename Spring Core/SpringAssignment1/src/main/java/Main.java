

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ApplicationContext context = new ClassPathXmlApplicationContext("Assignment1.xml");
		
		
		
		  Customer customer = (Customer) context.getBean("Customer1");
		  customer.detailsof();
		 		 
		
		
		
			
	}

}
