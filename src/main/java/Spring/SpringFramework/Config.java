package Spring.SpringFramework;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@ComponentScan("Spring.SpringFramework") 
public class Config {
	
	@Bean(name = "vehicle")
	public Vehicle vehicle()
	{
		return new Bike();
	}
	// Vehicle vehicle = new Bike();
	
	@Bean(name = "car")
	public Vehicle vehicle2()
	{
		return new Car();
	}

}
