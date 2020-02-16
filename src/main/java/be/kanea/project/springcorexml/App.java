 package be.kanea.project.springcorexml;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;


/**
 * This package the use xml configuration file
 *
 */
public class App {
	/*
	 *                                         (interface)    (impl)
	 * With Spring we don't do that anymore : Vehicule obj = new Car();
	 * instead of it we use contenair like BeanFactory or ApplicationContext
	 * 
	 *  - BeanFactory                     -> small app
	 *       import org.springframework.beans.factory.BeanFactory;
	 *       
     *  - ApplicationContext              -> biggest app
     *       import org.springframework.context.ApplicationContext;
	 * 
	 */
	public static void main( String[] args )
    {
		//We need to create a xml file (spring.xml) -> src/main/java
		ApplicationContext factory = new ClassPathXmlApplicationContext("spring.xml");

		Vehicle obj = (Vehicle) factory.getBean("car");
		obj.drive();
		Tyre tyre = (Tyre)  factory.getBean("tyre");
		System.out.println(tyre);
    }
	
}
