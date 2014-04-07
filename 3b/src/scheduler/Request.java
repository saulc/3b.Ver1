package scheduler;

public class Request {
	private String name;
	private String course;
	private String days;
	private String time;
	
	Request(){};
	
	Request(String mName, String mCourse, String mDays, String mTime){
		name = mName;
		course = mCourse;
		days = mDays;
		time = mTime;
	}
	
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getCourse() {
		return course;
	}

	public void setCourse(String course) {
		this.course = course;
	}

	public String getDays() {
		return days;
	}

	public void setDays(String days) {
		this.days = days;
	}

	public String getTime() {
		return time;
	}

	public void setTime(String time) {
		this.time = time;
	}
	
}
