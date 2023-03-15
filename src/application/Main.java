package application;

import java.util.Date;

import model.dao.DaoFactory;
import model.dao.SellerDao;
import model.entities.Department;
import model.entities.Seller;

public class Main {

	public static void main(String[] args) {
		
		Department obj = new Department(1,"Books");
		Seller objS = new Seller(1, "Marco", "Marco@gmail.com", new Date(), 1200.00, obj);
		
		SellerDao sellerDao = DaoFactory.createSellerDao();
		
		System.out.println(obj);
		System.out.println(objS);
		
	}

}
