package mithun.learn.samples.serviceBean;

import mithun.learn.samples.implementations.EmployeeDetails;
import mithun.learn.samples.interfaces.PrinterIntfc;

/** One of the main Spring service class.
 * @author Mithun Oorath
 *
 */
public class EmployeeService {
	private PrinterIntfc details;
	private EmployeeDetails employeeDetails;
	
	/**
	 * 
	 * @return PrinterInftc implemented object.
	 */
	public PrinterIntfc getDetails() {
		return details;
	}


	/**This is to show construction injection.
	 * 
	 * @param PrinterIntfc implemented object.
	 */

	public EmployeeService(PrinterIntfc details) {
		this.details = details;
		System.out.println("construction injection successful");
	}
	
	/**This is to show the setter injection
	 * 
	 * @param EmployeeDetails
	 */
			
	public void setEmployeeDetails(EmployeeDetails employeeDetails) {
		this.employeeDetails = employeeDetails;
		
		System.out.println("Setter injection successful using Employee details class");
	}


	/**
	 * Protected constructor for Spring.
	 */
	protected EmployeeService() {}
	
	
	/**
	 * Call of the printInfo method.
	 */
	public void printInfo() {
		employeeDetails.printName();
	}

}
