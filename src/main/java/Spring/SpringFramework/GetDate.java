package Spring.SpringFramework;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
public class GetDate {
	
	//@Value("#{systemProperties['user.timezone'] ?: 'UTC'}")
		@Value("#{T(java.time.LocalDateTime).now().format(T(java.time.format.DateTimeFormatter).ofPattern('yyyy-MM-dd'))}")
		private String date;

		public void Printdate()
		{
			System.out.println("Current Date is: "+date);
		}


}
