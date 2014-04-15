package scheduler;

import java.util.ArrayList;

public class RequestList {

	private ArrayList<String[]> items = new ArrayList<String[]>();
	
	RequestList(){
		
	};
	
	public int size(){
		return items.size();
	}
	
	public String[] getArray(int index){
		return items.get(index);
	}
	
	public String getItem(int lineIndex, int index){
		return items.get(lineIndex)[index];
	}
	
	public void add(String[] input){
		items.add(input);
	}
	
}
