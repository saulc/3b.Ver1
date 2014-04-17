package Classes;

public class TimeBlock {
	
	private String Day;
	private String BeginTime;
	private String EndTime;
	private String AM_PM;
	
	public TimeBlock()
	{
		Day="";
		BeginTime="";
		EndTime="";
		AM_PM="";
	}
	
	public TimeBlock(String mDay,String mBeginTime, String mEndTime,String mAM_PM){
		Day = mDay;
		BeginTime = mBeginTime;
		EndTime = mEndTime;
		AM_PM = mAM_PM;
	}
	
	public String getDay()
	{
		return Day; //return the days, MTWThF
	}
	
	public String getBeginTime()
	{
		return BeginTime; //return the beginning time
	}
	
	public String getEndTime()
	{
		return EndTime; //return the end time
	}
	
	public String getAMPM()
	{
		return AM_PM; //return it's morning or afternoon
	}

}
