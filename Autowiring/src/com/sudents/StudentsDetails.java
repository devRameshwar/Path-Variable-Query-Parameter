package com.sudents;

public class StudentsDetails {

	private int studentId;

	private String studentName;

	public int getStudentId() {
		return studentId;
	}

	public void setStudentId(int studentId) {
		this.studentId = studentId;
	}

	public String getStudentName() {
		return studentName;
	}

	public void setStudentName(String studentName) {
		this.studentName = studentName;
	}
	
	

	@Override
	public String toString() {
		return "StudentsDetails [studentId=" + studentId + ", studentName=" + studentName + "]";
	}

	public StudentsDetails() {
		System.out.println("Student object created....");
	}

}
