package application;

import model.dao.DaoFactory;
import model.dao.DepartmentDao;
import model.entities.Department;

import java.util.Scanner;

import static java.lang.System.in;

public class Program2 {
    public static void main(String[] args) {

        Scanner scan = new Scanner(in);

        /* System.out.println("Insert department: ");

        DepartmentDao departmentDao = DaoFactory.createDepartmentDao();
        Department newDepartment = new Department(null, "Music");
        departmentDao.insert(newDepartment);

        System.out.println("New Id: " + newDepartment.getId());

        System.out.println("-------------------"); */

        scan.close();
    }
}
