package be.kanea.project.springcorexml;

public class Tyre {
	/*
	 *  default value is defined on spring.xml
	 *  Can be defined by construtor or by setter method
	 */
	private String brand;
	
	public Tyre() {}
	
	public Tyre(String brand) {
		super();
		this.brand = brand;
	}

	public String getBrand() {
		return brand;
	}

	public void setBrand(String brand) {
		this.brand = brand;
	}

	@Override
	public String toString() {
		return "Tyre [brand=" + brand + "]";
	}
}
