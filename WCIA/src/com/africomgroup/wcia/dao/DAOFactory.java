/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.africomgroup.wcia.dao;

/**
 *
 * @author Jordy Mugeni
 */
public class DAOFactory {

    public static CustomerDAO createCustomerDOA() {
        return new CustomerDAODBImpl();
    }

}
