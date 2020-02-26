package be.kanea.project.springcore;

import java.util.logging.Logger;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

/* Class configuration
 * @Component 
 * @Component("car")            default value
 * @Component("whatiwant")      can be personalized
 */
@Component("car")
public class Car implements Vehicle{
	
	/*
	 * @Autowired To link Tyre class
	 */
	@Autowired
	private Tyre tyre;
	

	
	public Car() {
		//
	}
	/*  Interface "Fuel"
	 *  @Qualifier : when only one class implements the interface
	 *  @Qualifier("diesel") : chose your class  when more than one implements the interface
	 *  Or in implementation class of Fuel declare one as @Primary (in this case Gasoline.java)
	 */
	@Autowired
	@Qualifier("diesel")
	private Fuel fuel;
	
	public Fuel getFuel() {
		return fuel;
	}

	public void setFuel(Fuel fuel) {
		this.fuel = fuel;
	}

	public Tyre getTyre() {
		return tyre;
	}
	
	public void setTyre(Tyre tyre) {
		this.tyre = tyre;
	}
	
	public void drive() {
		System.out.println("I'm driving a car with " + tyre + " using " + fuel.getFuel());
	}
}
