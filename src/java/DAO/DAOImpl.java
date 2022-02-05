/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DAO;

import DBUtility.DBConnection;
import Model.Menu;
import Model.Order;
import Model.User;
import static java.lang.System.out;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author User
 */
public class DAOImpl implements DUser, DOrder, DMenu {

    Connection conn;
    PreparedStatement ps;
    ResultSet rs;

    //User DAO implementation
    @Override
    public void register(User u) {
        try {
            String SQL = "INSERT INTO user (username, name, email, password, isAdmin) values (?, ?, ?, ?, ?)";
            conn = DBConnection.openConnection();
            ps = conn.prepareStatement(SQL);
            ps.setString(1, u.getUserName());
            ps.setString(2, u.getName());
            ps.setString(3, u.getEmail());
            ps.setString(4, u.getPassword());
            ps.setBoolean(5, u.isIsAdmin());
            ps.executeUpdate();

        } catch (Exception ex) {
            ex.printStackTrace(out);
        }
    }

    @Override
    public User getUser(String un) {
        User u = new User();
        try {
            String SQL = "SELECT * FROM user WHERE email=?";
            conn = DBConnection.openConnection();
            ps = conn.prepareStatement(SQL);
            ps.setString(1, un);
            rs = ps.executeQuery();

            while (rs.next()) {
                u.setUserName(rs.getString("username"));
                u.setName(rs.getString("name"));
                u.setEmail(rs.getString("email"));
                u.setPassword(rs.getString("password"));
                u.setIsAdmin(rs.getBoolean("isAdmin"));
            }
        } catch (Exception ex) {
            ex.printStackTrace(out);
        }

        return u;
    }

    @Override
    public void updateUser(String un) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    //Order DAO implementation
    @Override
    public Order displayOrder() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void insertOrder(Menu m) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void deleteOrder(String fdn) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void updateOrder(String fdn) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    //Menu DAO implementation
    @Override
    public List<Menu> getAllMenu() {
        List<Menu> ul = new ArrayList<>();
        try{
            String SQL = "SELECT * FROM menu";
            conn = DBConnection.openConnection();
            ps = conn.prepareStatement(SQL);
            rs = ps.executeQuery();
            
            while(rs.next()){
                Menu u = new Menu();
                u.setMenuCode(rs.getInt("menuCode"));
                u.setFdName(rs.getString("fdName"));
                u.setPrice(rs.getDouble("price"));
                u.setCategory(rs.getInt("category"));
                ul.add(u);
            }
        }catch (Exception ex){
            ex.printStackTrace(out);
        }
        
        return ul;
    }

    @Override
    public Menu getMenu(int mcd) {
        Menu u = new Menu();
        try{
            String SQL = "SELECT * FROM Menu WHERE menuCode=?";
            conn = DBConnection.openConnection();
            ps = conn.prepareStatement(SQL);
            ps.setInt(1, mcd);
            rs = ps.executeQuery();
            
            while(rs.next()){
                u.setMenuCode(rs.getInt("menuCode"));
                u.setFdName(rs.getString("fdName"));
                u.setPrice(rs.getDouble("price"));
                u.setCategory(rs.getInt("category"));
            }
        }catch (Exception ex){
            ex.printStackTrace(out);
        }
        
        return u;
    }

    @Override
    public void insertMenu(Menu m) {
        try{
            String SQL = "INSERT INTO menu (menuCode, fdName, price, category) values (?, ?, ?, ?)";
            conn = DBConnection.openConnection();
            ps = conn.prepareStatement(SQL);
            ps.setInt(1, m.getMenuCode());
            ps.setString(2, m.getFdName());
            ps.setDouble(3, m.getPrice());
            ps.setInt(4, m.getCategory());
            ps.executeUpdate();
            
        }catch (Exception ex){
            ex.printStackTrace(out);
        }  
    }

    @Override
    public void deleteMenu(int mcd) {
        try{
            String SQL = "DELETE FROM menu WHERE menuCode=?";
            conn = DBConnection.openConnection();
            ps = conn.prepareStatement(SQL);
            ps.setInt(1, mcd);
            ps.executeUpdate();
            
        }catch (Exception ex){
            ex.printStackTrace(out);
        }
    }

    @Override
    public void updateMenu(int mcd, Menu m) {
        try{
            String SQL = "UPDATE menu SET fdName=?, price=?, category=? WHERE menuCode=?";
            conn = DBConnection.openConnection();
            ps = conn.prepareStatement(SQL);
            ps.setString(1, m.getFdName());
            ps.setDouble(2, m.getPrice());
            ps.setInt(3, m.getCategory());
            ps.setInt(4, mcd);
            ps.executeUpdate();
            
        }catch (Exception ex){
            ex.printStackTrace(out);
        }
    }

}
