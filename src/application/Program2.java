package application;

import model.dao.DaoFactory;
import model.dao.DepartmentDao;
import model.dao.SellerDao;
import model.entities.Department;
import model.entities.Seller;

import java.util.List;
import java.util.Scanner;

import static java.lang.System.in;

public class Program2 {
    public static void main(String[] args) {

        Scanner scan = new Scanner(in);
        DepartmentDao departmentDao = DaoFactory.createDepartmentDao();

        // FIND BY ID
        System.out.println("Find department by Id: ");

        System.out.print("Enter a department id: ");
        int id = scan.nextInt();
        Department department = departmentDao.findById(id);

        System.out.println(department);
        System.out.println("-------------------");

        // FIND ALL
        System.out.println("Find all departments: ");

        List<Department> departments = departmentDao.findAll();

        for (Department dep: departments) {
            System.out.println(dep);
        }

        System.out.println("-------------------");

        // INSERT
        /* System.out.println("Insert department: ");

        Department newDepartment = new Department(null, "Music");
        departmentDao.insert(newDepartment);

        System.out.println("New Id: " + newDepartment.getId());

        System.out.println("-------------------"); */

        // UPDATE
        System.out.println("Update department: ");
        System.out.print("Enter a department Id: ");
        id = scan.nextInt();

        department = departmentDao.findById(id);
        department.setName("Perfumes");
        departmentDao.update(department);

        System.out.println("Update complete!");
        System.out.println(department);

        System.out.println("-------------------");

        // DELETE
        /* System.out.println("Delete department: ");
        System.out.print("Insert department Id: ");
        id = scan.nextInt();
        departmentDao.deleteById(id);
        System.out.println("Department with Id " + id + " was deleted from Database.");

        departments = departmentDao.findAll();

        for (Department dep: departments) {
            System.out.println(dep);
        } */

        scan.close();
    }
}
