package com.department.hr;
     // Hr Department
public class HrDepartment {
	public  String departmentName()
	{
	    String  Hr = " Hr";
	    System.out.println("Welcome to Hr Department");
	     return  Hr;
	     }
	public  String  getTodaysWork()
		{
		String attendance = "attendance";
		 System.out.println("* Fill today’s timesheet and mark your attendance");
	       
	        return attendance ;
		}
	public  String getWorkDeadline()
		{
	       String  Com  = " Com ";
	       System.out.println("* Complete by EOD ");
	        return Com ;
		}
	public String doActivity()

		{
		String Lunch="Lunch";
		System.out.println("* Team Lunch");
	      return Lunch;
		}

}