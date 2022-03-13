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
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import model.EndAttend;
import model.StartAttend;

/**
 *
 * @author Apple
 */
public class AttendDAO {

    public void insertInAttend(String userName, String startTime) {
        try {
            String sql = "INSERT INTO [AssignmentDB].[dbo].[STARTATTEN]\n"
                    + "           ([username]\n"
                    + "           ,[start_time]\n"
                    + "           ,[Date])\n"
                    + "     VALUES\n"
                    + "           (?,?, GETDATE())";

            //Mở kết nối
            Connection conn = new DBContext().getConnection();

            //Đưa câu lệnh sql vào prepare để chuẩn bị thực thi
            PreparedStatement ps = conn.prepareStatement(sql);
            ps.setString(1, userName);
            ps.setString(2, startTime);

            //Thực thi và trả về kết quả
            ps.executeUpdate();

        } catch (Exception ex) {
            Logger.getLogger(AttendDAO.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    public List<StartAttend> getAllAttendByUserName(String userName) {
        List<StartAttend> list = new ArrayList<>();
        try {
            String sql = "SELECT Top(1) * from STARTATTEN\n"
                    + "where username = ?\n"
                    + "ORDER BY id desc";
            Connection conn = new DBContext().getConnection();
            PreparedStatement ps = conn.prepareStatement(sql);
            ps.setString(1, userName);
            ResultSet rs = ps.executeQuery();
            while (rs.next()) {
                StartAttend attend = new StartAttend();
                attend.setId(rs.getInt(1));
                attend.setUserName(rs.getString(2));
                attend.setStartTime(rs.getString(3));
                attend.setDate(rs.getString(4));
                list.add(attend);
            }
        } catch (Exception ex) {
            Logger.getLogger(AttendDAO.class.getName()).log(Level.SEVERE, null, ex);
        }
        return list;
    }

    public void insertInAttend2(String userName, String endTime) {
        try {
            String sql = "INSERT INTO [AssignmentDB].[dbo].[ENDATTEN]\n"
                    + "           ([username]\n"
                    + "           ,[end_time]\n"
                    + "           ,[Date])\n"
                    + "     VALUES\n"
                    + "           (?,?,GETDATE())";

            //Mở kết nối
            Connection conn = new DBContext().getConnection();

            //Đưa câu lệnh sql vào prepare để chuẩn bị thực thi
            PreparedStatement ps = conn.prepareStatement(sql);
            ps.setString(1, userName);
            ps.setString(2, endTime);

            //Thực thi và trả về kết quả
            ps.executeUpdate();

        } catch (Exception ex) {
            Logger.getLogger(AttendDAO.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    public List<EndAttend> getAllAttendByUserName2(String userName) {
        List<EndAttend> list = new ArrayList<>();
        try {
            String sql = "SELECT Top(1) * from ENDATTEN\n"
                    + "where username = ?\n"
                    + "ORDER BY id desc";
            Connection conn = new DBContext().getConnection();
            PreparedStatement ps = conn.prepareStatement(sql);
            ps.setString(1, userName);
            ResultSet rs = ps.executeQuery();
            while (rs.next()) {
                EndAttend attend = new EndAttend();
                attend.setId(rs.getInt(1));
                attend.setUserName(rs.getString(2));
                attend.setEndTime(rs.getString(3));
                attend.setDate(rs.getString(4));
                list.add(attend);
            }
        } catch (Exception ex) {
            Logger.getLogger(AttendDAO.class.getName()).log(Level.SEVERE, null, ex);
        }
        return list;
    }

    public List<StartAttend> getAllAttendsByUserName(String userName) {
        List<StartAttend> list = new ArrayList<>();
        try {
            String sql = "SELECT * from STARTATTEN\n"
                    + "where username = ?\n"
                    + "ORDER BY id desc";
            Connection conn = new DBContext().getConnection();
            PreparedStatement ps = conn.prepareStatement(sql);
            ps.setString(1, userName);
            ResultSet rs = ps.executeQuery();
            while (rs.next()) {
                StartAttend attend = new StartAttend();
                attend.setId(rs.getInt(1));
                attend.setUserName(rs.getString(2));
                attend.setStartTime(rs.getString(3));
                attend.setDate(rs.getString(4));
                list.add(attend);
            }
        } catch (Exception ex) {
            Logger.getLogger(AttendDAO.class.getName()).log(Level.SEVERE, null, ex);
        }
        return list;
    }

}
