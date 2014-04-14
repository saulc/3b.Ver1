package scheduler;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.Scanner;

import javax.swing.JFileChooser;

public class ExportCSV {
	
	ExportCSV(){};
	private JFileChooser fileChooser = new JFileChooser(); 
	
	public void saveList(ArrayList<Request> requests, PrintWriter out){
		for(int count = 0; count < requests.size(); count++){
				out.print((String)requests.get(count).getCourse() + ";");
				out.print((String)requests.get(count).getName() + ";");
				out.print((String)requests.get(count).getDays() + ";");
				out.print((String)requests.get(count).getTime() + ";");
			out.println(""); //next line
		}
	}
	
	public void saveFile(ArrayList<Request> requests){
		int returnVal = fileChooser.showSaveDialog(null);
		File myfile = null;
		if (returnVal == JFileChooser.APPROVE_OPTION){
			myfile = fileChooser.getSelectedFile();
			try {
				PrintWriter out = new PrintWriter(myfile);
				saveList(requests, out);
				out.close();
			} catch (FileNotFoundException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		};	
	}
}
