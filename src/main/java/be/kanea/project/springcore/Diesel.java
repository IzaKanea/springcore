package be.kanea.project.springcore;

import org.springframework.stereotype.Component;

@Component
public class Diesel implements Fuel {

	public String  getFuel() {
		return "Diesel";
	}

}
