package com.college;

import com.sudents.StudentAddress;
import com.sudents.StudentsDetails;

public class College {

	private String collegeName;

	private StudentsDetails student;

	private StudentAddress address;

	@Override
	public String toString() {
		return "College [collegeName=" + collegeName + ", student=" + student + ", address=" + address + "]";
	}

	public String getCollegeName() {
		return collegeName;
	}

	public void setCollegeName(String collegeName) {
		this.collegeName = collegeName;
	}

	public StudentsDetails getStudent() {
		return student;
	}

	public void setStudent(StudentsDetails student) {
		this.student = student;
	}

	public StudentAddress getAddress() {
		return address;
	}

	public void setAddress(StudentAddress address) {
		this.address = address;
	}

	public College() {
		System.out.println("College object created....");
	}

}
