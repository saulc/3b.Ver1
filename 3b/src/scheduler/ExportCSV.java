package scheduler;

import java.io.PrintWriter;
import java.util.ArrayList;

public class ExportCSV {
	
	ExportCSV(){};
	
	public void saveList(ArrayList<Request> requests, PrintWriter out){
		for(int count = 0; count < requests.size(); count++){
				out.print((String)requests.get(count).getCourse() + ";");
				out.print((String)requests.get(count).getName() + ";");
				out.print((String)requests.get(count).getDays() + ";");
				out.print((String)requests.get(count).getTime() + ";");
			out.println(""); //next line
		}
	}
}
