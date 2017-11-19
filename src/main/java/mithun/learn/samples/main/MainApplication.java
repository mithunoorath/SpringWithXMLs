package mithun.learn.samples.main;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import mithun.learn.samples.serviceBean.EmployeeService;

public class MainApplication {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ApplicationContext applicationContext = new ClassPathXmlApplicationContext("Spring.xml");
		EmployeeService employeeService = (EmployeeService) applicationContext.getBean("EmployeeService");
		employeeService.printInfo();

	}

}
