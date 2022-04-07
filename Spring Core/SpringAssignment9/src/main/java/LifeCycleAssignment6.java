import org.springframework.beans.factory.DisposableBean;
import org.springframework.beans.factory.InitializingBean;

public class LifeCycleAssignment6 implements InitializingBean,DisposableBean{

		private int CustomerId;  
		private String CustomerName;
		
		public int getCustomerId() {
			return CustomerId;
		}
		public void setCustomerId(int customerId) {
			CustomerId = customerId;
		}
		
		public String getCustomerName() {
			return CustomerName;
		}
		
		public void setCustomerName(String customerName) {
			CustomerName = customerName;
		}
		
		public void display() {
			System.out.println("Customerid: "+getCustomerId()+"CustomerName: "+getCustomerName() );
		
		
		
		
		
		}
		








		public void afterPropertiesSet() throws Exception {
		  System.out.println("InitializingBean init method called for LifeCycle");
		  
		  }
		  
		  
		  
		  
		  
		  
		  
		  
		  public void destroy() throws Exception {
		  System.out.println("DisposableBean destroy method called for LifeCycle");
		  
		  }
		  
		}
		 
		 
		
		
		






		
		








		
		
		
		


