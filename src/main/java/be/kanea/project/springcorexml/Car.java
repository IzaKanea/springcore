package be.kanea.project.springcorexml;

public class Car implements Vehicle{
	
	/* To link Tyre
	 * (srping.xml) <bean id ="tyre" class="be.kanea.project.springcorexml.Tyre" > </bean>
	 */
	private Tyre tyre;

	public Tyre getTyre() {
		return tyre;
	}
	
	public void setTyre(Tyre tyre) {
		this.tyre = tyre;
	}
	
	public void drive() {
		System.out.println("I'm driving a car with " + tyre);
	}
}
