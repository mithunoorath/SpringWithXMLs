# SpringWithXMLs

This is a simple Spring project using spring.xml configuration file.

1) PrinterIntfc.java - has a method to print the name.
2) EmployeeDetails implements the PrinterIntfc.java
3) EmployeeService.java is the main service class, where the employee detail been is defined or set.
4) Spring.xml file configures the dependency injection of the bean on to the main service class- Employee Service.
5) MainApplication is just a POJO containing main method to call the print method implemented in the Employee details via Employee Service class.
