package main;
import java.util.Date;
import java.util.List;

import model.dao.DaoFactory;
import model.dao.SellerDao;
import model.entities.Department;
import model.entities.Seller;

public class Main_Seller {

	public static void main(String[] args)  {
		
		SellerDao SellerDao= DaoFactory.createSellerDao();
		System.out.println("Search seller by id:");
	    Seller seller= SellerDao.findByID(3);
	    System.out.println(seller);
		System.out.println("---------------------------------------");
	    Department dp = new Department(2,null);
	    System.out.println("Search for sellers in a department:");
	    List <Seller> list= SellerDao.findByDepartment(dp);
	    for(Seller obj : list) {
	      System.out.println(obj);
	    }
	    System.out.println("---------------------------------------");
	    System.out.println( "Show all sellers:");
	    list= SellerDao.findall();
	    for(Seller obj : list) {
	      System.out.println(obj);
	    }
	    System.out.println("---------------------------------------");
	    System.out.println("enter a seller:");
	    Seller seller2 = new Seller (null, "Joao Victor","joao-victor@hotmail.com",new Date(), 2000,dp);
	    SellerDao.insert(seller2);
	    seller2= new Seller(null, "Joao Victor","joao-victor22@hotmail.com",new Date(), 2000,dp);
	    SellerDao.insert(seller2);
	    System.out.println(SellerDao.findByID(17));
	    System.out.println("---------------------------------------");
	    System.out.println("updating a seller's registration");
	    seller= SellerDao.findByID(1);
	    seller.setName("Maria");
	    SellerDao.update(seller);
	    System.out.println("---------------------------------------");
	    
	
	
	}

}
