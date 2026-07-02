package designpatterns.creational.factorymethod;

public class ExcelDocument implements Document{
	
	@Override
	public void open() {
		System.out.println("Opening Word Document");
	}
	
}
