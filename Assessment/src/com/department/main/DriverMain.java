package com.department.main;

import com.department.admin.AdminDepartment;
import com.department.hr.HrDepartment;
import com.department.sup.SuperDepartment;
import com.department.tech.TechDepartment;
   // DriverMain class
public class DriverMain {

	public static void main(String[] args) {
		
 // Super Department 
		SuperDepartment dis = new SuperDepartment();
			dis.departmentName();
			dis.getTodaysWork();
			dis.getWorkDeadline();
			dis.TodayisAHoliday();
			
 //Admin Department
		AdminDepartment dis1 = new AdminDepartment();
			dis1.departmentName();
			dis1.getTodaysWork();
			dis1.getWorkDeadline();
		
 //Tech Department
		TechDepartment dis2 = new TechDepartment();
			dis2.departmentName();
			dis2.getTodaysWork();
			dis2.getWorkDeadline();
			dis2.getTechStackInformation();
		
 // HR Department
		HrDepartment dis3 = new  HrDepartment();
			dis3.departmentName();
			dis3.getTodaysWork();
			dis3.getWorkDeadline();
			dis3.doActivity();
			 
	}

}
