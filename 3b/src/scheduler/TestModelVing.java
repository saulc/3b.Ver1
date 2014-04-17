package scheduler;

import javax.swing.table.DefaultTableModel;

import list.CourseList;
import list.InstructorList;
import list.RequestList;
import list.TimeBlockList;

public class TestModelVing extends DefaultTableModel{
	private CourseList courses;
	private InstructorList instructors;
	private TimeBlockList timeblocks;
	private RequestList requests;
	
	public TestModelVing(ImportParser parser){
		courses = parser.getCourseList();
		instructors = parser.getInstructorList();
		timeblocks = parser.getTimeBlockList();
		requests = parser.getRequestList();
		this.addColumn("Data 1");
		this.addColumn("Data 2");
		this.addColumn("Data 3");
		this.addColumn("Data 4");
	}
	
	public void checkCourseList(){
		for(int index = 0; index < courses.getSize(); index++ ){
			this.addRow(new Object[]{
					courses.getCourse(index).getDept(),
					courses.getCourse(index).getName(),
					courses.getCourse(index).getTimeBlock().getDay(),
					courses.getCourse(index).getInstructor().getName()
			});
		}
	}
	
	public void checkTimeBlockList(){
		for(int index = 0; index < timeblocks.getSize(); index++ ){
			this.addRow(new Object[]{
					timeblocks.getTimeBlock(index).getDay(),
					timeblocks.getTimeBlock(index).getBeginTime(),
					timeblocks.getTimeBlock(index).getEndTime(),
					timeblocks.getTimeBlock(index).getAMPM()
			});
			System.out.println(timeblocks.getTimeBlock(index).getDay());
		}
	}
	
	public void checkInstructorList(){
		for(int index = 0; index < instructors.getSize(); index++ ){
			this.addRow(new Object[]{
					instructors.getInstructor(index).getID(),
					instructors.getInstructor(index).getID(),
					instructors.getInstructor(index).getName(),
					instructors.getInstructor(index).getName()
			});
		}
	}
	
	public void checkRequestList(){
		for(int index = 0; index < requests.getSize(); index++ ){
			this.addRow(new Object[]{
					requests.getItem(index, 1),
					requests.getItem(index, 2),
					requests.getItem(index, 3),
					requests.getItem(index, 4)
			});
		}
	}
	
	
}
