package Classes;

public class Course {
	
	private String Dept;
	private String Code;
	private Instructor Prof;
	
	public Course(String department, String code, Instructor prof)
	{
		Dept = department;
		Code = code;
		if(prof != null)
			Prof = prof;
	}
	
	public String getDept()
	{
		return Dept; //return the department, such as Math and CS
	}
	
	public String getCode()
	{
		return Code; //return the course number
	}
	public Instructor getInstructor(){
		return Prof;
	
	}
	//sets new instructor and returns previous one
	public Instructor swapInstructor(Instructor newProf){
		Instructor temp = Prof;
		Prof = newProf;
		return temp;
	}
}
