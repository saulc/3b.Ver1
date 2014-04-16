package list;

import java.util.ArrayList;

import Classes.TimeBlock;

public class TimeBlockList {
	private ArrayList<TimeBlock> timeblocks = new ArrayList<TimeBlock>();
	
	public TimeBlockList(){};
	
	public void generateList(RequestList requests){
		String time = "";
		for(int index = 1; index < requests.size(); index++){ //ignore first line, title line
			time = requests.getItem(index, 9);
			parseTime(time);
			time = requests.getItem(index, 10);
			parseTime(time);
			time = requests.getItem(index, 11);
			parseTime(time);
			time = requests.getItem(index, 12);
			parseTime(time);
		}
	}
	
	private boolean checkDuplicate(){
		return false;
	}
	
	private void parseTime(String time){
		//parsing Mon/Wed - 9:45 - 12:15pm
		String Day, BeginTime, EndTime, AM_PM;
		char letter;
		String[] word = {"","",""};
		int wordIndex = 0;
		for(int count = 0; count < time.length(); count++){
			letter = time.charAt(count);
			if(letter != ' ' || letter != '-'){
				//System.out.print(letter);
				word[wordIndex] += letter;
			} else if(word.length > 0){
				wordIndex++;
			}
		}
		Day = word[0];
		BeginTime = word[1];
		wordIndex = 0;
		for(int count = 0; count < word[2].length(); count++){
			letter = word[2].charAt(count);
			if(!Character.isLetter(letter)){
				wordIndex++;
			}
			word[wordIndex] += letter;
		}
		EndTime = word[0];
		AM_PM = word[1];
		if(!checkDuplicate()){
			timeblocks.add(new TimeBlock(Day, BeginTime, EndTime, AM_PM));
		}
	}
}
