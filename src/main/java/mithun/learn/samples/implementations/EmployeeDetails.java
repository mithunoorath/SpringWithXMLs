package mithun.learn.samples.implementations;

import mithun.learn.samples.interfaces.Printer;

public class EmployeeDetails implements Printer {

	public String printName() {
		// TODO Auto-generated method stub
		String message ="Hi My name is Mithun Oorath";
		System.out.println(message);
		return message;
	}

}
