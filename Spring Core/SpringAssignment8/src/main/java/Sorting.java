import java.util.Arrays;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

import org.springframework.beans.factory.DisposableBean;
import org.springframework.beans.factory.InitializingBean;

public class Sorting {
	
	public int sort(int [] numlist) {
		Arrays.sort(numlist);
		return numlist[numlist.length-1];
	}

	public void afterPropertiesSet() {
		
		System.out.println("Bean Has Initialized");
	}

	public void destroy() {
		
		System.out.println("Bean Has Desposed");
	}
	
	@PostConstruct
	public void pConstruct(){
		System.out.println("postcontruction of bean");
	}
	
	@PreDestroy
	public void pdestroy(){
		System.out.println("predestroy of bean");
	}
}