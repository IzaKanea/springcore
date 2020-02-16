package be.kanea.project.springcore;

//import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@ComponentScan(basePackages = "be.kanea.project.springcore") // To add all class in this package
public class AppConfig {
	// To declare one by one
	/* 
	@Bean
	public Car getCar() {
		return new Car();
	}
	
	@Bean
	public Tyre getTyre() {
		return new Tyre();
	}
	*/
}
