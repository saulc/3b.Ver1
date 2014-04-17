package list;

import java.util.ArrayList;

import Classes.Course;

public class CourseList {
	private ArrayList<Course> courses = new ArrayList<Course>();
	
	public CourseList(){}
	
	public void createList(RequestList requests, InstructorList instructors, TimeBlockList timeblocks){
		requests.remove(0);
		for(int index = 0; index < requests.size(); index++){
		courses.add(new Course(requests.getItem(index, 1),
				requests.getItem(index, 2),
				timeblocks.getTimeBlock(index),
				instructors.getInstructor(index) )
		);
		}
	}
	
	public Course getCourse(int index){
		return courses.get(index);
	}
	
	public int getSize(){
		return courses.size();
	}
	
	public void removeCourse(int index){
		courses.remove(index);
	}
	
	public void addCourse(Course course){
		courses.add(course);
	}
}
