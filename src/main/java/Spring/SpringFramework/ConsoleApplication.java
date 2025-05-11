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
		
		ApplicationContext context = new ClassPathXmlApplicationContext(
            "appConfig.xml");
		
		Teacher T = (Teacher) context.getBean("teacherinfo");
		T.Teacherinfo();
		Students s = (Students) context.getBean("studentInfo");
		s.StudentRegiration(s.getName());
		
		

	}

}
