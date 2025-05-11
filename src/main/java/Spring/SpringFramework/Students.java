package Spring.SpringFramework;

public class Students {
	
	String name;
	
	public void setName(String name)
	{
		this.name=name;
	}
	
	public String getName()
	{
		return name;
	}
	
	public void StudentRegiration(String name)
	{
		System.out.println("Welcome new Student: " +this.name);
	}

}
