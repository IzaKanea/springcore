package be.kanea.project.springcore;

import org.springframework.stereotype.Component;

@Component
public class Bike implements Vehicle{
	public void drive() {
		System.out.println("I'm driving a bike");
	}
}
