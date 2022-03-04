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
import model.Attend;

/**
 *
 * @author Apple
 */
public class AttendDAO {

    public void deleteInAttend(String id) {
        try {
            String sql = "DELETE FROM [ATTENDANCE]\n"
                    + "      WHERE em_id = ?";

            //Mở kết nối
            Connection conn = new DBContext().getConnection();

            //Đưa câu lệnh sql vào prepare để chuẩn bị thực thi
            PreparedStatement ps = conn.prepareStatement(sql);
            ps.setString(1, id);

            //Thực thi và trả về kết quả
            ps.executeUpdate();

        } catch (Exception ex) {
            Logger.getLogger(EmployeeDAO.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    public void insertToAttend(Attend attend) {
        try {
            String sql = "INSERT INTO [ATTENDANCE]\n"
                    + "           ([em_id])\n"
                    + "     VALUES\n"
                    + "           (?)";

            //Mở kết nối
            Connection conn = new DBContext().getConnection();

            //Đưa câu lệnh sql vào prepare để chuẩn bị thực thi
            PreparedStatement ps = conn.prepareStatement(sql);
            ps.setString(1, attend.getId());
            
            //Thực thi và trả về kết quả
            ps.executeUpdate();

        } catch (Exception ex) {
            Logger.getLogger(AttendDAO.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

}
