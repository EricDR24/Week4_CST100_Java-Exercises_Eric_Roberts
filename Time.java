/** Program:  10.1 Time Class
  * File:     Time.java 
  * Summary:  Chapter 10, Excersise 1, create a Time Class
  * Author:   Eric Roberts
  * Date:     July 11, 2016
**/
public class Time {

	//Data assignments
	private long hour;
	private long minute;
	private long seconds;
	
	//create Time object
	Time() {
		this(0);
	}
	
	//constructor for elapsed time
	Time(long elaspseTime) {
		setTime(elaspseTime);
		
	}
	
	//new time for elapsed time
	private void setTime(long elaspseTime) {
		long Milliseconds = System.currentTimeMillis();
		long Seconds = Milliseconds / 1000;
		seconds = Seconds % 60;
		long Minutes = Seconds / 60;
		minute = Minutes % 60;
		long Hours = Minutes / 60;
		hour = Hours % 24;
		
		//boolean to get time
		if (elaspseTime > 0) {
			Seconds = elaspseTime / 1000;
			seconds += Seconds % 60;
			Minutes = Seconds / 60;
			minute += Minutes % 60;
			Hours = Minutes / 60;
			hour += Hours % 24;
		}
	
		
	}

	//Constructor for specified Time
	private Time(long hour, long minute, long second) {
		this.hour = hour;
		this.minute = minute;
		this.seconds = seconds;
	}
	
	//getters for Time
	public long getHours() {
		return hour;
	}
	
	public long getMinutes() {
		return minute;
	}
	
	public long getSeconds() {
		return seconds;
	}


}
