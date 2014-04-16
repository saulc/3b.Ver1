package list;

import java.util.ArrayList;

import Classes.Instructor;

public class InstructorList {
	private ArrayList<Instructor> instructors = new ArrayList<Instructor>();
	
	public InstructorList(){}
	
	private boolean checkDuplicate(String ID){
		for(int index = 0; index < instructors.size(); index++){
			if(instructors.get(index).getID() == ID){
				return true;
			}
		}
		return false;
	}
	
	public void generateList(RequestList requests){
		String name, ID;
		boolean Adjunct;
		for(int count = 1; count < requests.size(); count++){ //ignore first line, title line
			name = requests.getItem(count, 1);
			ID = requests.getItem(count, 2);
			if(requests.getItem(count, 3) == "yes"){
				Adjunct = true;
			} else {
				Adjunct = false;
			}
			if(!checkDuplicate(ID)){
				instructors.add(new Instructor(name,ID,Adjunct));
			}
		}
	}
	
	public Instructor getInstructor(int index){
		return instructors.get(index);
	}
	
	public void addInstructor(Instructor instructor){
		instructors.add(instructor);
	}
	
	public void removeInstructor(int index){
		instructors.remove(index);
	}
	
}
