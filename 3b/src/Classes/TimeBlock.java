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
	
	public String getDay(String day)
	{
		return Day=day; //return the days, MTWThF
	}
	
	public String getBeginTime(String begin)
	{
		return BeginTime=begin; //return the beginning time
	}
	
	public String getEndTime(String end)
	{
		return EndTime=end; //return the end time
	}
	
	public String getAMPM(String am_pm)
	{
		return AM_PM=am_pm; //return it's morning or afternoon
	}

}
