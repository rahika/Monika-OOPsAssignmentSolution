package com.department.admin;

import com.department.sup.SuperDepartment;
        //Admin Department
public class AdminDepartment extends SuperDepartment{

public  String departmentName()
{
    String Admin= "Admin";
    System.out.println("Welcome to Admin Department");
     return Admin;
}
public  String  getTodaysWork()
	{
	String Submission = "Submission";
	 System.out.println("* Complete your documents Submission");
       
        return Submission ;
	}
public  String getWorkDeadline()
	{
       String  EOD  = "EOD ";
       System.out.println("* Complete by EOD ");
        return  EOD ;
	}
}


