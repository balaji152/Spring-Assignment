
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main10 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ApplicationContext Context = new ClassPathXmlApplicationContext("Spring10.xml");
		Details details = (Details) Context.getBean("Person1");
		
		details.details();
	}

}