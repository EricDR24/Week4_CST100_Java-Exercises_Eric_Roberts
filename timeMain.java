/** Program:  10.1 Time Class
  * File:     timeMain.java 
  * Summary:  Chapter 10, Excersise 1, create a Time class
  * Author:   Eric Roberts
  * Date:     July 11, 2016
**/
public class timeMain {

	public static void main(String[] args) {
		//create Time objects
		Time t1 = new Time();
		Time t2 = new Time(555550000);
		
		//display time
		System.out.println(t1.getHours() + ":" + t1.getMinutes() + ":" + t1.getSeconds());
		System.out.println(t2.getHours() + ":" + t2.getMinutes() + ":" + t1.getSeconds());
	}

}
