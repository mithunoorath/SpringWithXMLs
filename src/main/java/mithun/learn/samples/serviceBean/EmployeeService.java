package mithun.learn.samples.serviceBean;

import mithun.learn.samples.implementations.EmployeeDetails;
import mithun.learn.samples.interfaces.Printer;

public class EmployeeService {
	private Printer details;
	
	public EmployeeService(Printer details) {
		this.details = details;
		System.out.println("construction injection successful");
	}
	
	public void printInfo() {
		details.printName();
	}

}
