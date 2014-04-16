package scheduler;
//METHODS:
//void parse: inputs(Scanner)
//int getSize: inputs(none)
//Request getRequest: input(none);
//ArrayList<Request> getArrayList(): input(none);
//
//USE:
//created new ImportParser object. Then create scanner object.
//use parse method with argument of scanner object
//parse into ArrayList of Request; please adjust parse method and when Request is changed

import java.util.ArrayList;
import java.util.Scanner;

import list.RequestList;
import Classes.Course;

public class ImportParser {
	private RequestList requests = new RequestList(); //Parse csv into this RequestList
	
	public ImportParser(){}; //Constructor
	
	private void requestAdd(ArrayList<String> request){
		int listLength = request.size();
		String[] requestArray = new String[13];
		for(int count = 0; count < listLength; count++){
			requestArray[count] = request.get(count);
		}
		requests.add(requestArray);
	} //Converts ArrayList to array to import to RequestList
	
	
	public void parse(Scanner in){ //Reads one line at a time
		String line;
		String word;
		char letter;
		
		while(in.hasNext()){
			ArrayList<String> request = new ArrayList<String>();
			line = in.nextLine();//System.out.println(line);
			word = "";
			
			for(int count = 0; count < line.length(); count++){
				letter = line.charAt(count);
				if(letter != ','){
					//System.out.print(letter);
					word += letter;
				} else {
					request.add(word);
					//System.out.print("AR" + arrayCount);
					word = "";
				}
			}
			
			requestAdd(request);
		};
		
		in.close();
	}
	
	public int getSize(){
		return requests.size();
	}
	
	public String[] getRequest(int index){
		return requests.getArray(index);
	}
	
	public RequestList getRequestList(){
		return requests;
	}
	
}
