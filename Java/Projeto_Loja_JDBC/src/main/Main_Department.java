package main;

import java.util.ArrayList;
import java.util.List;

import model.dao.DaoFactory;
import model.dao.DepartmentDao;
import model.entities.Department;

public class Main_Department {

	public static void main(String[] args) {
	      System.out.println( "Search department by id:");
	      DepartmentDao dpDao = DaoFactory.createDepartmentDao();
	      Department dp= dpDao.findByID(1);
	      System.out.println(dp);
	      System.out.println("---------------------------------------");
	      System.out.println( "All department:");
	      List <Department> list = new ArrayList<>();
	      list= dpDao.findall();
	      for(Department department :list) {
	    	  System.out.println(department);
	    	  
	      }
	      System.out.println("---------------------------------------");
	      
	      System.out.println("Entering department:");
	      Department dp2= new Department(null, "Marketing");
	      dpDao.insert(dp2);
	      System.out.println(dpDao.findByID(5));
	      dpDao.deleteByid(6);

	}

}
