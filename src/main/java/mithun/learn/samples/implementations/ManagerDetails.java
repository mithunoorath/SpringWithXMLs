package mithun.learn.samples.implementations;

import mithun.learn.samples.interfaces.Printer;

public class ManagerDetails implements Printer {

	public String printName() {
		String message ="Hi My name is Mithun Oorath from Manager";
		System.out.println(message);
		return message;
	}

}
