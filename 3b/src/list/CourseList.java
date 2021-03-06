package list;

import java.util.ArrayList;

import Classes.Course;
import Classes.Instructor;
import Classes.TimeBlock;

public class CourseList {
	private ArrayList<Course> courses = new ArrayList<Course>();
	
	public CourseList(){}
	
	public void generateList(RequestList requests, InstructorList instructors, TimeBlockList timeblocks){
		requests.remove(0);
		int timeIndex = 0;
		int course_index;
		String course = "";
		String dept = "";
		for(int index = 0; index < requests.getSize(); index++){
			for(int cindex = 0; cindex < 4; cindex++){
				// refer to Course(String department, String name, TimeBlock block, Instructor prof)
				course_index = cindex + 5;
				course = requests.getItem(index, course_index);
				
				if(course.isEmpty()){
					dept = "";
				} else if(course.charAt(0) == 'C'){
					dept = "CS";
				} else {
					dept = "Math";
				}
				
				courses.add(new Course(
					dept,
					course,
					timeblocks.getTimeBlock(timeIndex),
					instructors.getInstructor(index) 
					)
				);
				
				timeIndex++;
			}
			
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
