import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main1 {
    public static void main(String[] args) {
        ApplicationContext context=new ClassPathXmlApplicationContext("Assignment2.xml");
        Question  obj=(Question)context.getBean("Question1");
        obj.MapDisplay();
        obj.SetDisplay(); 
        obj.ListDisplay(); 
    }
}