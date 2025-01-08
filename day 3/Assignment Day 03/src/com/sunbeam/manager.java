package com.sunbeam;


public class manager extends employee{
	private double performanceBonus;

	public manager() {
		super();
		this.performanceBonus=0.0;
	}
	public manager(int empId, String name, String deptId, double basicsalary) {
		super(empId, name, deptId, basicsalary);
		this.performanceBonus=0.0;
	}
	public manager(int empId, String name, String deptId, double basicsalary,double performanceBonus) {
		super(empId, name, deptId, basicsalary);
		this.performanceBonus=performanceBonus;
	}
	public double getPerformanceBonus() {
		return performanceBonus;
	}
}