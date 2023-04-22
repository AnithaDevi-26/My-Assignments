package student;

import department.Department;

public class Student extends Department {
	public void studentName() {
		System.out.println("studentName from student");
	}
	public void studentDept() {
		System.out.println("studentDept from student");
	}
	public void studentId() {
		System.out.println("studentId from student");
	}

	public static void main(String[] args) {
	
		Student stud = new Student();
		stud.studentName();
		stud.studentDept();
		stud.studentId();
		stud.deptName();
		stud.collegeName();
		stud.collegeCode();
		stud.collegeRank();
		}
	
}
