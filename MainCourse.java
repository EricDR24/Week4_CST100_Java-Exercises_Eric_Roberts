/** Program:  10.9 Course Class
  * File:     mainTax.java 
  * Summary:  Chapter 10, Excersise 9, create a Course Class
  * Author:   Eric Roberts
  * Date:     July 17, 2016
**/
public class MainCourse {

	public static void main(String[] args) {
		
		//Create Course
		Course cst100 = new Course("cst100");
		
		//add students
		cst100.addStudent("Eric");
		cst100.addStudent("Jessica");
		cst100.addStudent("Ella");
		
		//remove student
		cst100.dropStudent("Eric");
		
		//print students in course
		System.out.println("The students in the course " + cst100.getCourse() + " are :");
		String[] students = cst100.getStudents();
		for (int i = 0; i < cst100.getNumberStudents(); i++) {
			System.out.println(students[i] + " ");
		}
		
		}

		
		

	}


