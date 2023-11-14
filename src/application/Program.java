package application;

import java.util.Date;

import model.dao.DaoFactory;
import model.dao.SellerDAO;
import model.entities.Department;
import model.entities.Seller;

public class Program {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Department obj = new Department(1, "book"); 
		System.out.println(obj);
		Seller seller = new Seller(21, "bob", "bob@gamil.com", new Date(),3000.0, obj);
		System.out.println(seller);
		SellerDAO sellerDao = DaoFactory.createSellerDao();
		
	}
}
