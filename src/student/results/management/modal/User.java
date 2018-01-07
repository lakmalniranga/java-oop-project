/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package student.results.management.modal;

import java.sql.ResultSet;
import java.sql.SQLException;
import student.results.management.modal.Modal;

/**
 *
 * @author Lakmal
 */
public class User extends Modal{
    private final String[] schema = {"id", "name", "email", "username", "password"};

    public User() {
        super("user");
        super.setSchema(schema);
    }
    
    public ResultSet select(String[] columns) throws SQLException {
        return super.select(columns);
    }
    
    public ResultSet select(String[] columns, int limit) throws SQLException {
        return super.select(columns, limit);
    }
    
    public ResultSet selectAll() throws SQLException{
        return super.selectAll();
    }
    
    public int create(String columns[]) throws Exception {
        return super.create(columns);
    }
    
    public boolean delete(String value) throws SQLException {
        return super.delete(value);
    }
    
    public int update(int id, String name, String email, String username, String password) throws Exception {
        String sql = String.format("UPDATE user SET name = '%s', email = '%s', username = '%s' WHERE id = %d", name, email, username, id);
        return super.update(sql);
    }
}
