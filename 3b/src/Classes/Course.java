package Classes;

public class Course {
	
	private String Dept;
	private String Code;
	
	public Course()
	{
		Dept="";
		Code="";
	}
	
	public String getDept(String department)
	{
		return Dept=department; //return the department, such as Math and CS
	}
	
	public String getCode(String course_ID)
	{
		return Code=course_ID; //return the course number
	}
}
