/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package student.results.management;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Arrays;
import java.util.logging.Level;
import java.util.logging.Logger;
import student.results.management.core.database.Insert;
import student.results.management.core.database.Query;
import student.results.management.modal.User;
import student.results.management.utils.Helper;



/**
 *
 * @author Lakmal
 */
public class App {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws Exception {
        String[] columns = {"name", "test"};
        String[] values = {"str:lakmal", "int:14", "int:15"};
        
      
        
                   
            User u = new User();
            int x = u.create(values);
////            
//            System.out.println(x);
//            String[] _columns = {"age", "name"};
//            
//            ResultSet rs = u.select(_columns, 1);
//            
//            if (rs.next()) {
//                int age  = rs.getInt("age");
//                String name = rs.getString("name");
//
//                System.out.println("age: " + age + "name: " + name);
//            }
            
//            while(rs.next()){
//                int id  = rs.getInt("age");
//                String name = rs.getString("name");
//                System.out.println("age: " + id + " " + name);
//            }
    }
    
}
