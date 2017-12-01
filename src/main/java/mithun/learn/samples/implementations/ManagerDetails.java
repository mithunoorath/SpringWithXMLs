package mithun.learn.samples.implementations;

import mithun.learn.samples.interfaces.PrinterIntfc;
/**ManagerDetails class implements the PrinterIntfc.
 * @author Mithun Oorath
 * @version 1.0.0
 *
 */
public class ManagerDetails implements PrinterIntfc {
	/**
	 * @return String
	 */
	public String printName() {
		String message ="Hi My name is Mithun Oorath from Manager";
		System.out.println(message);
		return message;
	}

}
