package scheduler;

import java.io.File;
import java.util.ArrayList;
import java.util.Scanner;

public class ImportParser {
	private ArrayList<Request> requests = new ArrayList<Request>(); //Parse csv into this ArrayList
	
	ImportParser(){};
	
	public void parse(File file, Scanner in){
		String line;
		String word;
		char letter;
		int arrayCount;
		String[] request = new String[4]; 
		
		
		while(in.hasNext()){
			line = in.nextLine();//System.out.println(line);
			word = "";
			arrayCount = 0;
			
			for(int count = 0; count < line.length(); count++){
				letter = line.charAt(count);
				if(letter != ';'){
					//System.out.print(letter);
					word += letter;
				} else {
					request[arrayCount] = word;
					arrayCount++;
					//System.out.print("AR" + arrayCount);
					word = "";
				}
			}
			
			Request mRequest = new Request(request[0], 
						request[1], 
						request[2], 
						request[3]);
			
			requests.add(mRequest);
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
