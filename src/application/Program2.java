package application;

import model.dao.DaoFactory;
import model.dao.DepartmentDao;
import model.dao.SellerDao;
import model.entities.Department;
import model.entities.Seller;

import java.util.Scanner;

import static java.lang.System.in;

public class Program2 {
    public static void main(String[] args) {

        Scanner scan = new Scanner(in);
        DepartmentDao departmentDao = DaoFactory.createDepartmentDao();

        System.out.println("Find department by Id: ");

        System.out.print("Enter a department id: ");
        int id = scan.nextInt();
        Department department = departmentDao.findById(id);

        System.out.println(department);
        System.out.println("-------------------");

        /* System.out.println("Insert department: ");

        Department newDepartment = new Department(null, "Music");
        departmentDao.insert(newDepartment);

        System.out.println("New Id: " + newDepartment.getId());

        System.out.println("-------------------"); */

        scan.close();
    }
}
