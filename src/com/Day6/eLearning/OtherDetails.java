package com.Day6.eLearning;

public class OtherDetails {
	private int stuId;
    private int CId;
    
    public OtherDetails(int stuId, int cId) {
		super();
		this.stuId = stuId;
		CId = cId;
	}
	public int getStuId() {
		return stuId;
	}
	public void setStuId(int stuId) {
		this.stuId = stuId;
	}
	public int getCId() {
		return CId;
	}
	public void setCId(int cId) {
		CId = cId;
	}
	
	@Override
	public String toString() {
		return "BothDetails [stuId=" + stuId + ", CId=" + CId + "]";
	}
}
