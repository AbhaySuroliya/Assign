package com.Day6.eLearning;

public class CourseDetails {
	private String coursename;
	private int courseid;
	private String coursedetails;
	public CourseDetails(String coursename, int courseid, String coursedetails) {
		super();
		this.coursename = coursename;
		this.courseid = courseid;
		this.coursedetails = coursedetails;
	}
	public String getCoursename() {
		return coursename;
	}
	public void setCoursename(String coursename) {
		this.coursename = coursename;
	}
	public int getCourseid() {
		return courseid;
	}
	public void setCourseid(int courseid) {
		this.courseid = courseid;
	}
	public String getCoursedetails() {
		return coursedetails;
	}
	public void setCoursedetails(String coursedetails) {
		this.coursedetails = coursedetails;
	}
	@Override
	public String toString() {
		return "CourseDetails [coursename=" + coursename + ", courseid=" + courseid + ", coursedetails=" + coursedetails
				+ "]";
	}
	
}
