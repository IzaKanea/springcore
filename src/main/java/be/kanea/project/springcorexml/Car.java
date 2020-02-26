package be.kanea.project.springcorexml;

public class Car implements Vehicle{
	
	/* To link Tyre
	 * (srping.xml) <bean id ="tyre" class="be.kanea.project.springcorexml.Tyre" > </bean> 
	 *  +       <property name="tyre" ref="tyre" ></property>  add in car bean
	 *                    from class  id from xml
	 */
	private Tyre tyre;
	
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
