package Spring.SpringFramework;

import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;

@Component
@Primary
public class Bike implements Vehicle {

	public void speed()
	{
		System.out.println("Bike speed is: 50 ");
	}

}
