package Spring.SpringFramework;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.stereotype.Component;

@Component
public class GetCurrenttime {

	//@Value("#{systemProperties['user.timezone'] ?: 'UTC'}")
	@Value("#{T(java.time.LocalDateTime).now().format(T(java.time.format.DateTimeFormatter).ofPattern('HH:mm:ss'))}")
	private String timezone;

	public void GetTime()
	{
		System.out.println("Current Time is: "+timezone);
	}
}
