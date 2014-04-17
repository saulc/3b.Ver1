package list;

import java.util.ArrayList;

import Classes.TimeBlock;

public class TimeBlockList {
	private ArrayList<TimeBlock> timeblocks = new ArrayList<TimeBlock>();
	private ArrayList<TimeBlock> uniqueTimeBlocks = new ArrayList<TimeBlock>();
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
		uniqueParse();
	}
	
	private boolean checkDuplicate(TimeBlock time){
		String day = time.getDay();
		String begin = time.getBeginTime();
		String end = time.getEndTime();
		String AM = time.getAMPM();
		
		for(int index = 0; index < uniqueTimeBlocks.size(); index++){
			if(day == uniqueTimeBlocks.get(index).getDay()
					&& begin == uniqueTimeBlocks.get(index).getBeginTime()
					&& end == uniqueTimeBlocks.get(index).getEndTime()
					&& AM == uniqueTimeBlocks.get(index).getAMPM()){
				return true;
			}
		}
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
		timeblocks.add(new TimeBlock(Day, BeginTime, EndTime, AM_PM));
	}
	
	private void uniqueParse(){
		for(int index = 0; index < timeblocks.size(); index++){
			if(!checkDuplicate(timeblocks.get(index))){
				uniqueTimeBlocks.add(timeblocks.get(index));
			}
		}
	}
	
	public TimeBlock getTimeBlock(int index){
		return timeblocks.get(index);
	}
}
