package Spring.SpringFramework;

public class Students {
	
	private String name;
	private String courseName;
	
	public void setcourseName(String courseName)
	{
		this.courseName=courseName;
	}
	
	public String getCourse() {
		return courseName;
	}
	
	public void setName(String name)
	{
		this.name=name;
	}
	
	public String getName()
	{
		return name;
	}
	
	public void StudentRegiration()
	{
		System.out.println("Welcome new Student: " +getName());
	}
	
	public void StudentCourse()
	
	{
		System.out.println("You have selected the course(using this) : "+this.courseName);
		System.out.println("You have selected the course(using getter) : "+getCourse());
	
	}

}
