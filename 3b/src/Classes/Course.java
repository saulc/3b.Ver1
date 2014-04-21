package Classes;

public class Course {
	
	private String Dept;
	private String Code;
	private String Name;
	private Instructor Prof;
	private TimeBlock Block;
	
	public Course()
	{
		Dept = "";
		Name = "";
	}
	
	public Course(String department, String name, TimeBlock block, Instructor prof)
	{
		Dept = department;
		Name = name;
		Block = block;
		Prof = prof;
	}
	
	public String getName(){
		return Name;
	}
	public TimeBlock getTimeBlock(){
		return Block;
	}
	public String getDept()
	{
		return Dept; //return the department, such as Math and CS
	}
	
	public String getCode()
	{
		return Code; //return the course number
	}
	public void setCode(String code){
		Code = code;
	}
	public Instructor removeInstructor(){
		Instructor temp = Prof;
		Prof = null;
		return temp;
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
