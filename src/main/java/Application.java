import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.pluralsight.service.CustomerService;
import com.pluralsight.service.CustomerServiceImpl;

public class Application {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ApplicationContext appContext = new ClassPathXmlApplicationContext("applicationContext.xml");
		CustomerService service = appContext.getBean("customerService", CustomerService.class);
		System.out.println(
				"Srevice:: " + service.findAll().get(0).getFirstName() + " " + service.findAll().get(0).getLastName());
	}

}
