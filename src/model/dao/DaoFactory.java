package model.dao;

import model.dao.impl.SellerDaoJDBC;

public class DaoFactory {
    // has static methods to instantiate Daos

    public static SellerDao createSellerDao() {
        return new SellerDaoJDBC();
    }
}
