import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main8 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("Spring8.xml");
		Sorting sorting = (Sorting) context.getBean("sort");
		
		int result = sorting.sort(new int[] {1,2,3,4,5,6});
		System.out.println(result);
		
		context.close();
	}

}