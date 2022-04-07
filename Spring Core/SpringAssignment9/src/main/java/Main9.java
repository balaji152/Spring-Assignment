import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main9 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("Life.xml");
		
		context.registerShutdownHook();
		LifeCycleAssignment6 life = (LifeCycleAssignment6) context.getBean("details1");
		
		life.display();
	}

}
