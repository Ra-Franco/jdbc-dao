package application;

import java.util.Date;

import model.entities.Departement;
import model.entities.Seller;

public class Main {

	public static void main(String[] args) {
		
		Departement obj = new Departement(1,"Books");
		Seller objS = new Seller(1, "Marco", "Marco@gmail.com", new Date(), 1200.00, obj);
		
		System.out.println(obj);
		System.out.println(objS);
		
	}

}
