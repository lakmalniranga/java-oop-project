/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package student.results.management.controller;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.SQLIntegrityConstraintViolationException;
import javax.swing.JOptionPane;
import student.results.management.modal.User;

/**
 *
 * @author Lakmal
 */
public class UserController {
    public boolean create(String name, String email, String username, String password) {
        try {
            String[] columns = {"str:" + name, "str:" + email, "str:" + username, "str:" + password};
            User b = new User();
            b.create(columns);
            
            return true;
        } catch (SQLIntegrityConstraintViolationException ex) {
            JOptionPane.showMessageDialog(null, "Duplicate values has been tried to insert, Please check again", "ERROR" , JOptionPane.ERROR_MESSAGE);
        } catch (Exception ex) {
            JOptionPane.showMessageDialog(null, ex, "ERROR" , JOptionPane.ERROR_MESSAGE);
        }
        return false;
    }
    
    public ResultSet getAllData() {
        try {
            User b = new User();
            return b.selectAll();
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, ex, "ERROR" , JOptionPane.ERROR_MESSAGE);
        }
        return null;
    }
    
    public boolean delete(String value) {
        try {
            User b = new User();
            b.delete(value);
            return true;
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, ex, "ERROR" , JOptionPane.ERROR_MESSAGE);
        }
        return false;
    }
    
    public boolean update(int id, String name, int year) {
//        try {
//            User b = new User();
//            b.update(id, name, year);
//            return true;
//        } catch (SQLIntegrityConstraintViolationException ex) {
//            JOptionPane.showMessageDialog(null, "Duplicate values has been tried to insert, Please check again", "ERROR" , JOptionPane.ERROR_MESSAGE);
//        } catch (Exception ex) {
//            JOptionPane.showMessageDialog(null, ex, "ERROR" , JOptionPane.ERROR_MESSAGE);
//        }
        return false;  
    }
}
