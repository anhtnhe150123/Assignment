/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dao;

import context.DBContext;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.util.logging.Level;
import java.util.logging.Logger;
import model.Atten;
import model.Attend;

/**
 *
 * @author Apple
 */
public class AttendDAO {

    public void insertInAttend(Attend attend) {
        try {
            String sql = "INSERT INTO [AssignmentDB].[dbo].[ATTEN]\n"
                    + "           ([username]\n"
                    + "           ,[start_time])\n"
                    + "     VALUES\n"
                    + "           (?,?)";

            //Mở kết nối
            Connection conn = new DBContext().getConnection();

            //Đưa câu lệnh sql vào prepare để chuẩn bị thực thi
            PreparedStatement ps = conn.prepareStatement(sql);
            ps.setString(1, attend.getUserName());
            ps.setString(2, attend.getStartTime());

            //Thực thi và trả về kết quả
            ps.executeUpdate();

        } catch (Exception ex) {
            Logger.getLogger(AttendDAO.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    public void insertInAttend2(Atten atten) {
        try {
            String sql = "INSERT INTO [AssignmentDB].[dbo].[ATTENND]\n"
                    + "           ([username]\n"
                    + "           ,[end_time])\n"
                    + "     VALUES\n"
                    + "           (?,?)";

            //Mở kết nối
            Connection conn = new DBContext().getConnection();

            //Đưa câu lệnh sql vào prepare để chuẩn bị thực thi
            PreparedStatement ps = conn.prepareStatement(sql);
            ps.setString(1, atten.getUserName());
            ps.setString(2, atten.getEndTime());

            //Thực thi và trả về kết quả
            ps.executeUpdate();

        } catch (Exception ex) {
            Logger.getLogger(AttendDAO.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

}
