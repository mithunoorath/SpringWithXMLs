package mithun.learn.samples.implementations;

import mithun.learn.samples.interfaces.PrinterIntfc;

/**EmployeeDetails class implements the PrinterIntfc.
 * @author Mithun Oorath
 * @version 1.0.0
 *
 */

public class EmployeeDetails implements PrinterIntfc {

	/**
	 * @return String
	 */
	public String printName() {
		// TODO Auto-generated method stub
		String message ="Hi My name is Mithun Oorath";
		System.out.println(message);
		return message;
	}

}
