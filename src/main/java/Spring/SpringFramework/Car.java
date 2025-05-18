package Spring.SpringFramework;

import org.springframework.stereotype.Component;

@Component
public class Car implements Vehicle{
	
	public void speed()
	{
		System.out.println("Cars speed is: 100 ");
	}

}
