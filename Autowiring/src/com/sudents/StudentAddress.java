package com.sudents;

public class StudentAddress {

	private String studentAddress;

	private StudentsDetails student;

	public StudentAddress() {
		System.out.println("Student Address object created...");
	}

	public String getStudentAddress() {
		return studentAddress;
	}

	public void setStudentAddress(String studentAddress) {
		this.studentAddress = studentAddress;
	}

	public StudentsDetails getStudent() {
		return student;
	}

	public void setStudent(StudentsDetails student) {
		this.student = student;
	}

	@Override
	public String toString() {
		return "StudentAddress [studentAddress=" + studentAddress + ", student=" + student + "]";
	}

	 
	
	

}
