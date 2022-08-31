package application;

import model.dao.DaoFactory;
import model.dao.SellerDao;
import model.entities.Seller;

public class Program {
    public static void main(String[] args) {

        System.out.println("Find Seller by Id: ");

        SellerDao sellerDao = DaoFactory.createSellerDao();
        Seller seller = sellerDao.findById(3);

        System.out.println(seller);
        System.out.println("-------------------");
    }
}
