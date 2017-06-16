import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.pluralsight.repository.CustomerRepository;
import com.pluralsight.service.CustomerService;
import com.pluralsight.service.CustomerServiceImpl;

public class Application {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		CustomerService service;
		ApplicationContext ctx = new ClassPathXmlApplicationContext("applicationContext.xml");
		service = ctx.getBean("customerService", CustomerService.class);
		
		System.out.println("Service:: "+service.findAll().get(0).getFirstName()+" "+service.findAll().get(0).getLastName());
	}

}
