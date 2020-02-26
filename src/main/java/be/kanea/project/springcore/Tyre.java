package be.kanea.project.springcore;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
public class Tyre {

	@Value("Michelin")
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
