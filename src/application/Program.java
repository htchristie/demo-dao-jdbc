package application;

import model.dao.DaoFactory;
import model.dao.SellerDao;
import model.entities.Department;
import model.entities.Seller;

import java.util.List;

public class Program {
    public static void main(String[] args) {

        System.out.println("Find Seller by Id: ");

        SellerDao sellerDao = DaoFactory.createSellerDao();
        Seller seller = sellerDao.findById(3);

        System.out.println(seller);
        System.out.println("-------------------");

        System.out.println("Find Seller by Department: ");

        Department department = new Department(2, null);
        List<Seller> sellerList = sellerDao.findByDepartment(department);

        for (Seller seller1: sellerList) {
            System.out.println(seller1);
        }

        System.out.println("-------------------");
    }
}
