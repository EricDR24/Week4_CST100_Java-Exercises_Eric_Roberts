/** Program:  10.9 Course Class
  * File:     mainTax.java 
  * Summary:  Chapter 10, Excersise 9, create a Course Class
  * Author:   Eric Roberts
  * Date:     July 17, 2016
**/
public class Course {
	
	//create Data Fields
	private String course;
	private String[] students = new String[1];
	private int numberStudents;
	
	//create course constructor
	public Course(String course) {
		this.course = course;
	}
	
	//create constructor
	public void addStudent(String student) {
	
	//increase size of array
	if (numberStudents == students.length) {
		String[] a = new String[students.length + 1];
		for (int i = 0; i < numberStudents; i++) {
			a[i] = students[i];
			}
		students = a;
		}
	students[numberStudents] = student;
	numberStudents++;
	}
	
	//getters
	public String[] getStudents() {
		return students;
	}
	
	public int getNumberStudents() {
		return numberStudents;
	}
	
	public String getCourse() {
		return course;
	}
	
	//remove student
	public void dropStudent(String student) {
		int Student = Student(student);
		if (Student >= 0) {
			dropStudent(Student);
		}
		else {
			System.out.println(Student + " is no longer in the course: " + course);
		}
	
  }
	
	//clear all students
			public void clear() {
				students = new String[1];
				numberStudents = 0;
			}

	private void dropStudent(int Student) {
		String[] st = new String[students.length - 1];
		for (int i = 0, j = 0; i < st.length; i++, j++) {
			if (i == Student) {
				j++;
			}
			st[i] = students[j];
		}
		
		this.students = st;
		numberStudents--;
	}

	private int Student(String student) {
		for (int i = 0; i < numberStudents; i++) {
			if (students[i].equals(student)) {
				return i;
			}
		}
		return -1;
		
		
		
	}
}
