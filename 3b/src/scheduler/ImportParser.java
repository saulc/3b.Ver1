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

import java.io.File;
import java.util.ArrayList;
import java.util.Scanner;

public class ImportParser {
	private ArrayList<Request> requests = new ArrayList<Request>(); //Parse csv into this ArrayList
	
	ImportParser(){};
	
	public void parse(Scanner in){
		String line;
		String word;
		char letter;
		ArrayList<String> request = new ArrayList<String>();
		
		
		while(in.hasNext()){
			line = in.nextLine();//System.out.println(line);
			word = "";
			
			for(int count = 0; count < line.length(); count++){
				letter = line.charAt(count);
				if(letter != ';'){
					//System.out.print(letter);
					word += letter;
				} else {
					request.add(word);
					//System.out.print("AR" + arrayCount);
					word = "";
				}
			}
			
			Request mRequest = new Request(request.get(0), 
						request.get(1), 
						request.get(2), 
						request.get(3));
			
			requests.add(mRequest);
			request.clear();
		};
		in.close();
	}
	
	public int getSize(){
		return requests.size();
	}
	
	public Request getRequest(int index){
		return requests.get(index);
	}
	
	public ArrayList<Request> getArrayList(){
		return requests;
	}
	
}
