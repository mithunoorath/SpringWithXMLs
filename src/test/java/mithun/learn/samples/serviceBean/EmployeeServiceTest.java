package mithun.learn.samples.serviceBean;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class EmployeeServiceTest {
	ApplicationContext applicationContext;
	EmployeeService employeeService;

	@Before
	public void setUp() throws Exception {
		applicationContext = new ClassPathXmlApplicationContext("Spring.xml");
		employeeService = (EmployeeService) applicationContext.getBean("EmployeeService");
	}

	@Test
	public void testPrintInfo() {
		//fail("Not yet implemented"); // TODO
		String expected ="Hi My name is Mithun Oorath";
		assertEquals(expected, employeeService.printInfo());
	}

}
