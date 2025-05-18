package Spring.SpringFramework;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.stereotype.Component;


@Configuration
@ComponentScan("Spring.SpringFramework")
public class RunthroughAnnotation {

/*	@Autowired
	@Qualifier("Car")
	//Vehicle v; */
	
	@Autowired
	GetCurrenttime G;
	@Autowired
	GetDate G1;
	// GetCurrenttime G = new GetCurrenttime();
	// Vehicle v = new Bike();
	// Vehicle v = new Car();
	
	public void speedCheck()
	{
		G.GetTime();
		G1.Printdate();
	}
	
}
