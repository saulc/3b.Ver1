package Classes;

public class Instructor extends Person {
	
	private String ID;
	private String name;
	private Boolean Adjunct;
	
	public Instructor()
	{
		name="";
		ID="";
		Adjunct=false;
	}
	
	public String getName(String person_name)
	{
		return super.getName(person_name); //return instructor's name
	}
	
	public String getID(String person_ID)
	{
		return ID=person_ID; //return instructor's ID
	}
	
	public void isAdjunct(String adjunct)
	{
		if (adjunct.equals("Adjunct"))
		{
			Adjunct=true; ////return whether instructor is adjunct or not
		}
	}
}
