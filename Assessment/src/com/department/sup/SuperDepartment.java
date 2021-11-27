package com.department.sup;
     //Super Department
public class SuperDepartment {

public  String departmentName()
{
    String dep = "dep";
    System.out.println("1) Super Department");
     return dep;
}
public  String  getTodaysWork()
	{
	String Work = " Work ";
	 System.out.println("* No Work as of now");
       
        return Work ;
	}
public  String getWorkDeadline()
	{
       String  line = " Nil ";
       System.out.println("* Nil");
        return line;
	}
public String TodayisAHoliday()

	{
	String Holiday="holiday";
	System.out.println("* Today is not a holiday");
      return Holiday;
	}
}
