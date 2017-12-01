package mithun.learn.samples.main;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import mithun.learn.samples.serviceBean.EmployeeService;
/**The main class to set the application context for Spring Application
 * 
 * @author Mithun Oorath
 * @version 1.0.0
 */
public class MainApplication {
/**The main method is build to set the application context and call the main spring related service class
 **Spring beens are configured via the Spring.xml
 * 
 * @param String[] args
 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ApplicationContext applicationContext = new ClassPathXmlApplicationContext("Spring.xml");
		EmployeeService employeeService = (EmployeeService) applicationContext.getBean("EmployeeService");
		employeeService.printInfo();

	}

}
