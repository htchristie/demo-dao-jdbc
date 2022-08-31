package application;

import model.dao.DaoFactory;
import model.dao.SellerDao;
import model.dao.impl.SellerDaoJDBC;
import model.entities.Department;
import model.entities.Seller;

import java.util.Date;
import java.util.List;
import java.util.Scanner;

import static java.lang.System.in;

public class Program {
    public static void main(String[] args) {

        Scanner scan = new Scanner(in);

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

        System.out.println("Find all Sellers: ");

        sellerList = sellerDao.findAll();

        for (Seller seller1: sellerList) {
            System.out.println(seller1);
        }

        System.out.println("-------------------");

        /* System.out.println("Insert seller: ");

        Seller newSeller = new Seller(null, "Greg", "greg@gmail.com", new Date(), 4000.0, department);
        sellerDao.insert(newSeller);
        System.out.println("New Id: " + newSeller.getId());

        System.out.println("-------------------"); */

        /* System.out.println("Update seller: ");

        seller = sellerDao.findById(9);
        seller.setName("Gregory");
        sellerDao.update(seller);

        System.out.println("Update complete!");
        System.out.println(seller);

        System.out.println("-------------------"); */

        System.out.println("Delete seller: ");
        System.out.print("Insert seller Id: ");
        int id = scan.nextInt();
        sellerDao.deleteById(id);
        System.out.println("Seller with Id " + id + " was deleted from Database.");

        sellerList = sellerDao.findAll();

        for (Seller seller1: sellerList) {
            System.out.println(seller1);
        }

        scan.close();
    }
}
