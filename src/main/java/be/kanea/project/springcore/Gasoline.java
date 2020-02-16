package be.kanea.project.springcore;

import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;

@Component
@Primary // if you want you can use a default class when more than one implements the same interface
public class Gasoline implements Fuel{

	public String getFuel() {
		return "Gasoline";
	}

}
