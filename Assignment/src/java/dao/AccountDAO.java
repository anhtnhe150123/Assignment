/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dao;

import context.DBContext;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import model.Account;

/**
 *
 * @author Apple
 */
public class AccountDAO {

    public Account login(String username, String password) {
        String query = "select * from account\n"
                + "where [username] = ?\n"
                + "and [password] = ?";
        try {
            Connection conn = new DBContext().getConnection();
            PreparedStatement ps = conn.prepareStatement(query);
            ps.setString(1, username);
            ps.setString(2, password);
            ResultSet rs = ps.executeQuery();

            while (rs.next()) {
                return new Account(rs.getInt(1), rs.getString(2), rs.getString(3), rs.getString(4));
            }
        } catch (Exception e) {
        }
        return null;
    }

    public Account checkAccountExist(String username) {
        String query = "select * from ACCOUNT\n"
                + "where username = ?";
        try {
            Connection conn = new DBContext().getConnection();
            PreparedStatement ps = conn.prepareStatement(query);
            ps.setString(1, username);
            ResultSet rs = ps.executeQuery();

            while (rs.next()) {
                return new Account(rs.getInt(1), rs.getString(2), rs.getString(3), rs.getString(4));
            }
        } catch (Exception e) {
        }
        return null;
    }

    public void signup(String username, String password) {
        String query = "insert into ACCOUNT\n"
                + "values(?, ?, 'EMPLOY')";
        try {
            Connection conn = new DBContext().getConnection();
            PreparedStatement ps = conn.prepareStatement(query);
            ps.setString(1, username);
            ps.setString(2, password);
            ps.executeUpdate();

        } catch (Exception e) {
        }
    }
}
