package scheduler;

import java.io.PrintWriter;
import java.util.ArrayList;

import list.RequestList;

public class ExportCSV {
	
	ExportCSV(){};
	
	public void saveList(RequestList requests, PrintWriter out){
		for(int count = 0; count < requests.getSize(); count++){
			for(int index = 0; index < 13; index++){
				out.print((String)requests.getItem(count, index) + ";");
			}
			out.println(""); //next line
		}
	}
}
