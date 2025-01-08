package com.sunbeam;

public class worker extends employee{
	private int hoursWorked;
	private double hourlyRate;
	
	public worker() {
		super();
		this.hoursWorked=0;
		this.hourlyRate=0.0;
	}
	public worker(int empId, String name, String deptId, double basicsalary,int hoursWorked,double hourlyRate) {
		super(empId, name, deptId, basicsalary);
		this.hoursWorked=hoursWorked;
		this.hourlyRate=hourlyRate;
	}
	
	public int getHoursWorked() {
		return hoursWorked;
	}
	
	public void setHoursWorked(int hoursWorked) {
		this.hoursWorked = hoursWorked;
	}
	
	public double getHourlyRate() {
		return hourlyRate;
	}
	
	public void setHourlyRate(double hourlyRate) {
		this.hourlyRate = hourlyRate;
	}
	@Override
	public String toString() {
		return super.toString()+"[hoursWorked=" + hoursWorked + ", hourlyRate=" + hourlyRate + "]";
	}
	
	@Override
	public double computeNetSalary() {
		
		return this.getBasicsalary()+this.hoursWorked*this.hourlyRate;
	}
	
	

}