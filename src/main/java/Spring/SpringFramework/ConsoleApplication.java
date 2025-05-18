package Spring.SpringFramework;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class ConsoleApplication {
	


	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*ApplicationContext a = new AnnotationConfigApplicationContext(Students.class); 
		//Students S = new Students();
		Students s = a.getBean(Students.class);
		s.StudentRegiration();
		ApplicationContext a1 = new AnnotationConfigApplicationContext(Teacher.class); 
		Teacher t = a1.getBean(Teacher.class);
		t.Teacherinfo();*/
		
		// Using XML configuration:
		/*ApplicationContext context = new ClassPathXmlApplicationContext(
            "appConfig.xml");
		
		Teacher T = (Teacher) context.getBean("teacherinfo");
		T.Teacherinfo();
		Students s = (Students) context.getBean("studentInfo");
		s.StudentRegiration();
		s.StudentCourse();*/
		
		//using Java based configuration
	/*	ApplicationContext context = new AnnotationConfigApplicationContext(Config.class);
		Vehicle v = context.getBean("vehicle",Vehicle.class);
		v.speed();
		Vehicle v1 = context.getBean("car",Vehicle.class);
		v1.speed();*/
		
		//using annotation
		ApplicationContext context = new AnnotationConfigApplicationContext(RunthroughAnnotation.class);
		RunthroughAnnotation v1 = context.getBean(RunthroughAnnotation.class);
		v1.speedCheck();
		/*Car v2 = context.getBean(Car.class);
		v2.speed();*/
		
		

	}

}
